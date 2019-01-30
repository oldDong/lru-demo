package com.dongzj.cache;

import org.junit.Test;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/30
 * Time: 11:44
 */
public class LRUMapTest {

    @Test
    public void testPut() {
        LRUMap<Integer, Integer> map = new LRUMap<>(5);
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        map.put(4,4);
        map.put(5,5);

        //按照插入顺序输出
        map.forEach((k,v) -> System.out.println("key:" + k + " value: " + v));
        System.out.println();

        //超过容量时，删除最先插入的数据
        map.put(6,6);
        map.forEach((k,v) -> System.out.println("key:" + k + " value: " + v));
        System.out.println();

        //访问某个元素后，该元素被移动到最后
        map.get(5);
        map.forEach((k,v) -> System.out.println("key:" + k + " value: " + v));

    }

}