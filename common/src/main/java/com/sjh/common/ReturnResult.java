package com.sjh.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @program:
 * @description:
 * @author: Shen jihao
 * @create: 2021/5/31 14:35
 */
@Data
public class ReturnResult {

    private Boolean success;

    private Integer code;

    private String message;

    private Map<String,Object> data=new HashMap<>();

    private ReturnResult(){
    }

    public static ReturnResult ok(){
        ReturnResult r=new ReturnResult();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS);
        r.setMessage("成功");
        return r;
    }

    public static ReturnResult error(){
        ReturnResult r=new ReturnResult();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMessage("失败");
        return r;
    }

    public ReturnResult success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public ReturnResult code(Integer code){
        this.setCode(code);
        return this;
    }

    public ReturnResult message(String message){
        this.setMessage(message);
        return this;
    }

    public ReturnResult data(String key,Object value){
        this.data.put(key,value);
        return this;
    }

    public ReturnResult data(Map<String,Object> map){
        this.setData(map);
        return this;
    }
}
