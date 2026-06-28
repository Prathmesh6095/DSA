package Array;

import java.util.*;

public class Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // // input
        for(int i=0; i<numbers.length; i++){ 
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for(int i=0; i<numbers.length; i++){ 
            if (numbers[i] == x) {
                System.out.println("x Found at index :"+ i);
            }
        }

    }
}
