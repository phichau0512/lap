package bt1;

import java.util.Scanner;

public class timanso {
public static void main(String[] args) {
	final int SOLONNHAT=100;
	final int SONHONHAT=1;
	int phamvi=(SOLONNHAT-SONHONHAT);
	int songaunhien =(int)(Math.random()*phamvi)+SONHONHAT;
	Scanner ghi = new Scanner (System.in);
	int landau=1;
	int i =0;
	while( songaunhien !=i) {
	   System.out.println("mời bạn nhập số:");
	   i= ghi.nextInt();
	   if(i >songaunhien) {System.out.println("số bạn chọn lớn hơn số ngẫu nhiên: ----bạn đã chọn "+landau+" lần");}
	   else if(i<songaunhien) {System.out.println("số bạn chọn nhỏ hơn số ngẫu nhiên: ----bạn đã chọn "+landau+" lần");}
	   else {System.out.println("chúc mừng bạn, bạn đã đoán đúng!---- bạn đã chọn "+landau+" lần");}
	   landau++;
	}
	ghi.close();
}
}
