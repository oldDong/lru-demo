LRU算法实现

    解读：Least Recently Used,最近最少使用
    
    选择：Java集合框架中的LinkedHashMap
    
    原理：LinkedHashMap，支持写入顺序排序和访问顺序排序，通过构造函数中的accessOrder选择，
    默认的accessOrder为false,表示按照写入顺序访问;当accessOrder=true时，表示按照访问顺序写入，正好和LRU的思路一致。
    如果要实现固定大小的缓存，必须重写removeEldestEntry()方法。
