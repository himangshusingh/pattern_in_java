import java.io.*;
import java.util.Scanner;

public class hollow_rectangle{
	static void prints(int m, int n){
		for(int i=1;i<=m;i++){
			//System.out.println("i: "+ i);
			for(int j=1;j<=n;j++){
				//System.out.println("j: "+ j);
				if(i==1 || i==m || j==1 || j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();

		prints(row,column);

	}
}


/*
Output: 

for input: 6 4

****                                                                                                                                                                        
*  *                                                                                                                                                                                                   
*  *                                                                                                                                             
*  *                                                                                                                                                            
*  *                                                                                                                                                                         
****

*/