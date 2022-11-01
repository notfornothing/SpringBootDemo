package cn.leijiba.springbootdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class SpringBootDemoApplicationTests {

    @Test
    public void test1() throws Exception {
        Number[] numbers = new Number[3];
        numbers[0] = new Integer(10);
        numbers[1] = new Double(3.14);
        Integer[] myInts = {1,2,3,4};
        Number[] myNumber = myInts;
        System.out.println(myNumber);
        myNumber[0] = 3.14;
        System.out.println(myNumber);

        Map<String, String>[] wp = (Map<String, String>[]) new HashMap[10];
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("1", "1");
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("2", "2");
        wp[0] = map1;
        wp[1] = map2;
        System.out.println(wp[0].get("1"));
        System.out.println(wp[1].get("2"));

        Object[] objArray = wp;
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1111111);
        integers.add(2222222);
        objArray[0] = integers; // OPPS!!! ±‡“Î∆˜≤ª±®¥Ì
        System.out.println(objArray[0].toString());
        System.out.println(objArray[0].toString());


        System.out.println("=============");
        List<String> list = new ArrayList<>();
        Class<? extends Object> bClass = (Class<?>) list.getClass();
        Class<?> aClass = (Class<?>) list.getClass();


        list.add("A");
//        ±‡“Î±®¥Ì
//        list.add(1);
        aClass.getMethod("add", Object.class).invoke(list, 666);
        System.out.println(list.toString());
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
    }


}

class father {

}

class son extends father {

}

class grandson extends son {

}
