package task3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Съешь еще этих мягких французских булок
public class TripleTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length() != 0) {
            System.out.println("-----count vowels-----");
            System.out.println(task1(str));
            System.out.println("-----output sorted by num of vowels-----");
            task2(str);
            System.out.println("-----first vowel is capital-----");
            task3(str);
        }
    }

    public static int task1(String str) {
        int vowels = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (Character.toString(str.charAt(i)).matches("[аеёиоуыэюяАЕЁИОУЫЭЮЯ]")) {
                vowels++;
            }
        }
        return vowels;
    }

    public static void task2(String str) {
        ArrayList<String> words = new ArrayList<>();
        Pattern p = Pattern.compile("[а-яА-Я]+");
        Matcher m = p.matcher(str);
        while (m.find()) {
            words.add(m.group());
        }
        ArrayList<Integer> vowels = new ArrayList<>();
        for (int i = 0; i < words.size(); ++i) {
            vowels.add(task1(words.get(i)));
        }
        System.out.println(words.toString());
        System.out.println(vowels.toString());

        boolean swaps = true;
        while (swaps) {
            swaps = false;
            for (int i = 0; i < vowels.size() - 1; i++) {
                if (vowels.get(i) < vowels.get(i + 1)) {
                    swaps = true;
                    int i_temp = vowels.get(i);
                    vowels.set(i, vowels.get(i + 1));
                    vowels.set(i + 1, i_temp);
                    String s_temp = words.get(i);
                    words.set(i, words.get(i + 1));
                    words.set(i + 1, s_temp);
                }
            }
        }
        System.out.println(words.toString());
        System.out.println(vowels.toString());
    }

    public static void task3(String str){
        ArrayList<String> words = new ArrayList<>();
        Pattern p = Pattern.compile("[а-яА-Я]+");
        Matcher m = p.matcher(str);
        while (m.find()) {
            words.add(m.group());
        }
        for(int i = 0; i < words.size(); i++){
            String begin = "";
            String end = "";
            char temp = ' ';
            for(int j = words.get(i).length()-1; j >= 0; j--){
                if(Character.toString(words.get(i).charAt(j)).matches("[аеёиоуыэюяАЕЁИОУЫЭЮЯ]")){
                    begin = words.get(i).substring(0, j);
                    end = words.get(i).substring(j+1);
                    temp = Character.toUpperCase(words.get(i).charAt(j));
                }
            }
            words.set(i, begin+temp+end);
        }
        str = words.get(0);
        for(int i = 1; i < words.size(); i++)
            str += " " + words.get(i);
        System.out.println(str);
    }
}