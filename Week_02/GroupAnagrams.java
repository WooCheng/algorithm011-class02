package com.alibaba.array;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams.groupAnagrams(strs);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> resultMap = new HashMap<String, List<String>>();
        for (int i = 0; i < strs.length; i++) {
            char[] keyChar = strs[i].toCharArray();
            Arrays.sort(keyChar);//统一key
            String key = String.valueOf(keyChar);
            if(!resultMap.containsKey(key)){//当没有key时创建容器
                List<String> strList = new ArrayList<String>();
                resultMap.put(key,strList);
            }
            resultMap.get(key).add(strs[i]);//找到key容器放入value
        }
        return new ArrayList<List<String>>(resultMap.values());
    }

}
