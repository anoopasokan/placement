//package job;

import java.util.*;

public class bit3 {

	public static int findmod4(int m){
		if(m % 4 == 0)
			return m;
		else if(m % 4 == 1)
			return 1;
		else if(m % 4 == 2)
			return m + 1;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int result1 = findmod4(m - 1);
		int result2 = findmod4(n);
		System.out.println("result is : " + (result1 ^ result2));
	}

}
