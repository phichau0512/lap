package bt1;

public class sosanh {
	public static void main(String[] args) {
		//so sanh 
		int numberone= 3;
		int numbertwo= 5;
		boolean result =true;
		
		 result= numberone > numbertwo;
		 System.out.println(numberone+">"+numbertwo+"="+result)	;
		 result=numberone < numbertwo;
		 System.out.println(numberone+"<"+numbertwo+" is "+result);
		 result= numberone<=numbertwo;
		 System.out.println(numberone+ "<=" +numbertwo+" la "+result);
		 result= numberone>=numbertwo;
		 System.out.println(numberone+ ">=" +numbertwo+" la "+result);
		 result= numberone != numbertwo;
		 System.out.println(numberone+ "!=" +numbertwo+" la "+result);
		 result= numberone == numbertwo;
		 System.out.println(numberone+ "==" +numbertwo+" la "+result);
	}

}
