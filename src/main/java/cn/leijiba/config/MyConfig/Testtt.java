package cn.leijiba.config.MyConfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Testtt {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        List list = stringList;
        list.add(1);
        String s= stringList.get(0);
        
//        Number[] num = new Integer[10];
////        num[0] = 2.1;     //Error
//        List<String>[] stringList = (ArrayList<String>[])new ArrayList[10];
//        Object[] objArray =stringList;
//        objArray[0] = new ArrayList<Integer>(Arrays.asList(1)); // true 编译器不报错
//        objArray[0] = new ArrayList<String>(Arrays.asList("1")); //  false 但是编译器不报错
//        System.out.println(objArray[0].toString());
//        System.out.println(objArray[1].toString());
//        
////        List<? extends father> list = new ArrayList<>();
////        list.add(new father());
////        list.add(new son());
////        list.add(new grandson());
////
////        List<? super father> list = new ArrayList<>();
////        list.add(new father());
////        list.add(new son());
////        list.add(new grandson());
    }
}
