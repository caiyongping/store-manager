package com.oyo.store.result;


public final class Result<T> {

    private int code;
    private String msg;
    private T data;

    /**
     * 成功
     * @param data
     * @param <T>
     * @return
     */
    private static <T> Result<T> success(T data){
             Result<T> r = new Result<T>(CodeMsg.SUCCESS);
             r.data=data;
             return  r;
    }
    private static <T> Result<T>error(T data){
        Result<T> r = new Result<T>(CodeMsg.ERROR);
        r.data = data;
        return r;
    }

    private Result(T data){
        this.data = data;
    }

    private Result(CodeMsg codeMsg){
        this.code = codeMsg.getCode();
        this.msg = codeMsg.getMsg();
    }
     public int getCode(){
        return code;
     }
     public String getMsg(){
        return msg;
     }

     public T getData(){
        return data;
     }

}
