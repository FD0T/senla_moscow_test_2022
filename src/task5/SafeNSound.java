package task5;

import java.util.ArrayList;
import java.util.Scanner;

public class SafeNSound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input safe's max volume:");
        int safe = sc.nextInt();
        System.out.println("Input number of items:");
        int n = sc.nextInt();
        ArrayList<Integer> volume = new ArrayList<Integer>();
        ArrayList<Integer> value = new ArrayList<Integer>();
        System.out.println("Input " + n + " times Volume and Value of each item.");
        for(int i = 0; i < n; ++i){
            System.out.println("_-*Item " + (i+1) + "*-_\nvolume: ");
            volume.add(sc.nextInt());
            System.out.println("value: ");
            value.add(sc.nextInt());
        }
        System.out.println("Max value is " + rec(volume,value,n,safe));
    }

    public static int rec(ArrayList<Integer> volume, ArrayList<Integer> value, int n, int safe){
        if (n <= 0){
            return 0;
        } else if(volume.get(n-1)>safe){
            return rec(volume, value,n-1, safe);
        } else{
            return Math.max(rec(volume, value,n-1, safe), value.get(n-1) + rec(volume, value,n-1, safe-volume.get(n-1)));
        }
    }
}
