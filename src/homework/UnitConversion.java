package homework;

import java.util.Scanner;


public class UnitConversion {
    public static void main(String[] args){
        Scanner enterinches = new Scanner(System.in);
        System.out.println("Enter inches");
        double inches = enterinches.nextDouble();
        double convter = inches * .0254;
        System.out.println("this is in meters"+ "" +convter);
    }
}
