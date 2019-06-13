package com.elcusejungle.util;

import java.security.MessageDigest;

public class DigestUtils {

    private static final String DEFAULT_DIGITS =                    "0";
    private static final String FIRST_DEFAULT_DIGITS =              "1";

    /**
     * @param target    目标数字
     * @param length    需要补充到的位数, 补充默认数字[0], 第一位默认补充[1]
     * @return          补充后的结果
     */
    public static String makeUpNewData(String target, int length){
        return makeUpNewData(target, length, DEFAULT_DIGITS);
    }

    /**
     * @param target    目标数字
     * @param length    需要补充到的位数
     * @param add       需要补充的数字, 补充默认数字[0], 第一位默认补充[1]
     * @return          补充后的结果
     */
    public static String makeUpNewData(String target, int length, String add){
        if(target.startsWith("-")) target.replace("-", "");
        if(target.length() >= length) return target.substring(0, length);
        StringBuffer sb = new StringBuffer(FIRST_DEFAULT_DIGITS);
        for (int i = 0; i < length - (1 + target.length()); i++) {
            sb.append(add);
        }
        return sb.append(target).toString();
    }

    public static String randomDigitNumber(int length){
        int start = Integer.parseInt(makeUpNewData("", length));//1000+8999=9999
        int end = Integer.parseInt(makeUpNewData("", length + 1)) - start;//9000
        return (int)(Math.random() * end) + start + "";
    }

    public static int myRandom(){
        int ran2 = (int)Math.floor(Math.random()*10000);
        System.out.println(ran2);
        return ran2;
    }
    public static void main(String[] args) {
        System.out.println(DigestUtils.randomDigitNumber(8));
    }
}
