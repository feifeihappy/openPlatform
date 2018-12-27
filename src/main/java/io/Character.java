package io;

import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.Properties;

/**
 * @author zpf
 *
 * 字符流/字节流
 * @date 2018/12/26 9:48
 *
 * ①、为什么要使用字符流？
 *
 * 因为使用字节流操作汉字或特殊符号语言的时候容易乱码，
 * 因为汉字不止一个字节，为了解决这个问题，建议使用字符流。
 *
 */
public class Character {
    public static void main(String[] args) {
        try {

            /**
             * 字符输出流
             */
            writer();
            /**
             * 字符输入流
             */
            reader();
            /**
             * 字节输出流
             */
            outputStream();
            /**
             * 字节输入流
             */
            inputStream();

            /**
             * 字节缓冲输出/输入流
             */
            bufferedOutputStream();

            /**
             *  获取资源文件
             *  文件-----程序
             *  通过输入流装载到--Properties 对象。
             *
             *  通过key 取到value
             *
             */
            properties();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void properties() throws IOException {
        Properties prop = new Properties();//属性集合对象
        InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("test.properties");
//            URL url = Thread.currentThread().getContextClassLoader().getResource("test.properties");
//            System.out.println("文件路径："+url);
        prop.load(stream);//将属性文件流装载到Properties对象中

        System.out.println("获取属性值：" + prop.getProperty("test.file"));
    }

    private static void bufferedOutputStream() throws IOException {
        //字节缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("d:\\494377\\Desktop\\"+File.separator+"学习java基础知识.txt"));
        //定义一个字节数组，用来存储数据
        byte[] buffers = new byte[1024];
        int len = -1;//定义一个整数，表示读取的字节数
        while((len=bis.read(buffers))!=-1){
            System.out.println(new String(buffers,0,len));
        }
        //关闭流资源
        bis.close();

        //字节缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("d:\\494377\\Desktop\\"+File.separator+"学习java基础知识.txt"));
        bos.write("123".getBytes());
        bos.close();
    }

    private static void inputStream() throws IOException {
        //1、创建目标对象，输入流表示那个文件的数据保存到程序中。不写盘符，默认该文件是在该项目的根目录下
        //a.txt 保存的文件内容为：AAaBCDEF
        File target = new File("d:\\494377\\Desktop\\"+File.separator+"学习java基础知识.txt");
        //2、创建输入流对象
        InputStream in = new FileInputStream(target);
        //3、具体的 IO 操作（读取 a.txt 文件中的数据到程序中）
        /**
         * 注意：读取文件中的数据，读到最后没有数据时，返回-1
         *  int read():读取一个字节，返回读取的字节
         *  int read(byte[] b):读取多个字节,并保存到数组 b 中，从数组 b 的索引为 0 的位置开始存储，返回读取了几个字节
         *  int read(byte[] b,int off,int len):读取多个字节，并存储到数组 b 中，从数组b 的索引为 0 的位置开始，长度为len个字节
         */

        //int read(byte[] b):读取多个字节保存到数组b 中
        byte[] buffer  = new byte[100];

        //int read(byte[] b,int off,int len):读取多个字节，并存储到数组 b 中,从索引 off 开始到 len
        in.read(buffer, 0, 100);
//            System.out.println(Arrays.toString(buffer)); //[65, 97, 66, 0, 0, 0, 0, 0, 0, 0]
        System.out.println(new String(buffer)); //AaB[][][][][][][]
        //4、关闭流资源
        in.close();





    }

    private static void outputStream() throws IOException {
        //1、创建目标对象，输出流表示把数据保存到哪个文件。不写盘符，默认该文件是在该项目的根目录下
        File target = new File("d:\\494377\\Desktop\\"+File.separator+"学习java基础知识.txt");
        //2、创建文件的字节输出流对象,第二个参数是 Boolean 类型，true 表示后面写入的文件追加到数据后面，false 表示覆盖
        OutputStream out = new FileOutputStream(target,true);
        //3、具体的 IO 操作(将数据写入到文件 a.txt 中)
        /**
         * void write(int b):把一个字节写入到文件中
         * void write(byte[] b):把数组b 中的所有字节写入到文件中
         * void write(byte[] b,int off,int len):把数组b 中的从 off 索引开始的 len 个字节写入到文件中
         */
//            out.write(65); //将 A 写入到文件中
//            out.write("Aa".getBytes()); //将 Aa 写入到文件中
//            out.write("ABCDEFG".getBytes(), 1, 5); //将 BCDEF 写入到文件中
        //经过上面的操作，a.txt 文件中数据为 AAaBCDEF
        out.write("字节输出流".getBytes());
        //4、关闭流资源
        out.close();
        System.out.println(target.getAbsolutePath());
    }

    private static void reader() throws IOException {
        //1、创建源
        File srcFile = new File("d:\\494377\\Desktop\\"+File.separator+"学习java基础知识.txt");
        //2、创建字符输出流对象
        Reader in = new FileReader(srcFile);
        //3、具体的 IO 操作
        /***
         * int read():每次读取一个字符，读到最后返回 -1
         * int read(char[] buffer):将字符读进字符数组,返回结果为读取的字符数
         * int read(char[] buffer,int off,int len):将读取的字符存储进字符数组 buffer，
         * 返回结果为读取的字符数，从索引 off 开始，长度为 len
         *
         */
        //int read():每次读取一个字符，读到最后返回 -1
        int len = -1;//定义当前读取字符的数量
        while((len = in.read())!=-1){
            //打印 a.txt 文件中所有内容
            System.out.print((char)len);
        }

        //4、关闭流资源
        in.close();
    }

    private static void writer() throws IOException {

        //1、创建源
        File srcFile = new File("d:\\494377\\Desktop\\"+File.separator+"学习java基础知识.txt");
        //2、创建字符输出流对象
        Writer out = new FileWriter(srcFile);

        //3、具体的 IO 操作
        /***
         * void write(int c):向外写出一个字符
         * void write(char[] buffer):向外写出多个字符 buffer
         * void write(char[] buffer,int off,int len):把 buffer 数组中从索引 off 开始到 len个长度的数据写出去
         * void write(String str):向外写出一个字符串
         */
        /*** //void write(int c):向外写出一个字符
        out.write(65);//将 A 写入 a.txt 文件中
        //void write(char[] buffer):向外写出多个字符 buffer
        out.write("Aa帅锅".toCharArray());//将 Aa帅锅 写入 a.txt 文件中
        //void write(char[] buffer,int off,int len)
        out.write("Aa帅锅".toCharArray(),0,2);//将 Aa 写入a.txt文件中
        //void write(String str):向外写出一个字符串
        out.write("Aa帅锅");//将 Aa帅锅 写入 a.txt 文件中

        //4、关闭流资源

         * 注意如果这里有一个 缓冲的概念，如果写入文件的数据没有达到缓冲的数组长度，那么数据是不会写入到文件中的
         * 解决办法：手动刷新缓冲区 flush()
         * 或者直接调用 close() 方法，这个方法会默认刷新缓冲区
         */
        out.write("学习java基础知识，字符流/字节流的概念，以及使用");
        out.flush();
        out.close();




    }


}
