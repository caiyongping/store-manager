package com.oyo.store.model.entity;


import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import java.io.Serializable;

@Getter
@Setter
@ComponentScan
@EntityScan
public class StoreManager implements Serializable {

    /**
     * id
     */

    private static Integer id;
    /**
     * 货物编号
     */
    private static Integer goodsId;
    /**
     * 货物名称
     */
    private static String goodsName;
    /**
     * 操作员姓名
     */
    private static String name;
    /**
     * 货物存入地址
     */
    private static String address;
    /**
     * 货物是否耐高温1不耐高温；2耐高温
     */
    @NonNull
    private static Integer isHot;
    /**
     * 原有库存
     */
    private static Integer OriStock;
    /**
     * 入库数量
     */
    private static Integer inputStock;
    /**
     * 出库数量
     */
    private static Integer outputStock;
    /**
     * 现在库存
     */
    private static Integer nowStock;
    /**
     * 提醒类型：1-不提醒 2-加库存 3-减库存 4-库存充沛
     */
    private static Integer remindStyle;

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        StoreManager.id = id;
    }

    public static Integer getGoodsId() {
        return goodsId;
    }

    public static void setGoodsId(Integer goodsId) {
        StoreManager.goodsId = goodsId;
    }

    public static String getGoodsName() {
        return goodsName;
    }

    public static void setGoodsName(String goodsName) {
        StoreManager.goodsName = goodsName;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        StoreManager.name = name;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        StoreManager.address = address;
    }

    public static Integer getIsHot() {
        return isHot;
    }

    public static void setIsHot(Integer isHot) {
        StoreManager.isHot = isHot;
    }

    public static Integer getOriStock() {
        return OriStock;
    }

    public static void setOriStock(Integer oriStock) {
        OriStock = oriStock;
    }

    public static Integer getInputStock() {
        return inputStock;
    }

    public static void setInputStock(Integer inputStock) {
        StoreManager.inputStock = inputStock;
    }

    public static Integer getOutputStock() {
        return outputStock;
    }

    public static void setOutputStock(Integer outputStock) {
        StoreManager.outputStock = outputStock;
    }

    public static Integer getNowStock() {
        return nowStock;
    }

    public static void setNowStock(Integer nowStock) {
        StoreManager.nowStock = nowStock;
    }

    public static Integer getRemindStyle() {
        return remindStyle;
    }

    public static void setRemindStyle(Integer remindStyle) {
        StoreManager.remindStyle = remindStyle;
    }
}
