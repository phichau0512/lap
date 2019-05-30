package bt1;

public class toantu {
public static void main(String[] args) {
	int numberone=20;
	int numbertwo=3;
	int result;
	//phép tính+
	result = numberone + numbertwo;
	//System.out.println("phep cong:"+ result);
	//hoặc
	System.out.println(numberone+ "+"+numbertwo+"="+result);
	//phép trừ 
	result= numberone - numbertwo;
	System.out.println(numberone+"-"+numbertwo+"=" +result);
	//phép nhân
	result= numberone * numbertwo; 
	System.out.println(numberone+"x"+numbertwo+"=" +result);
	// phép chia
	result= numberone / numbertwo; 
	System.out.println("kết quả phép chia:" +result);
	//phepgan
	numberone+=20;
	System.out.println("ketquanumberonla: "+numberone);
	
	//phep++,--;
	//neu so numberstart++ gia tri tra ve numberstart, sau do tang number len 1 don vi
	// neu so nuberstart-- giati tra ve numerstart, sau do giam number xuong 1 don vi
	//neu so ++numberstart tang numberstart len 1 don vi, sau do tra ve gia tri numbersart
	//neu so --numberstart giam numberstart xuong 1 don vi, sau do tra ve gia tri numbersart
	
int numberstart= 20;
int numberend= 0;
numberend= ++numberstart;
numberend = --numberstart;
System.out.println("numberstarla: "+numberstart);
System.out.println("numberendla: "+numberend);
}
}
