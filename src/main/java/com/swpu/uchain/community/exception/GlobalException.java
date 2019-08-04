package com.swpu.uchain.community.exception;

import com.swpu.uchain.community.enums.ResultEnum;
import lombok.Getter;

/**
 * @ClassName GlobalException
 * @Author hobo
 * @Date 19-4-22 下午8:31
 * @Description
 **/
@Getter
public class GlobalException extends RuntimeException {

    private ResultEnum resultEnum;

    public GlobalException(ResultEnum resultEnum) {
        super();
        this.resultEnum = resultEnum;
    }
}
