package lecture04;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        buildTriangle();
    }

    public static void buildTriangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value for first angle");
        float firstAngle = scanner.nextFloat();

        System.out.println("Enter value for second angle");
        float secondAngle = scanner.nextFloat();

        System.out.println("Enter value for third angle");
        float thirdAngle = scanner.nextFloat();
        /*System.out.println("angle1" + firstAngle);
        System.out.println("angle2" + secondAngle);
        System.out.println("angle3" + thirdAngle);*/

        float sum = firstAngle + secondAngle + thirdAngle;

        if (sum != 180) {
            System.out.println("The triangle cannot be build!");
        } else if (firstAngle < 90 && secondAngle < 90 && thirdAngle < 90) {
            System.out.println("The triangle is acute");
        } else if (firstAngle == 90 || secondAngle == 90 || thirdAngle == 90) {
            System.out.println("The triangle is Right-angled");
        } else if (firstAngle > 90 || secondAngle > 90 || thirdAngle > 90) {
            System.out.println("The triangle is Obtuse");
        } else if (firstAngle==secondAngle || firstAngle==thirdAngle || secondAngle==thirdAngle) {
            System.out.println("The triangle is Isosceles");
        } else if (firstAngle == 60 && secondAngle == 60 && thirdAngle == 60) {
            System.out.println("The triangle is Equilateral");
        } else {
            System.out.println("The Triangle is Multifaceted");
        }

    }
}

