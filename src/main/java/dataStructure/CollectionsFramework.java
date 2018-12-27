package dataStructure;

import java.util.*;

/**
 * @author zpf
 * @date 2018/12/24 17:31
 *
 *  集合框架/数据结构：
 *  菜鸟教程：
 *  http://www.runoob.com/java/java-collections.html
 *
 *  Java数据结构和算法（一）——简介
 * https://www.cnblogs.com/ysocean/p/7889153.html
 */
public class CollectionsFramework {

    public static void main(String[] args) {

        /**
         * @Author zpf
         * @Description //  数据结构
         * @Date 11:14 2018/12/25
         * @Param [args]
         * @return void
         **/
        dataStructure();
        /**
         * @Author zpf
         * @Description // 冒泡排序
         * @Date 14:28 2018/12/25
         * @Param [args]
         * @return void
         **/
        sort();

        /**
         * @Author zpf
         * @Description //栈的基本概念
         * https://www.cnblogs.com/ysocean/p/7911910.html
         * @Date 14:44 2018/12/25
         * @Param [args]
         * @return void
         **/
        stack();


    }

    private static void stack() {
        Stack stack = new Stack();
        String str = "--how are you";
        char[] cha = str.toCharArray();
        for(char c : cha){
            stack.push(c);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }

    private static void sort() {
        int[] array = {4,2,8,9,5,7,6,1,3};
        //未排序数组顺序为
        System.out.println("未排序数组顺序为：");
        display(array);
        System.out.println("-----------------------");
        array = sort(array);
        System.out.println("-----------------------");
        System.out.println("经过冒泡排序后的数组顺序为：");
        display(array);
    }

    private static void dataStructure() {
        List<String> linkedList = new LinkedList<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }

        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();


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


        //声明数组1,声明一个长度为3，只能存放int类型的数组
        int [] myArray = new int[3];
        //声明数组2,声明一个数组元素为 1,2,3的int类型数组
        int [] myArray2 = {1,2,3};
        //给myArray第一个元素赋值1
        myArray[0] = 1;
        //访问myArray的第一个元素
        System.out.println(myArray[0]);
        //声明数组2,声明一个数组元素为 1,2,3的int类型数组
        for(int i = 0 ; i < myArray2.length ; i++){
            System.out.println(myArray2[i]);
        }
    }


    public static int[] sort(int[] array){
        //这里for循环表示总共需要比较多少轮
        for(int i = 1 ; i < array.length; i++){
            //设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
            boolean flag = true;
            //这里for循环表示每轮比较参与的元素下标
            //对当前无序区间array[0......length-i]进行排序
            //j的范围很关键，这个范围是在逐步缩小的,因为每轮比较都会将最大的放在右边
            for(int j = 0 ; j < array.length-i ; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
            //第 i轮排序的结果为
            System.out.print("第"+i+"轮排序后的结果为:");
            display(array);

        }
        return array;

    }

    //遍历显示数组
    public static void display(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }



}
