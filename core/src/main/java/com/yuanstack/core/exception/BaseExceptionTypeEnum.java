package com.yuanstack.core.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 自定义异常类型枚举
 *
 * @author Sylvan
 * @date 2024/03/24  17:46
 */
@Getter
@AllArgsConstructor
public enum BaseExceptionTypeEnum {
    USER_INPUT_ERROR(400, "您输入的数据错误或您没有权限访问资源！"),
    SYSTEM_ERROR(500, "系统出现异常，请您稍后再试或联系管理员！"),
    OTHER_ERROR(999, "系统出现未知异常，请联系管理员！");

    /**
     * 异常状体code
     */
    private final int code;

    /**
     * 异常类型中文描述
     */
    private final String desc;
}
