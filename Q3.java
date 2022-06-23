import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		double distance, miles, price;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the driving distance: ");
		distance = sc.nextDouble();
		System.out.print("Enter miles per litre: ");
		miles = sc.nextDouble();
		System.out.print("Enter price per litre: ");
		price = sc.nextDouble();
		double cost = distance/miles*price;
		System.out.println("The cost of driving is: $"+cost);
	}
}
