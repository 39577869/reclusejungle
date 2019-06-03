package com.elcusejungle.utils;

import java.util.HashMap;
import java.util.List;

public class LayuiUtil extends HashMap<String, Object> {

    public static LayuiUtil data(Long count, List<?> data){
        LayuiUtil r = new LayuiUtil();
        r.put("msg", "");
        r.put("code", 0);
        r.put("count", count);
        r.put("data", data);
        return r;
    }

    public static LayuiUtil data(List<?> data){
        LayuiUtil r = new LayuiUtil();
        r.put("msg", "");
        r.put("code", 0);
        r.put("count", "");
        r.put("data", data);
        return r;
    }
}
