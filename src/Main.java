import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = in.nextInt();

        System.out.println(checkDayName(day));

    }



    public static String checkDayName (int day) {
        String nameOfTheDay = "";
        switch (day) {
            case 1:
                nameOfTheDay = "Monday";
                break;
            case 2:
                nameOfTheDay = "Tuesday";
                break;
            case 3:
                nameOfTheDay = "Wednesday";
                break;
            case 4:
                nameOfTheDay = "Thursday";
                break;
            case 5:
                nameOfTheDay = "Friday";
                break;
            case 6:
                nameOfTheDay = "Saturday";
            break;
            case 7:
                nameOfTheDay = "Sunday";
            break;
            default:
                nameOfTheDay = "Invalid day range";
        }

        return nameOfTheDay;
    }

    public static void ageCheck() {
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        if(age>=16)
            System.out.print("You are eligible to work: ");
        else {
            System.out.println("You are not eligible to work: ");
        }

    }

    public static void calculateRevenue(){
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter unit price: ");
        float unitprice = input.nextInt();
        System.out.print("Please enter quantity: ");
        int quantity = input.nextInt();
        double revenue=0;
        double discountRate=0;
        double discountAmount=0;
        if (quantity<100)
            revenue=unitprice*quantity;
        else if (quantity>=100 && quantity<=120) {
            discountRate = (double)15 / 100;
            revenue = unitprice * quantity;
            discountAmount = revenue * discountRate;
            revenue = revenue - discountAmount;
        } else if (quantity>120) {
            discountRate= (double)20/100;
            revenue=unitprice * quantity;
            discountAmount=revenue * discountRate;
            revenue= revenue - discountAmount;
        }
        System.out.println("The revenue from sale: " +revenue +"$");

        System.out.println("Discount: " +discountAmount+"$("+discountRate*100+"%)");


    }


}




