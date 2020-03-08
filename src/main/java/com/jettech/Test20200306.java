package com.jettech;

import java.util.HashMap;
import java.util.Map;

public class Test20200306 {
    public static void main(String[] args) {
        Map<String,Object> map1 = new HashMap<String,Object>();
        Map<String,String> headerMap = new HashMap<String,String>();
        map1.put("1","1");
        headerMap.put("2","2");
        map1.put("headerMap",headerMap);
        Map sendData = (Map) map1.remove("headerMap");
        System.out.println(sendData);
    }




}
