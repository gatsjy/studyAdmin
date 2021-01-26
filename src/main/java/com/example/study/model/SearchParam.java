package com.example.study.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Gatsjy
 * @since 2021-01-22
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */

@Data // 자동적으로 기본생성자와 getsetmethod를 만들어준다.
@AllArgsConstructor
public class SearchParam {

    private String account;
    private String email;
    private int page;
}

