import java.util.Scanner;



public class mang1chieu {
public static void main(String[] args) {
//	int a;
//	Scanner ghi=new Scanner(System.in);
//	System.out.println("nhap mang:");
//	a=ghi.nextInt();
//	int[] mang= new int [a];
//	for (int i = 0; i < a; i++) {
//        System.out.println("Nhập vào phần tử thứ " + i + ": ");
//        mang[i] = ghi.nextInt();
//	}
//	for (int i = 0; i < a; i++) {
//        System.out.println("Phần tử thứ " + i + ": " + mang[i]);
//    }
	
	
	//tinh tbc



	    int A, tong=0 , so;
	    float tbc;
	    Scanner ghi = new Scanner(System.in);
	    System.out.println("Nhập vào số phần tử của mảng: ");
	    A = ghi.nextInt();
	    int[] mang = new int[A];
	    
	    for(int i=0; i< A; i++){
	    	System.out.println("nhập vào phần tử thứ " +i+": ");
	    	mang[i] = so = ghi.nextInt();     
	    	tong += so;

	    }
	    for(int j=0; j<A; j++){
	    	System.out.println("phần tử thứ" + j +": " +mang[j]);
	    }
	    System.out.println("tổng:"+tong+"/"+A);
	    tbc = (float)tong/A;
	    System.out.println("Trung Bình Cộng: " + tbc);
	    }

}
