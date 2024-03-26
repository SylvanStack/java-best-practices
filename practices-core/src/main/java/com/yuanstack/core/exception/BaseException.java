package com.yuanstack.core.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * 自定义异常
 *
 * @author Sylvan
 * @date 2024/03/24  17:44
 */
@Getter
@Setter
public class BaseException extends RuntimeException {

    /**
     * 异常错误编码
     */
    private int code;

    /**
     * 异常信息
     */
    private String message;

    public BaseException(BaseExceptionTypeEnum exceptionType) {
        this.code = exceptionType.getCode();
        this.message = exceptionType.getDesc();
    }

    public BaseException(BaseExceptionTypeEnum exceptionType,
                         String message) {
        this.code = exceptionType.getCode();
        this.message = message;
    }
}
