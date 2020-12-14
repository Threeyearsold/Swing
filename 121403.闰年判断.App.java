package pac;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入年份：");
		int nian=sc.nextInt();
//		if (nian=0) {
//			System.out.println("公园分界线，既不是平年也不是闰年");
//		}
		if(nian<0){
			nian=nian*-1;
			nian=nian-1;
		}
		if(nian%4==0 && nian%100!=0){
			System.out.println("闰年");
		}else 
		if(nian%400==0 && nian%3200!=0){
			System.out.println("闰年");
		}else {
			System.out.println("平年");
		}
		sc.close();
	}
	
} 
  
