package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

/**
 * @author Gatsjy
 * @since 2021-01-22
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
@RestController
@RequestMapping("/api") // localhost:8080/api 주소와 매칭이 됩니다.
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod") // localhost:8080/api/getMethod 매핑
    public String getRequset(){
        return "Hi getMethod";
    }

    @GetMapping("/getParameter") // localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam(name="password") String pwd){
        String password = "bbbb";
        System.out.println("id = " + id + "password = " + pwd);
        return id+pwd;
    }

    // localhost:8080/api/getMultiParameter?account=abcd&email=study@gmail.com&page=10 -> 이렇게 줄줄이 들어온다면??
    // json 형태로 반환
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        // {"account" : "", "email" : "", "page" : 0}
        return searchParam;
    }
}
