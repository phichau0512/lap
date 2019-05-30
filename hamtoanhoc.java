package bt1;

public class hamtoanhoc {
public static void main(String[] args) {
	int numberone = 10;
	int numbertwo =20;
	double numberthow =1.63;
	int result = Math.max(numberone, numbertwo);
	System.out.println("max: "+result);
	int result1 = Math.min(numberone, numbertwo);
	System.out.println("min:" +result1);
	//lam tron len
	double result2 = Math.ceil(numberthow);
	System.out.println("ceil: "+result2);
	//lam tron xuong
		double result3 = Math.floor(numberthow);
		System.out.println("floor: "+result3);
		//lam tron xuong
	
		System.out.println("round: "+Math.round(numberthow));
		// ngau nhien tw 0 den1
		double ngaunhien= Math.random();
		System.out.println("round: "+ ngaunhien);
		
}
}
