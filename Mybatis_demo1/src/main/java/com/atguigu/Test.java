package com.atguigu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String detailStr = "[{\"order_no\":\"20051800000390\",\"sku\":\"2236191440\",\"num\":2}," +
                "{\"order_no\":\"20051800000390\",\"sku\":\"2236191448\",\"num\":2}," +
                "{\"order_no\":\"20051800000451\",\"sku\":\"2236191441\",\"num\":2}," +
                "{\"order_no\":\"20051800000451\",\"sku\":\"SKU003\",\"num\":2}," +
                "{\"order_no\":\"20051800000549\",\"sku\":\"2236191447\",\"num\":1}," +
                "{\"order_no\":\"20051800000549\",\"sku\":\"SKU002\",\"num\":1}," +
                "{\"order_no\":\"20051800000576\",\"sku\":\"2236191440\",\"num\":1}]";
        Pattern pattern1 = Pattern.compile("\\{\"order_no\":\"[0-9]+\",\"sku\":\"[0-9]*1448\",\"num\":[0-9]+\\}");
        Pattern pattern2 = Pattern.compile("\\{\"order_no\":\"\\d+\",\"sku\":\"[A-Za-z0-9]+\",\"num\":1\\}");
        Pattern pattern3 = Pattern.compile("\\{\"order_no\":\"\\d+576\",\"sku\":\"[A-Za-z0-9]+\",\"num\":1\\}");

        Matcher matcher = pattern1.matcher(detailStr);

        while (matcher.find()) {
            String match = matcher.group();
            System.out.println(match);
        }
    }
}
