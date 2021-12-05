/*
 *
 *  Description: Process array sets and display of arrays
 *  Name: Rick
 *  Semester: Fall 2021
 *
 */

import java.util.Random;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] a = new int[5];
        int[] b = new int[12];
        int[] c = new int[100];

        int m, d, h;
        int setTotal  = 0;
        Random rand = new Random();


        System.out.println("2nd int from a : " + a[1]);

        a[1] = 5;
        System.out.println("2nd int from a : " + a[1]);

        System.out.println("Size of a ; " + a.length);



        double totalSum = 0;
        for(m = 0; m < b.length; m++ )
        {
            b[m] = m;
            System.out.println("Int from b : " + b[m]);
        }

        for(d = 0; d < b.length; d++ )
        {
            totalSum = totalSum + b[d];

        }

        System.out.println("totalSum : " +  totalSum);

        totalSum = totalSum / b.length;
        System.out.println("totalSum Average : " + totalSum);

        for(h = 0; h < c.length; h++ )
        {
            c[h] = rand.nextInt();
            System.out.println("random : " + c[h]);
        }
    }
}
