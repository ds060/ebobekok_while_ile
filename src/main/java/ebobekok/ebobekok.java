package ebobekok;

import java.util.Scanner;

public class ebobekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz:");
        int n1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz:");
        int n2 = input.nextInt();

        int count = 1;
        int ebob = 0;

        while (count <= Math.max(n1, n2)) {
            if (n1 % count == 0 && n2 % count == 0) {
                ebob = count;
            }
            count++;
        }
        int ekok = (n1 * n2) / ebob;
        System.out.println("ebob:"+ebob+"\nekok:"+ekok);
    }
}
