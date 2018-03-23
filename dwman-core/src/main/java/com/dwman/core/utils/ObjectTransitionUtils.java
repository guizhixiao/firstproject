package com.dwman.core.utils;

public class ObjectTransitionUtils {

    /**
     *   aYmmmW  ==> a_ymmm_w
     * @return
     */
    public static String upperToLowerLine(String msg ) {
        //将需要处理的数据转换成大写数据
        StringBuffer sb = new StringBuffer("");

        for (char c : msg.toCharArray()) {

            if (c >= 'A' && c <= 'Z') {
                sb.append("_").append((char) (c + 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String lowerToUpperLine(String msg){
        //将需要处理的数据转换成大写数据
        StringBuffer sb = new StringBuffer("");

        for (char c : msg.toCharArray()) {

            if (c >= 'a' && c <= 'z') {
                sb.append("_").append((char) (c - 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
