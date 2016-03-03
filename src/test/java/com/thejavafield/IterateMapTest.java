package com.thejavafield;


import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class IterateMapTest {

    @Test
    public void beforeJava8() {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "v1");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    @Test
    public void java8() {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "v1");

        map.forEach((k, v) ->
                System.out.println(k + "=" + v));
    }

}
