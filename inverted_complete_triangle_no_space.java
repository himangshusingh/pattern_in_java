import java.io.*;
import java.util.Scanner;

public class inverted_complete_triangle_no_space{
	static void prints(int row){
		for(int i=row;i>=1;i--){
			for(int space=(row-i);space>=1;space--){
				System.out.print(" ");
			}
			for(int j=2*i-1;j>=1;j--){
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