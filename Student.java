package Chuong2tl;

public class Student {
	public String ten;
	public String masv;
	public int namsinh;
	public double diem;
	
	public void setTen(String ten) {
		this.ten = ten;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	 

	public String getTen() {
		return ten;
	}
	public String getMasv() {
		return masv;
	}
	public int getNamsinh() {
		return namsinh;
	}
	public double getDiem() {
		return diem;
	}
	public void inketqua() {
		System.out.println("Thông Tin SV");
		System.out.println("Tên Sinh Viên: "+getTen());
		System.out.println("Năm Sinh Sinh Viên: "+getNamsinh());
		System.out.println("Mã Sv Sinh Viên: "+getMasv());
		System.out.println("Điểm Sinh Viên:"+getDiem());
		System.out.println("-------");
	}
	
	public static void main(String[] args) {
		Student sv1 = new Student();
		Student sv2 = new Student();
		sv1.setTen("phi châu");
		sv1.setNamsinh(1998);
		sv1.setMasv("sv01");
		sv1.setDiem(7.87);
		sv1.inketqua();
		
		
		sv2.setTen("hải");
		sv2.setNamsinh(1998);
		sv2.setMasv("sv02");
		sv2.setDiem(7.87);
		sv2.inketqua();
		
		
		
	}
	
	
}
