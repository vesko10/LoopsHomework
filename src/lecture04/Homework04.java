package lecture04;

import java.util.Scanner;

public class Homework04 {

    public static void main(String[] args) {
        biggestElementArray();
    }

    public static void arrayElementsSum() {
        int[] elementsNum = {2,4,6,8,10};
        int sum = 0;

        for (int i=0; i< elementsNum.length;i++){
            sum+=elementsNum[i];                                   //sum = sum + elementsNum[i];
        }
        System.out.println("The sum of the elements from the array is " + "" + sum);
    }

    public static void multidimensionalMatrixTwoD() {
        int[][] arr=new int[4][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;
        arr[3][0]=10;
        arr[3][1]=11;
        arr[3][2]=12;

        for (int i=0; i<4; i++){
            for(int j=0;j<3; j++){
                System.out.println(arr[i][j]);
            }
        }

    }

    public static void dynamicInputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter rows : ");
        int rows = input.nextInt();
        System.out.print("Please enter columns : ");
        int columns=input.nextInt();


        int twoDMatrix[][] = new int[rows][columns];

        System.out.println("Enter array: ");

        for (int i=0; i<rows;i++)
        {
            for (int j=0; j<columns; j++)
            {
                twoDMatrix[i][j]=input.nextInt();
            }
        }
    }

    public static void biggestElementArray() {
        int[] elements= {2,4,6,8,10};
        int max = elements[0];
        for (int i = 0; i< elements.length; i++) {
            if(elements[i]>max)
                max=elements[i];
        }
        System.out.println("The biggest elements from the array is: " + "" +  max);
    }
}
