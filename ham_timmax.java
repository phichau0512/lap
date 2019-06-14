package Chuong2tl;

import java.util.Scanner;

public class ham_timmax {
	public static void main(String[] args) {
		int a;
		int b;
		Scanner ghi= new Scanner(System.in);
		System.out.println("mời bạn nhập số tính tổng");
		System.out.print("bạn nhập số a:");
		a=ghi.nextInt();
		System.out.print("bạn nhập số b:");
		b=ghi.nextInt();
		int hieu =hieuHaiSo(a, b);
		System.out.println(hieu);
		System.out.println("--------");
		//
		xinChao();
		
		System.out.println("--------");
		// tính chu vi hinh tron
		System.out.print("mời bạn nhập bán kính chu vi hình tròn:");
		int i;
		i= ghi.nextInt();
		float sopi= soPi()*i;
		System.out.println("chu vi hinh tròn là:" +sopi);
	}
		
	
	public static int tongHaiSo() {
		int x=2,y=4;
		Scanner ghi=new Scanner(System.in);
		int tong;
		System.out.println("mời nhập số thứ nhất:");
		tong= x+y;
		System.out.println("ketqua:"+tong);
		return tong;
	}
	public static int hieuHaiSo(int x, int y) {
		int hieu=x-y;
		return hieu;
	}
	//hàm không có giá trị trả về
	
     public static float soPi() {
    	 return 3.14f;
     }
     public static void xinChao() {
		System.out.println("xin chào mọi người");
	}
	
	}

