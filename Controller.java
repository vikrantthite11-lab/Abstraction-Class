package abstractClass;

public class Controller {

	public static void main(String[] args) {
		
		Vehicle V;
		V = new Car();
		V.start();
		V.fulerType();
		System.out.println();
		
		V = new Bike();
		V.start();
		V.fulerType();
		System.out.println();
		
		
		Product P;
		P = new Clothing();
		P.calculateDicount();
		System.out.println();
		
		P = new Electronics();
		P.displayProductDetails();
		P.calculateDicount();
		System.out.println();
		
		
		Subscription S;
		S = new BasicPlan();
		S.subscriptionDetails();
		System.out.println();
		S.calculatePrise();
		
		S = new PremiumPlan();
		S.calculatePrise();
	}
}

