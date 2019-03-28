import java.util.Scanner;

public class groceryDiscount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the cost of groceries: ");
		double cost = scan.nextDouble();
		double discountCoupon = getDiscount(cost);
		
		if(discountCoupon == 0)
			System.out.println("Sorry, you did not win a coupon");
		else
			System.out.println("You win a discount coupon of $" + discountCoupon * cost + "(" + discountCoupon * 100 + "% of your purchase)");
		
	}
	
	public static double getDiscount(double cost) {
		double discount = 0;
		if (cost < 10)
			return discount;
		else if ((cost > 9) && (cost < 61))
			discount = 0.08;
		else if ((cost > 60) && (cost < 151))
			discount = 0.1;
		else if ((cost > 150) && (cost < 211))
			discount = 0.12;
		else if (cost > 210)
			discount = 0.14;
		else
			return discount;
	}

}
