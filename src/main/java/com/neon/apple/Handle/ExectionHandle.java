/*
 * 文件名：ExectionHandle.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：xiyan
 * 修改时间：2017年7月6日
 */

package com.neon.apple.Handle;

import org.hibernate.jdbc.Expectation;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.neon.apple.entity.Result;

public class ExectionHandle {
    
    @ExceptionHandler(value=Exception.class)
    private Result getHandle() {
        
    }
    
}