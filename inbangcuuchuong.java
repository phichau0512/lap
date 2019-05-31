import java.util.Scanner;

public class inbangcuuchuong {
public static void main(String[] args) {
//	int soa;
//	int i;
//	int ketqua;
//	Scanner cuchuong =new Scanner(System.in);
//	System.out.println("Nhập bảng cửu chương bạn cần tìm ");
//    soa = cuchuong.nextInt();
//    
//	for(i=1; i<=10;i++) {
//		//ketqua=soa*i;
//		//System.out.println(soa+"x"+i+"="+ ketqua);
//	}
	int number;
	Scanner ghi=new Scanner(System.in);
	System.out.println("tìm bảng cưu chương cần tìm:");
	number=ghi.nextInt();
	int i=1;
	while(i<10) {
		System.out.printf("%d x %d = %d %n",number,i,number*i );
		i++;
	}
	
}
}
