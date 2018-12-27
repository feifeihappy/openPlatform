package io;

import java.io.*;

/**
 * @author zpf
 *    序列化
 *    1、什么是序列化与反序列化？
 *    　序列化：指把堆内存中的 Java 对象数据，
 *    通过某种方式把对象存储到磁盘文件中或者传递给其他网络节点（在网络上传输）。
 *    这个过程称为序列化。通俗来说就是将数据结构或对象转换成二进制串的过程
 *
 * 　　反序列化：把磁盘文件中的对象数据或者把网络节点上的对象数据，
 *     恢复成Java对象模型的过程。也就是将在序列化过程中所生成的二进制串转换成数据结构或者对象的过程
 *
 * @date 2018/12/26 14:47
 */
public class Serialize implements Serializable {

    public static void main(String[] args) {


        try {

            /**
             * 实现序列化
             */
            objectOutputStream();
            /**
             * 对象实现反序列化
             */
            objectInputStream();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void objectInputStream() throws IOException, ClassNotFoundException {
        InputStream in = new FileInputStream("d:\\494377\\Desktop\\"+File.separator+"学习java基础知识.txt");
        ObjectInputStream os = new ObjectInputStream(in);
        byte[] buffer = new byte[10];
        int len = -1;
        Person p = (Person) os.readObject();
        System.out.println(p);  //Person [name=vae, age=1]
        os.close();
    }

    private static void objectOutputStream() throws IOException {
        OutputStream op = new FileOutputStream("d:\\494377\\Desktop\\"+File.separator+"学习java基础知识.txt");
        ObjectOutputStream ops = new ObjectOutputStream(op);
        ops.writeObject(new Person("vae",1));

        ops.close();
    }

    public static class Person implements Serializable{
        private String name;
        private int age;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        @Override
        public String toString() {
            return "Person [name=" + name + ", age=" + age + "]";
        }
        public Person(String name, int age) {
            super();
            this.name = name;
            this.age = age;
        }
    }




}
