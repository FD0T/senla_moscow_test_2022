package task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sum_from_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(str);
        boolean b = false;
        for(int i = 0; i < str.length(); ++i){
            if(Character.toString(str.charAt(i)).matches("[0-9]")){
                b = true;
                break;
            }
            else b = false;
        }
        if(b){
            int i = 0;
            while(m.find()){
            i += Integer.valueOf(m.group());
        }
            System.out.println(i);
        }
        else System.out.println("0");
    }
}
