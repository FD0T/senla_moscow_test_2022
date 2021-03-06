package task4;

import java.util.ArrayList;
import java.util.Scanner;

public class HugeNumbers {
    public static void main(String[] args) {
        char[] num1 = new char[]{
                ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', '*', '*', ' ', ' ',
                ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', '*', '*', '*', ' ',};
        char[] num2 = new char[]{
                ' ', ' ', '*', '*', '*', ' ',
                ' ', '*', ' ', ' ', ' ', '*',
                ' ', '*', ' ', ' ', '*', ' ',
                ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', '*', ' ', ' ', ' ',
                ' ', '*', ' ', ' ', ' ', ' ',
                ' ', '*', '*', '*', '*', '*',};
        char[] num3 = new char[]{
                ' ', ' ', '*', '*', ' ', ' ',
                ' ', '*', ' ', ' ', '*', ' ',
                ' ', ' ', ' ', ' ', '*', ' ',
                ' ', ' ', '*', '*', ' ', ' ',
                ' ', ' ', ' ', ' ', '*', ' ',
                ' ', '*', ' ', ' ', '*', ' ',
                ' ', ' ', '*', '*', ' ', ' ',};
        char[] num4 = new char[]{
                ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', '*', '*', ' ', ' ',
                ' ', '*', ' ', '*', ' ', ' ',
                '*', ' ', ' ', '*', ' ', ' ',
                '*', '*', '*', '*', '*', '*',
                ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', ' ', '*', ' ', ' ',};
        char[] num5 = new char[]{
                ' ', '*', '*', '*', '*', ' ',
                ' ', '*', ' ', ' ', ' ', ' ',
                ' ', '*', '*', '*', ' ', ' ',
                ' ', ' ', ' ', ' ', '*', ' ',
                ' ', ' ', ' ', ' ', '*', ' ',
                ' ', ' ', ' ', ' ', '*', ' ',
                ' ', '*', '*', '*', ' ', ' ',};
        char[] num6 = new char[]{
                ' ', ' ', '*', '*', '*', '*',
                ' ', '*', ' ', ' ', ' ', ' ',
                ' ', '*', ' ', ' ', ' ', ' ',
                ' ', '*', '*', '*', '*', ' ',
                ' ', '*', ' ', ' ', ' ', '*',
                ' ', '*', ' ', ' ', ' ', '*',
                ' ', ' ', '*', '*', '*', ' ',};
        char[] num7 = new char[]{
                ' ', '*', '*', '*', '*', '*',
                ' ', ' ', ' ', ' ', ' ', '*',
                ' ', ' ', ' ', ' ', '*', ' ',
                ' ', ' ', ' ', '*', ' ', ' ',
                ' ', ' ', '*', ' ', ' ', ' ',
                ' ', '*', ' ', ' ', ' ', ' ',
                ' ', '*', ' ', ' ', ' ', ' ',};
        char[] num8 = new char[]{
                ' ', ' ', '*', '*', '*', ' ',
                ' ', '*', ' ', ' ', ' ', '*',
                ' ', '*', ' ', ' ', ' ', '*',
                ' ', ' ', '*', '*', '*', ' ',
                ' ', '*', ' ', ' ', ' ', '*',
                ' ', '*', ' ', ' ', ' ', '*',
                ' ', ' ', '*', '*', '*', ' ',};
        char[] num9 = new char[]{
                ' ', ' ', '*', '*', '*', ' ',
                ' ', '*', ' ', ' ', ' ', '*',
                ' ', '*', ' ', ' ', ' ', '*',
                ' ', ' ', '*', '*', '*', '*',
                ' ', ' ', ' ', ' ', ' ', '*',
                ' ', ' ', ' ', ' ', ' ', '*',
                ' ', ' ', '*', '*', '*', ' ',};
        char[] num0 = new char[]{
                ' ', ' ', '*', '*', '*', ' ',
                ' ', '*', ' ', ' ', ' ', '*',
                ' ', '*', ' ', ' ', ' ', '*',
                ' ', '*', ' ', ' ', ' ', '*',
                ' ', '*', ' ', ' ', ' ', '*',
                ' ', '*', ' ', ' ', ' ', '*',
                ' ', ' ', '*', '*', '*', ' ',};
        ArrayList<char[]> num = new ArrayList<>();
        num.add(num0);
        num.add(num1);
        num.add(num2);
        num.add(num3);
        num.add(num4);
        num.add(num5);
        num.add(num6);
        num.add(num7);
        num.add(num8);
        num.add(num9);


        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int max_i = 0, max_num = 0;
        for(int i = 0; i < str.length(); i++)
            if(Character.getNumericValue(str.charAt(i))>max_num){
                max_i = i;
                max_num = Character.getNumericValue(str.charAt(i));
            }
        char[] temp = num.get(max_num);
        for(int i = 0; i < 7; i++)
            for (int j = 0; j < 6; j++){
                if(temp[6*i+j] == '*')
                    temp[6*i+j] = str.charAt(max_i);
            }
        num.set(max_num, temp);
        for(int i = 0; i < 7; i++) {
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < 6; k++)
                    System.out.print(num.get(Character.getNumericValue(str.charAt(j)))[6 * i + k]);
            }
            System.out.println();
        }
    }
}
