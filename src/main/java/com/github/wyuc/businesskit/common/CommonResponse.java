package com.github.wyuc.businesskit.common;

import com.github.wyuc.businesskit.common.constant.CommonConstants;
import lombok.Data;

@Data
public class CommonResponse<T> {
    private String code;
    private String msg;
    private T body;

    public static <T> CommonResponse<T> success(String msg, T body) {
        CommonResponse<T> commonResponse = new CommonResponse<>();
        commonResponse.setCode(CommonConstants.RESPONSE_SUCCESS_CODE);
        commonResponse.setMsg(msg);
        commonResponse.setBody(body);
        return commonResponse;
    }
}
