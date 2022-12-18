import java.io.*;
import java.util.Scanner;

public class inverted_left_sided_right_triangle{
	static void prints(int m){
		for(int i=m;i>=0;i--){			//keeps control of depth 
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int depth=sc.nextInt();
		
		prints(depth);		
	}
}