package bmi;
import java.util.Scanner;
public class Bmicalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double weight;
		double height;
		double bmi;
		System.out.print("Enter your weight:");
		weight=input.nextDouble();
		System.out.print("Enter your height");
		height=input.nextDouble();
		bmi=weight/(height*height);
		System.out.println("Your BMI is: "+bmi);
	}

}
