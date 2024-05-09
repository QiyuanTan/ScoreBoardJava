package com.cac.scoreboardjava.pojo;

import lombok.Data;

@Data
public class Response<T>{
    private int code;
    private String message;
    private T data;

    public Response(int code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> Response<T> success(T data){
        return new Response<T>(200, "success", data);
    }

    public static <T> Response<T> success(){
        return new Response<T>(200, "success", null);
    }

    public static <T> Response<T> error(int code, String message) {
        return new Response<T>(code, message, null);
   }

    @Override
    public String toString() {
        return STR."Response{code=\{code}, message='\{message}\{'\''}, data=\{data}\{'}'}";
    }
}