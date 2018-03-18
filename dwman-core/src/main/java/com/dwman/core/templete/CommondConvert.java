package com.dwman.core.templete;

import org.apache.commons.lang3.StringUtils;

/**
 * 指令数据转换
 */
public class CommondConvert {

    //首字母大写
    private static final String CAP_UPPER_X = "[capX]";
    private static final String END_CAP_UPPER_X = "[/capX]";
    //首字母大写
    private static final String CAP_LOWER_X = "[capx]";
    private static final String END_CAP_LOWER_X = "[/capx]";

    //大写字母转换成小写和下划线
    private static final String UPPER_TO_LOWER_LINE = "[Utoxline]";
    private static final String END_UPPER_TO_LOWER_LINE = "[/Utoxline]";
    //大写字母转换成小写和下划线
    private static final String LOWER_TO_UPPER_LINE = "[utoXline]";
    private static final String END_LOWER_TO_UPPER_LINE = "[/utoXline]";

    /***
     *  指令转换集合
     * @return
     */
    public static String commondConvertCollection(String msg) {
        msg = capU(msg);
        msg = capu(msg);
        msg = upperToLowerAndLine(msg);
        return lowerToUpperAndLine(msg);
    }


    /**
     * 首字母转换成大写  afadfljl[capX]upper[/capX]   ==> afadfljlUpper
     *
     * @return
     */
    private static String capU(String msg) {
        String retMsg = "";

        if (StringUtils.isNotEmpty(msg) && msg.contains(CAP_UPPER_X) && msg.contains(END_CAP_UPPER_X)) {
            String dealMsg = msg.substring(msg.indexOf(CAP_UPPER_X) + CAP_UPPER_X.length(), msg.indexOf(END_CAP_UPPER_X));
            //将需要处理的数据转换成大写数据
            retMsg = msg.replace(CAP_UPPER_X + dealMsg + END_CAP_UPPER_X, StringUtils.capitalize(dealMsg));
            return capU(retMsg);
        } else {

            return msg;
        }

    }

    /**
     * 首字母转换成小写  afadfljl[capx]PPper[/capx] ==> afadfljlpPper
     *
     * @return
     */
    private static String capu(String msg) {

        String retMsg = "";

        if (StringUtils.isNotEmpty(msg) && msg.contains(CAP_LOWER_X) && msg.contains(END_CAP_LOWER_X)) {
            String dealMsg = msg.substring(msg.indexOf(CAP_LOWER_X) + CAP_LOWER_X.length(), msg.indexOf(END_CAP_LOWER_X));
            //将需要处理的数据转换成大写数据
            retMsg = msg.replace(CAP_LOWER_X + dealMsg + END_CAP_LOWER_X, StringUtils.uncapitalize(dealMsg));

            return capu(retMsg);
        } else {

            return msg;
        }
    }

    /**
     * 大写转换成小写和下划线  afadfljl[Utoxline]PPper[/Utoxline]fljl[Utoxline]AAAaaaaaPPper[/Utoxline]  ==> afadfljl_p_pperfljl_a_a_aaaaaa_p_pper
     *
     * @return
     */
    private static String upperToLowerAndLine(String msg) {
        String retMsg = "";

        if (StringUtils.isNotEmpty(msg) && msg.contains(UPPER_TO_LOWER_LINE) && msg.contains(END_UPPER_TO_LOWER_LINE)) {
            String dealMsg = msg.substring(msg.indexOf(UPPER_TO_LOWER_LINE) + UPPER_TO_LOWER_LINE.length(), msg.indexOf(END_UPPER_TO_LOWER_LINE));
            //将需要处理的数据转换成大写数据
            StringBuffer sb = new StringBuffer("");

            for (char c : dealMsg.toCharArray()) {

                if (c >= 'A' && c <= 'Z') {
                    sb.append("_").append((char) (c + 32));
                } else {
                    sb.append(c);
                }
            }
            retMsg = msg.replace(UPPER_TO_LOWER_LINE + dealMsg + END_UPPER_TO_LOWER_LINE, sb.toString());

            return upperToLowerAndLine(retMsg);
        } else {

            return msg;
        }
    }

    /**
     * 小写转换成大写和下划线  afadfljl[utoXline]PPper[/utoXline]fljl[utoXline]AAAaaaaaPPper[/utoXline] ==> afadfljlPP_P_E_RfljlAAA_A_A_A_A_APP_P_E_R
     *
     * @return
     */
    private static String lowerToUpperAndLine(String msg) {
        String retMsg = "";

        if (StringUtils.isNotEmpty(msg) && msg.contains(LOWER_TO_UPPER_LINE) && msg.contains(END_LOWER_TO_UPPER_LINE)) {
            String dealMsg = msg.substring(msg.indexOf(LOWER_TO_UPPER_LINE) + LOWER_TO_UPPER_LINE.length(), msg.indexOf(END_LOWER_TO_UPPER_LINE));
            //将需要处理的数据转换成大写数据
            StringBuffer sb = new StringBuffer("");

            for (char c : dealMsg.toCharArray()) {

                if (c >= 'a' && c <= 'z') {
                    sb.append("_").append((char) (c - 32));
                } else {
                    sb.append(c);
                }
            }
            retMsg = msg.replace(LOWER_TO_UPPER_LINE + dealMsg + END_LOWER_TO_UPPER_LINE, sb.toString());

            return lowerToUpperAndLine(retMsg);
        } else {

            return msg;
        }
    }

}
