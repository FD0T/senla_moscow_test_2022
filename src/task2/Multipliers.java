package task2;

import java.util.Scanner;

public class Multipliers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.matches("[0-9]+")) {
            int num = Integer.valueOf(str);
            for(int i = 1; i < num; ++i){
                if (num%i==0){
                    System.out.println(num/i + "x" + i + "=" + num);
                }
            }
        }
        else System.out.println("Error. This is not integer");
    }
}
