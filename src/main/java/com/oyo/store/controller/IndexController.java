package com.oyo.store.controller;

import com.oyo.store.model.dao.UserDao;
import com.oyo.store.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/")
public class IndexController {

    @Autowired
    private UserDao userDao;

    DefaultConversionService service = new DefaultConversionService();

    @RequestMapping(value = "index")
    public String index(HttpServletRequest req, Model model){
        HttpSession session = req.getSession();
        if(StringUtils.isEmpty(session.getAttribute("userId"))){
        return "/login/login";
        }
        Integer userId = Integer.parseInt(session.getAttribute("userId")+"");
       // User user = userDao.findById(userId);

        //返回首页
        return "index/index";
    }


}
