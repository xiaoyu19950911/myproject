package com.fc.test.request.sys;

import lombok.Data;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-08 16:45
 */
@Data
public class RegisterRequest {

    private String username;

    private String password;

    private String checkPassword;

    private String name;

    private String email;
}
