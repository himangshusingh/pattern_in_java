import java.io.*;
import java.util.Scanner;

public class inverted_complete_triangle_spaced{
	static void prints(int m){
		for(int i=m;i>=1;i--){
			for(int space=(m-i);space>=1;space--){
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--){
				System.out.print("* ");
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