package com.SecurityDemo.SecutrityProjects.Controller;


import com.SecurityDemo.SecutrityProjects.Employee.Employee;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class HelloController {

    private List<Employee> emp = new ArrayList<>(List.of(new Employee(125, 25, "Riya")));

    @GetMapping("/")
    public String hello(){
        return "Hello welcome to Spring boot learning session!";
    }

    @GetMapping("id")
    public String getSessionId(HttpServletRequest hp){
        return "Session Id:" + hp.getSession().getId();
    }

    @GetMapping("/employee")
    public List<Employee> getEmployee(){
        return emp;
    }

    @PostMapping("/add")
    public Employee newEmployee(@RequestBody Employee e){
        emp.add(e);
        return e;
    }

    

    @GetMapping("/csrf")
    public CsrfToken getToken(HttpServletRequest req){
        return (CsrfToken) req.getAttribute("_csrf");
    }
}
