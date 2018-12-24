package port;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.dubbo.common.utils.StringUtils;
import com.deppon.rps.resource.client.dto.EmployeeDto;
import com.deppon.rps.resource.core.utils.DpapConstants;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.time.*;
import java.util.*;

/**
 * @author zpf
 * @date 2018/10/26 18:27
 */
public class Test {
    public static void main(String[] args) {
//        CourierScheduleEntity courierScheduleEntity = new CourierScheduleEntity();
//        courierScheduleEntity.setParentOrgName("天津东丽区金钟河街道点部");
//        courierScheduleEntity.setCurrentDeptCode("W0000019244");
//        courierScheduleEntity.setPageNum(10);
//        courierScheduleEntity.setPageSize(2);
//        String json = JsonUtil.toJson(courierScheduleEntity);
//
//
//        List<EmpRegionDistrCodeVO> empRegionDistrCodeVOList = new ArrayList<EmpRegionDistrCodeVO>();
//        EmpRegionDistrCodeVO empRegionDistrCodeVO = new EmpRegionDistrCodeVO();
//        empRegionDistrCodeVO.setCityCode("410500");
//        empRegionDistrCodeVOList.add(empRegionDistrCodeVO);
//        empRegionDistrCodeVO = new EmpRegionDistrCodeVO();
//        empRegionDistrCodeVO.setCityCode("411200");
//        empRegionDistrCodeVOList.add(empRegionDistrCodeVO);
//
//
//        List<String> list = new ArrayList<String>();
//        list.add("2072");
//        EmpRegionDistrVO empRegionDistrVO = new EmpRegionDistrVO();
////        empRegionDistrVO.setIds(list);
////        String result = JsonUtil.toJson(empRegionDistrVO);
////
////        empRegionDistrVO.setEmpCode("254511");
//        empRegionDistrVO.setAddList(empRegionDistrCodeVOList);
////        empRegionDistrVO.setAddList("410300");
//        String result = JsonUtil.toJson(empRegionDistrVO);

//
//        List<String> list = new ArrayList<String>();
//        list.add("我我");
//        list.add("和和");
//        list.add("你你");
//        list.add("他");
//        Collections.sort(list, Collator.getInstance(java.util.Locale.CHINA));


//        CourierScheduleEntity courierScheduleEntity = new CourierScheduleEntity();
//        courierScheduleEntity.setStartTimeString("2018-12-08");
//        courierScheduleEntity.setEndTimeString("2018-12-081");
//        if (!courierScheduleEntity.getStartTimeString().equals(courierScheduleEntity.getEndTimeString())) {
//            System.out.println("不等");
//        }
//        courierScheduleEntity.setStartTime(CommonUtils.strByDate(courierScheduleEntity.
//                getStartTimeString(), CommonUtils.yyyyMMdd));
//        courierScheduleEntity.setEndTime(CommonUtils.strByDate(courierScheduleEntity.
//                getEndTimeString(), CommonUtils.yyyyMMdd));

//        String orderNo = "";
//        orderNo = StringUtils.isBlank(orderNo) == true ? null : orderNo;
//        System.out.println(orderNo);
//
//        List<String> list = new ArrayList<String>();
//        list.add(StringUtils.isBlank("") == true ?
//                null : "123");
////        list.add("123");
//        boolean notEmpty = CollectionUtils.isEmpty(list);

//        Integer employeeTotalPage = DpapConstants.getTotalPage(20000);


//        List<String> items = new ArrayList<String>();
//        items.add("A");
//        items.add("B");
//        items.add("C");
//        items.add("D");
//        items.add("E");
//        items.forEach(item-> System.out.println(item));
//
//        Arrays.asList( "a", "b", "d" ).forEach(e -> System.out.println( e ) );
//
//        Arrays.asList( "a", "b", "d" ).forEach( ( String e ) -> System.out.println( e ) );
//
//        Arrays.asList( "a", "b", "d" ).forEach( e -> {
//            System.out.print( e );
//            System.out.print( e );
//        } );
//
//
//        List<String> list = Arrays.asList("123", "45634", "7892", "abch", "sdfhrthj", "mvkd");
//        list.stream().forEach(e ->{
//            if(e.length() >= 5){
//                return;
//            }
//            System.out.println(e);
//        });
//        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
//
//
//        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
//            int result = e1.compareTo( e2 );
//            return result;
//        } );
//
//        Optional< String > fullName = Optional.ofNullable( null );
//        System.out.println( "Full Name is set? " + fullName.isPresent() );
//        System.out.println( "Full Name: " + fullName.orElseGet( () -> "[none]" ) );
//        System.out.println( fullName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
//        // Get the system clock as UTC offset
//        final Clock clock = Clock.systemUTC();
//        System.out.println( clock.instant() );
//        System.out.println( clock.millis() );
//
//        // Get the local date and local time
//        final LocalDate date = LocalDate.now();
//        final LocalDate dateFromClock = LocalDate.now( clock );
//
//        System.out.println( date );
//        System.out.println( dateFromClock );
//
//// Get the local date and local time
//        final LocalTime time = LocalTime.now();
//        final LocalTime timeFromClock = LocalTime.now( clock );
//
//        System.out.println( time );
//        System.out.println( timeFromClock );

//lambda
//Output : A,B,C,D,E
//        items.forEach(item->System.out.println(item));
// Get the local date/time


//            List<String> list = new ArrayList<>();
//
//            if(1==2^"a".equals("a")){
//                System.out.println(true);
//            }else {
//                System.out.println(false);
//            }
//            byte  s= 1 ;
//
//            byte b1 = 126 + 1;//正确
////            byte b2 = 127 + 1;//错误–1为int型，byte范围-128~127
//            byte b3 = 1;
//            byte b4 = 2;
//// byte b5 = b3 + b4;//错误–相加后为int型，要强制转换，byte b5 =(byte)( b3 + b4);
//            byte b6 = (byte)(b3 + 1);//结果为2
//            byte b7 = ++b1;//结果为 -128 ？？？？？
//
//            String  str = "罗长";
//            byte[] sb = str.getBytes();

//            List<Integer> list = new ArrayList<>();
//
//            for (int i = 0; i < 10; i++) {
//                list.add(i);
//            }


//            Iterator<Integer> iterator = list.iterator();
//            for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
//                System.out.println(iterator.next());
//            }


//            if (iterator.hasNext()){
//                Integer a = iterator.next();
//
//            }
//            Object[] array = list.toArray();
//            Integer[] s = new Integer[array.length];
//            for (int i = 0; i < array.length; i++) {
//                s[i]= (Integer) array[i];
//            }
//
//            System.out.println(list.isEmpty());
//            System.out.println(list.contains(1));
//

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }

        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();


        List<String> linkedList = new LinkedList<>();


        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.getEmpName();
        System.out.println(employeeDto.getEmpName());

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
        for (String v : map.values()) {
            System.out.println("value= " + v);
        }
        System.out.println("github测试提交代码");
        System.out.println("github测试提交代码2");
    }


}
