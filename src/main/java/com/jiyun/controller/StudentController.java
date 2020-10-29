package com.jiyun.controller;


import com.github.pagehelper.PageInfo;
import com.jiyun.pojo.StuVo;
import com.jiyun.pojo.Student;
import com.jiyun.pojo.User;
import com.jiyun.service.StudentService;
import com.jiyun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/stu")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private UserService userService;
    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
    }

    @RequestMapping("/show")
    public String show(Model model, StuVo student,
                       @RequestParam(required = true,defaultValue = "1")Integer pageNum,
                       @RequestParam(required = true,defaultValue = "2")Integer pageSize
                       ){
        PageInfo<StuVo> pb = studentService.showall(student, pageNum, pageSize);
        model.addAttribute("pb",pb);
        model.addAttribute("stu",student);
        return "show";
    }
    @RequestMapping("/showid")
    public String showid(int sid,Model model){
        Student student=studentService.showid(sid);
        model.addAttribute("s",student);
        return "update";
    }
    @RequestMapping("/toadd")
    public String toadd(Student student){
          studentService.add(student);
        return "redirect:/stu/show";
    }
    @RequestMapping("/update")
    public String update(Student student){
        studentService.update(student);
        return "redirect:/stu/show";
    }
    @RequestMapping("/showname")
    @ResponseBody
    public String showname(String uname){
        User user=userService.showname(uname);
        if (user==null){
            return "ok";
        }
        return "no";
    }

    @RequestMapping("/toodl")
    public String toodl(User user, Model model, HttpServletRequest request){
        String uname = user.getUname();
        User u=userService.showname(uname);
            if(u!=null){
                String upwd = user.getUpwd();
                User u1=userService.showupwd(upwd);
                if(u1!=null){
                        request.getSession().setAttribute("user",user);
                        return "redirect:/stu/show";
                }else{
                    model.addAttribute("arr","密码错误");
                    return "dl";
                }
            }
                model.addAttribute("err","用户名错误");
                return "dl";
    }

    @RequestMapping("/addUser")
    public String addUser(User user){
        userService.addUser(user);
        return "dl";
    }

    @RequestMapping("/delete")
    public String delete(int sid){
        studentService.delete(sid);
        return "redirect:/stu/show";
    }

    @RequestMapping("/aaa")
    @ResponseBody
    public String aaa(int sid){
        System.out.println("哈哈哈哈");
        System.out.println("哈哈哈哈");
        return "哈哈哈哈";
    }
}
