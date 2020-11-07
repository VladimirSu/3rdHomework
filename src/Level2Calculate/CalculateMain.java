package Level2Calculate;

import java.util.Scanner;

public class CalculateMain<num> {
    public static void main(String[] args) {
        double x = 0, y = 0;
        String num;
        char oprate = 0;
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();

        String oprateString = inputString.replaceAll("\\d", "");
        char[] oprateArray = oprateString.toCharArray();
        for (int i = 0; i < oprateArray.length; i++) {
            oprate = oprateArray[i];
        }
        System.out.println(oprate);
        num = inputString.replaceAll("-\\+\\*\\ \\\\", " ");
        System.out.println(num);

        String[] array = num.split(" ");
        for (int i = 0; i < array.length; i++) {
            x = Integer.parseInt(array[0]);
            y = Integer.parseInt(array[1]);
        }

        Caulculate caulculate = new CalculateImplCalculate();
        double result = caulculate.calculate(x, oprate, y);
        System.out.println("=" + result);
    }
}