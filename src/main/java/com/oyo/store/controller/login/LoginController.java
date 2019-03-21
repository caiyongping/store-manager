package com.oyo.store.controller.login;


import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Objects;
import java.util.Random;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oyo.store.model.dao.UserDao;
import com.oyo.store.model.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;





@Controller
@RequestMapping("/")
public class LoginController {


    @Autowired
    private UserDao userDao;

    public static final String CAPTCHA_KEY = "session_captcha";

    private Random rnd = new Random();

    /**
     * 登录界面的显示
     * @return
     */
    @RequestMapping(value="logins",method=RequestMethod.GET)
    public String login(){
        return "login/login";
    }

    /**
     * 退出
     * @param session
     * @return
     */
    @RequestMapping("loginout")
    public String loginout(HttpSession session){
        session.removeAttribute("userId");
        return "redirect:/logins";
    }

         /**
           *   登录检查，可以通过用户名或tel加上密码进行登录
           *
          */
         @RequestMapping(value = "logins",method = RequestMethod.POST)
         public String checkLogin(HttpSession session, HttpServletRequest req, Model model) throws UnknownHostException {
             String userName = req.getParameter("userName").trim();
             String password = req.getParameter("password");
             String code = req.getParameter("code").toLowerCase();
             String sessionCode = (String)req.getSession().getAttribute(CAPTCHA_KEY);
             model.addAttribute("userName",userName);
             if(!code.equals(sessionCode.toLowerCase())){
          //   System.out.print("用户验证码错误！");
             model.addAttribute("errormsg","用户验证码错误！");
             req.setAttribute("errormsg","用户验证码错误!");
             return "/login/login";

             }
             /**
              * 将用户名分开查找，通过用户名和电话号码都可以
              *
              */
            User user =userDao.findOneUser(userName,password);
            if(Objects.isNull(user)){
            //  System.out.println(user);
             // System.out.println("账号或密码错误");
              model.addAttribute("errormess", "账号或密码错误!");
              return "login/login";
            }
            Object sessionId = session.getAttribute("userId");
          //  System.out.println(user);
            if(sessionId==user.getUserId()){
        //    System.out.println("当前用户已经登录，请不要重复登录；");
            model.addAttribute("hasmess", "当前用户已经登录了；不能重复登录");
            session.setAttribute("thisuser",user);
            return "login/login";
            }else {
            session.setAttribute("userId",user.getUserId());
            }
             return "redirect:/index/index";
         }


    /**
     * 验证码显示部分
     * @param request
     * @param response
     * @param session
     * @throws IOException
     */
    @RequestMapping("captcha")
    public void captcha(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");

        // 生成随机字串
        String verifyCode = VerifyCodeUtils.generateVerifyCode(4);

        // 生成图片
        int w = 135, h = 40;
        VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode);

        // 将验证码存储在session以便登录时校验
        session.setAttribute(CAPTCHA_KEY, verifyCode.toLowerCase());
    }

}
