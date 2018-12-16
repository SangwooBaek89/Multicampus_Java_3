package chapter11_180907;

import java.util.Scanner;

public class Fibonachi {

	static int arr[] = new int[100];
	
	public static int fibo(int n) {
		if(n == 1 || n == 2) return 1;
		if(arr[n] != 0) return arr[n];
		else return arr[n] = fibo(n-1) + fibo(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int result = fibo(num);
		System.out.println(result);
	}

}
