import java.io.*;
import java.util.Scanner;

public class right_sided_triangle{
	static void prints(int m){
		for(int i=1;i<=m;i++){
			for(int space=1;space<=(m-i);space++){
				System.out.print(" ");
			}
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