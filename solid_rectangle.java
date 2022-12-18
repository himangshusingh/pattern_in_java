import java.io.*;
import java.util.*;

public class solid_rectangle{
    static void prints(int m, int n){
    	for(int i=1;i<=m;i++){				//keep count of rows
    		for(int j=1;j<=n;j++){			//keep count of columns
    			System.out.print("*");
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
output
input: 6  4
****                                                                                                                                                                                                   
****                                                                                                                                                                                                   
****                                                                                                                                                                                                   
****                                                                                                                                                                                                   
****                                                                                                                                                                                                   
****
*/