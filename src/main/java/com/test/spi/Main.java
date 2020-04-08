package com.test.spi;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @ClassName:com.test.spi.Main
 * @Description:
 * @Author: yuzp
 * @Date: 2020/3/20
 */
public class Main {

    public static void main(String[] args) {

        ResourceBundle bundle = ResourceBundle.getBundle("common",Locale.getDefault());

        bundle = ResourceBundle.getBundle("common",Locale.JAPAN);

        String me = MessageFormat.format(bundle.getString("ParameterIsNull"), "receiptEnum");

        System.out.println(me);
        System.gc();
    }
}
