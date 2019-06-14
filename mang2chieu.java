import java.util.Scanner;



public class mang2chieu {
public static void main(String[] args) {
	  int x, y, z, number, sum=0;
      float average;
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("nhap hang so phan tu x: ");
      x = scanner.nextInt();
      System.out.println("nhap hang so phan tu y: ");
      y = scanner.nextInt();
      System.out.println("nhap hang so phan tu z: ");
      z = scanner.nextInt();
      
      int[][][] A = new int[x][y][z];
      for(int i=0 ; i<x; i++){
          for(int j = 0; j < y; j++){
              for(int l=0; l<z; l++){
          System.out.print("nhap phan tu thu:[" + i + "," + j + "," + l +"] :");
          A[i][j][l]= number= scanner.nextInt();
          sum += number;
          }}}
          System.out.println("Mảng vừa nhập: ");
      for (int i = 0; i < x; i++) {
          for (int j = 0; j < y; j++) {
              for(int l=0; l<z; l++){
          System.out.print(A[i][j][l] + "\t");
      }
      }
          System.out.println("\n");
      }
      average=(float)sum/(x*y*z);
      System.out.println("trung bình cộng: " + average);  
}
}
