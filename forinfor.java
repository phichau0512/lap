import java.util.Scanner;

public class forinfor {

	public static void main(String[] args) {
		int i;
		int j;
		Scanner ghi =new Scanner(System.in);
		System.out.println("bảng cửu chương");
		for(i=2;i<10;i++ ) {
			System.out.println("bảng cửu chương"+i);
		
         for(j=1;j<10;j++) {
        	 System.out.println(j+"x"+j+"="+j*i);
         }
	}
	}
}
