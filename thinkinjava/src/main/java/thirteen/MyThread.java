package thirteen;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class Foo {
    private int x = 100;

    public int getX() {
        return x;
    }

    public int fix(int y) {
        x = x - y;
        return x;
    }
}


class MyRunnable implements Runnable {
    private Foo foo = new Foo();

    public static void main(String[] args) {
//        MyRunnable r = new MyRunnable();
//        Thread ta = new Thread(r, "Thread-A");
//        Thread tb = new Thread(r, "Thread-B");
//        ta.start();
//        tb.start();

        HashMap hashMap  = new HashMap();
        hashMap.put(null,null);


        Hashtable hashtable = new Hashtable();
        hashtable.put("1",1);
        Integer a = (Integer) hashtable.get("1");
        System.out.println("1   ="+ a);

        Hashtable numbers = new Hashtable();
        numbers.put("one", new Integer(1));
        numbers.put("two", new Integer(2));
        numbers.put("three", new Integer(3));

        Integer n = (Integer)numbers.get("two");
        System.out.println("two =" + n);

        Map m = Collections.synchronizedMap(hashMap);




    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            this.fix(30);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " : 当前foo对象的x值= " + foo.getX());
        }
    }

    public int fix(int y) {
        return foo.fix(y);
    }






}


