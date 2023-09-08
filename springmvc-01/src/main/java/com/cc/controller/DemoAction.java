package com.cc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //叫给Spring去创建对象
public class DemoAction {

    /**
     * action中所有功能的实现都是由方法完成的
     * action方法的规范：
     *  1. 访问权限是public
     *  2. 返回值任意
     *  3. 方法名称任意
     *  4. 方法可以没有参数，也可以有任意类型的参数
     *  5. 要使用@RequestMapping注解来声明访问的路径
     */
    @RequestMapping("/demo")
    public String demo(){
        return "main";//可以直接跳转到/admin/main.jsp
    }

}
