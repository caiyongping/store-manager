package com.oyo.store.result;

import java.util.Map;


public class UtilReturn {
    public static final String SUCCESS_CODE = "200";

    public static final String SUCCESS_STATUS = "success";

    public static final String SUCCESS_MESSAGE = "成功";

    public static final String ERROR_CODE = "503";

    public static final String ERROR_STATUS = "error";


    /**
     * 成功信息返回
     *
     * @param message
     * @param code
     * @param data
     * @return
     */
    public static Map resSuccesssMap(String message, String code, Object data) {
        Map resMap = UtilMisc.toMap();
        resMap.put("status", SUCCESS_STATUS);
        resMap.put("message", message);
        resMap.put("resCode", code);
        if (null != data) {
            resMap.put("data", data);
        }

        return resMap;
    }

    /**
     * 出错信息返回
     *
     * @param message
     * @param code
     * @return
     */
    public static Map resErrorMap(String message, String code) {
        Map resMap = UtilMisc.toMap();
        resMap.put("status", ERROR_STATUS);
        resMap.put("message", message);
        resMap.put("resCode", code);

        return resMap;
    }
}
