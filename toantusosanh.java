package bt1;

public class toantusosanh {
public static void main(String[] args) {
	int numberone = 12;
	int numbertwo= 20;
	boolean retult= false;
	// so sanh va
	// hai bieu thu dung laf dung(mot  bieu thu sai laf sai
	retult=(numberone<numbertwo) && (numberone>numbertwo);
	System.out.println((numberone<numbertwo)+"||"+(numberone>numbertwo)+" is "+retult);
	//so sanh hoac
	// 1 bieu thuc dung la dung
	// tat ca bieu thuc sai la sai
	retult=(numberone>numbertwo)||(numberone==numbertwo);
	System.out.println((numberone>numbertwo)+"||"+(numberone==numbertwo)+" is "+retult);
	
	// so sanh phu dinh
	//dung la sai
	retult=!(numberone>numbertwo);
	System.out.println("!"+(numberone>numbertwo)+" is "+retult);
}
}
