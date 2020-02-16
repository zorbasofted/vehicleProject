package Gold;

import java.util.Scanner;

public class ArrayPractice {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;
        //System.out.println("Please enter 5 number ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            sum = sum + num[i];
        }
        int max = num[0];
        System.out.println("The sum of the array is: " + sum);

        for (int i = 0; i < 5; i++) {

            if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.println("The maximum number is  :" + max);
    }

}
