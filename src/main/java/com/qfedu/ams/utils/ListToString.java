package com.qfedu.ams.utils;

import java.util.List;

public class ListToString {

    public static String create(List<Integer> list) {
        if (list.size() == 0) {
            return null;
        }
        StringBuilder result = new StringBuilder();

        boolean flag = false;
        for (Integer integer : list) {
            if (flag) {
                result.append(",");
            } else {
                flag = true;
            }
            result.append(integer);
        }
        return String.valueOf(result);
    }

}
