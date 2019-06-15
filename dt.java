package Chuong2tl;

import java.util.Scanner;

public class dt {
	public float dientichhinhchunhat;

	public float getDientichhinhchunhat() {
		return dientichhinhchunhat;
	}

	public void setDientichhinhchunhat(float chieucao,float chieurong) {
		float ketqua;
		ketqua=(chieucao+chieurong)*2;
		this.dientichhinhchunhat=ketqua;
	}
	
	public void inketqua() {
		System.out.println("chu vi Hình Chữ Nhật Là:"+ getDientichhinhchunhat());
	}
	public static void main(String[] args) {
		dt cn = new dt();
		float a,b;
		Scanner ghi=new Scanner(System.in);
		System.out.println("nhập chiều dài và chiều rộng hình chữ nhật");
		System.out.print("Nhập chiều dài hình chữ nhật: ");
		a=ghi.nextFloat();
		System.out.print("Nhập chiều rộng hình chữ nhật: ");
		b=ghi.nextFloat();
		cn.setDientichhinhchunhat(a, b);
		cn.inketqua();
	}
	

}
