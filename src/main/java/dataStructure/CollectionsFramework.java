package dataStructure;

import java.util.*;

/**
 * @author zpf
 * @date 2018/12/24 17:31
 *
 *  集合框架/数据结构：http://www.runoob.com/java/java-collections.html
 *
 *  https://gitbook.cn/books/5a49dabf1f2e8d585e45f154/index.html
 */
public class CollectionsFramework {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }

        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();


        List<String> linkedList = new LinkedList<>();

        Vector  vector =new Vector<>();


        Map<String, String> map = new HashMap<>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");
        map.keySet();
        map.entrySet();
        //第一种：普遍使用，二次取值
        System.out.println("通过Map.keySet遍历key和value：");
        for (String key : map.keySet()) {
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }
        //第二种
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第三种：推荐，尤其是容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第四种
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : map.values()) {
            System.out.println("value= " + v);
        }







    }


}
