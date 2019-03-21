package com.oyo.store.result;

 class CodeMsg {
     private int code;
     private String msg;


     public static CodeMsg SUCCESS = new CodeMsg(200,"success");
     public static CodeMsg ERROR = new CodeMsg(300,"error");

     private CodeMsg(int code,String msg){
         this.code= code;
         this.msg = msg;
     }

     public int getCode(){
         return code;
     }

     public String getMsg(){
         return msg;
     }
}
