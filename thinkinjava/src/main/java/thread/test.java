package thread;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        listCirculation();




    }
    private static void listCirculation() {
        List<Long> fList = new ArrayList<Long>();
        fList.add(1L);
        fList.add(2L);
        fList.add(3L);
        fList.add(4L);
        fList.remove(0);
        boolean b = fList.contains(4L);
        System.out.println(b);
        List<Long> nums = new ArrayList<Long>();
        nums.add(1L);
        nums.add(2L);
        nums.add(3L);

        List<Long> a = new ArrayList<Long>();

        List<Long> removelist = new ArrayList<Long>();

        for (Long j : fList) {
            for (Long i : nums) {
                if (j.equals(i)) {
                    a.add(i);
                    removelist.add(i);
                }
            }
        }
        nums.removeAll(removelist);




    }


}



