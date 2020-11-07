package Level4reflect;

import java.lang.reflect.Field;
import java.util.Scanner;

public class getfield {
    public static void main(String[] args) throws NoSuchFieldException {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        Field field = Some.class.getDeclaredField("name");
        Class<?> type = field.getType();
        System.out.println(type);
    }
}
