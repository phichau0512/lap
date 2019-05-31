package bt1;
import java.util.*;

/// switch
public class swich {
public static void main(String[] args)throws java.lang.Exception {
	  Scanner scanIn = new Scanner(System.in);
      boolean stop = false;
      while (!stop) {
          String input = "";
          System.out.println("Nhập Ngày bạn muống nhập:");
          input = scanIn.nextLine();
	
	switch (input) {
	case "2":
		System.out.println("bạn vừa nhạp ngày thứ hai");
		break;
	case "3":
		System.out.println("bạn vừa nhập ngày thứ ba");
		break;
	case "4":
		System.out.println("bạn vừ nhập ngày thứ tư");
		break;
	case "5":
		System.out.println("bạn vừa nhập ngày thứ năm");
		break;
	case "6":
		System.out.println("bạn vừa nhập ngày thứ sáu");
		break;
	case "7":
		System.out.println("bạn vừa nhập ngày thứ 7");
		break;
	case "8":
		System.out.println("bạn vừa nhập ngày CN");
		break;
	  case "exit":
          stop = true;
          break;
      case "0":
          stop = true;
          break;
	default:
		System.out.println("bạn nhập sai thứ");
		break;
	}
	       scanIn.close();
          System.exit(0);
      }
}
}
