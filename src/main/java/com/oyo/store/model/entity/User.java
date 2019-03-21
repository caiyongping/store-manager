package com.oyo.store.model.entity;


import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;


@Data
@Entity
@Table(name = "oyo_user")
public class User {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer userId;		//用户id

    @Column(name="username")
    @NotEmpty(message="用户名不能为空")
    private String userName;	//登录用户名
    @Column(name="telphone")
    @NotEmpty(message="电话不能为空")
    private String userTel;		//用户电话

    private String password;	//用户密码

    private String pos;   //用户级别

//    public Integer getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getUserTel() {
//        return userTel;
//    }
//
//    public void setUserTel(String userTel) {
//        this.userTel = userTel;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getPos() {
//        return pos;
//    }
//
//    public void setPos(String pos) {
//        this.pos = pos;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "userId=" + userId +
//                ", userName='" + userName + '\'' +
//                ", userTel='" + userTel + '\'' +
//                ", password='" + password + '\'' +
//                ", pos='" + pos + '\'' +
//                '}';
//    }
}
