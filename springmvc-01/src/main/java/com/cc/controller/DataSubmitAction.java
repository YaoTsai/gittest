package com.cc.controller;

import com.cc.pojo.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DataSubmitAction {

    /**
     * 姓名:<input name="name" />
     * 年龄:<input name="age" />
     * @return
     */
    @RequestMapping("/one")
    public String one(String name,int age){
        System.out.println("姓名="+name+";年龄="+age);
        return "main";
    }

    /**
     * 姓名:<input name="uname" />
     * 年龄:<input name="uage" />
     * @return
     */
    @RequestMapping("/two")
    public String two(User user){
        System.out.println("人员信息："+user);
        return "main";
    }

    /**
    * <a href="${pageContext.request.contextPath}/three/张三/22.action">动态提交</a>
    * @return
    */
    @RequestMapping("/three/{name}/{age}")
    public String three(@PathVariable("name") String name, @PathVariable int age){
        System.out.println("姓名="+name+";年龄="+age);
        return "main";
    }

    /**
     * 姓名:<input name="name" /> <br>
     * 年龄:<input name="age" /> <br>
     * @return
     */
    @RequestMapping("/four")
    public String four(@RequestParam("name") String uname, @RequestParam("age")int uage){
        System.out.println("姓名="+uname+";年龄="+uage);
        return "main";
    }

    /**
     * 姓名:<input name="name" /> <br>
     * 年龄:<input name="age" /> <br>
     * @return
     */
    @RequestMapping("/five")
    public String five(HttpServletRequest request){
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println("姓名="+name+";年龄="+age);
        return "main";
    }

}
