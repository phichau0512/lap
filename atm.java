package bt1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class atm {
public static void main(String[] args) {
	int tien=0;
	
	final int NAMTRAM=500000;
	final int HAITRAM=200000;
	final int MOTTRAM=100000;
	final int NAMMUOI=50000;
	final int HAIMUOI=20000;
	final int MUOINGAN=10000;
	
	 int namtram= 0;
	 int haitram= 0;
	int mottram= 0;
	int nammuoi= 0;
	int haimuoi= 0;
	int muoingan= 0;
	DecimalFormat dinhdang =new DecimalFormat("#,###");
	Scanner ghi= new Scanner(System.in);
	do {
		System.out.println("hãy nhập vào số tiền của bạn: ");
		tien=ghi.nextInt();
	}while(tien%10000 != 0); 
	ghi.close();
	
	if(tien>=NAMTRAM) {
		namtram=tien / NAMTRAM;
		tien= tien % NAMTRAM;
		System.out.printf("số tiên %s: %d \n",dinhdang.format(NAMTRAM),namtram );
	}
	
	if(tien>=HAITRAM) {
		haitram=tien / HAITRAM;
		tien= tien % HAITRAM;
		System.out.println("số tiền 200.000 là: "+haitram+" tờ" );
	}
	if(tien>=MOTTRAM) {
		mottram=tien / MOTTRAM;
		tien= tien % MOTTRAM;
		System.out.println("số tiền 100.000 là: "+mottram+" tờ" );
	}
	if(tien>=NAMMUOI) {
		nammuoi=tien / NAMMUOI;
		tien= tien % NAMMUOI;
		System.out.println("số tiền 50.000 là: "+nammuoi+" tờ" );
	}
	if(tien>=HAIMUOI) {
		haimuoi=tien / HAIMUOI;
		tien= tien % HAIMUOI;
		System.out.println("số tiền 20.000 là: "+haimuoi+" tờ" );
	}
	if(tien>=MUOINGAN) {
		muoingan=tien / MUOINGAN;
		tien= tien % MUOINGAN;
		System.out.println("số tiền 10.000 là: "+muoingan+" tờ" );
	}

	
}
}
