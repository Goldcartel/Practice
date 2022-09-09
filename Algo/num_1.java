package Algo;

import java.util.Scanner;

public class num_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        boolean [] check = new boolean[1000000];
        for(int i = 0; i<Num; i++) {
            check[sc.nextInt()-1] = true;
        }
        for(int i = 0; i< check.length; i++) {
            if(check[i]) {
                System.out.println(i+1);
            }
        }
    }
}
