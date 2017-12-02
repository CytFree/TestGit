package com.test.enums;

import org.apache.cxf.common.util.StringUtils;

/**
 * @author CaoYangTao
 * @date 2017年12月02日 13:02
 * @desc 状态枚举
 */
public enum StatusEnum {
    /**
     * 通过
     */
    PASS("1", "通过"),
    /**
     * 失败
     */
    FAIL("1", "失败");

    final String code;
    final String name;

    StatusEnum(String code, String name){
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static StatusEnum getEnumByCode(String code){
        if(StringUtils.isEmpty(code)){
            return null;
        }
        for(StatusEnum statusEnum : StatusEnum.values()){
            if(statusEnum.getCode().equals(code)){
                return statusEnum;
            }
        }
        return null;
    }
}
