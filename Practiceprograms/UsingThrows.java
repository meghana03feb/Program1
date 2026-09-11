package core_java;

import java.util.Scanner;

public class UsingThrows {

    static void checkValue(int v) throws Exception {

        if (v == 5) {
            throw new Exception("The value of v cannot be 5");
        } else {
            System.out.println("Satisfied");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter v value:");

        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();

        try {
            checkValue(v);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
