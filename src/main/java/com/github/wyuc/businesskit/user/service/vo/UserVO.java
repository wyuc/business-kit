package com.github.wyuc.businesskit.user.service.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserVO implements Serializable {
    private String userId;
    private String userName;
}
