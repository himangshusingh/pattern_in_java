import java.io.*;
import java.util.Scanner;

public class complete_triangle_no_space{
	static void prints(int row){
		for(int i=1;i<=row;i++){
			for(int space=1;space<=row-i;space++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
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