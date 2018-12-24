package java8;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.dubbo.common.utils.StringUtils;
import com.deppon.rps.resource.client.dto.EmployeeDto;
import com.deppon.rps.resource.core.utils.DpapConstants;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

/**
 * @author zpf
 * @date 2018/10/26 18:27
 *
 *   java8 新特性
 *
 */
public class Feature {
    public static void main(String[] args) {

        List<String> items = new ArrayList<String>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");
        items.forEach(item-> System.out.println(item));

        Arrays.asList( "a", "b", "d" ).forEach(e -> System.out.println( e ) );

        Arrays.asList( "a", "b", "d" ).forEach( ( String e ) -> System.out.println( e ) );

        Arrays.asList( "a", "b", "d" ).forEach( e -> {
            System.out.print( e );
            System.out.print( e );
        } );
//

        List<String> list = Arrays.asList("123", "45634", "7892", "abch", "sdfhrthj", "mvkd");
        list.stream().forEach(e ->{
            if(e.length() >= 5){
                return;
            }
            System.out.println(e);
        });
        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );


        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
            int result = e1.compareTo( e2 );
            return result;
        } );

        Optional< String > fullName = Optional.ofNullable( null );
        System.out.println( "Full Name is set? " + fullName.isPresent() );
        System.out.println( "Full Name: " + fullName.orElseGet( () -> "[none]" ) );
        System.out.println( fullName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
        // Get the system clock as UTC offset
        final Clock clock = Clock.systemUTC();
        System.out.println( clock.instant() );
        System.out.println( clock.millis() );

        // Get the local date and local time
        final LocalDate date = LocalDate.now();
        final LocalDate dateFromClock = LocalDate.now( clock );

        System.out.println( date );
        System.out.println( dateFromClock );

// Get the local date and local time
        final LocalTime time = LocalTime.now();
        final LocalTime timeFromClock = LocalTime.now( clock );

        System.out.println( time );
        System.out.println( timeFromClock );

    }


}
