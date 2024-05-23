package com.cac.scoreboardjava.pojo;

import lombok.Data;

@Data
public class Response<T>{
    private boolean success;
    private String message;
    private T data;

    public Response(boolean success, String message, T data){
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public static <T> Response<T> success(T data){
        return new Response<>(true, "success", data);
    }

    public static <T> Response<T> success(){
        return new Response<>(true, "success", null);
    }

    public static <T> Response<T> error(String message) {
        return new Response<>(false, message, null);
   }

    @Override
    public String toString() {
        return STR."Response{success=\{success}, message='\{message}\{'\''}, data=\{data}\{'}'}";
    }
}