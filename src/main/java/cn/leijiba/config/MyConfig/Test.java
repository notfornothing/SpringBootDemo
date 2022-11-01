package cn.leijiba.config.MyConfig;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        test4();
    }

    public static void test4() {
        add(1, 2);
        add(1f, 2f);
        add(1d, 2d);
        add(Integer.valueOf(1), Integer.valueOf(2));
        add(Float.valueOf(1), Float.valueOf(2));
        add(Double.valueOf(1), Double.valueOf(2));
    }

    private static int add(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    private static float add(float a, float b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    private static double add(double a, double b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    private static <T extends Number> T add(T a, T b) {
        System.out.println(a + "+" + b + "=" + (a.doubleValue() + b));
        return a + b;
    }


    public static void test3() {
    }

    public static void test1() {
        List list = new ArrayList();
        list.add("Sparrow");
        list.add(23);
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            //多态,查找父类的toString方法,打印出结果,
            System.out.println(obj);
        }

        //如果我们遍历的时候就想得到自己想要的数据类型
        for (int i = 0; i < list.size(); i++) {
            //在取 Integer 的时候会报类型转换错误
            String obj = (String) list.get(i);
            System.out.println(obj);
        }

    }

    public static void test2() {
        List list = new StringList();
        list.add("Sparrow");
        list.add(23);
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            //多态,查找父类的toString方法,打印出结果,
            System.out.println(obj);
        }

        //如果我们遍历的时候就想得到自己想要的数据类型
        for (int i = 0; i < list.size(); i++) {
            //在取 Integer 的时候会报类型转换错误
            String obj = (String) list.get(i);
            System.out.println(obj);
        }

    }
}

class father {
    @Override
    public String toString() {
        return "father";
    }
}

class son extends father {
}

class StringList extends ArrayList {

}