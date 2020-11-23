package pac;

public class zuobiao {
	public static void main(String[] args) throws InterruptedException {
		int arr[][]={
				{123,122},
				{546,466},
				{34,77},
				{999,666},
		};
		while (true) {
			Thread.sleep(1000);
			System.out.println("一秒已经过去了！");
			int rdm=(int)(Math.random()*10%4);
			System.out.println(arr[rdm][0]+","+arr[rdm][1]);
		}
	}
}
