import java.util.*;

public class AvgCalc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int avg = (A + B + C) / 3;
        System.out.println("Avarage number is: " + avg);
        sc.close();
    }
}
