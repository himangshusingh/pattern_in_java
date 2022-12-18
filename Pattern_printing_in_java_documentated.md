# Rectangle Pattern

## Solid Rectangle

```
Output should be

for input: 6 4

****                                                                                                                                                                                                   
****                                                                                                                                                                                                   
****                                                                                                                                                                                                   
****                                                                                                                                                                                                   
****                                                                                                                                                                                                   
****


```

Code

```java
import java.io.*;
import java.util.*;

public class solid_rectangle{
    static void prints(int m, int n){
    	for(int i=1;i<=m;i++){
    		for(int j=1;j<=n;j++){
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();      //row = 6
		int column = sc.nextInt();   //column = 4

		prints(row,column);

	}
}

```


## Hollow Rectangle

```
Output: 

for input: 6 4

****                                                                                                                                                                        
*  *                                                                                                                                                                                                   
*  *                                                                                                                                             
*  *                                                                                                                                                            
*  *                                                                                                                                                                         
****
```

Code:

```java
import java.io.*;
import java.util.Scanner;

public class hollow_rectangle{
	static void prints(int m, int n){
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
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
```

## Triangle Pattern(s)

## Left Sided Right Triangle

Output:

```
for input 5

*                                                                                                                                                                                                      
**                                                                                                                                                                                                     
***                                                                                                                                                                                                    
****                                                                                                                                                                                                   
***** 
```

Code:
```java
import java.io.*;
import java.util.Scanner;

public class left_sided_right_triangle{
	static void prints(int m){
		for(int i=1;i<=m;i++){			//keeps control of depth 
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
```

## Right Sided Right Triangle

Output:
```
for input 5

    *                                                                                                                                                                                                  
   **                                                                                                                                                                                                  
  ***                                                                                                                                                                                                  
 ****                                                                                                                                                                                                  
*****
```

Code:
```java
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
```

## Complete Triangle (spaced)

Output: 
```
for input 5

    *                                                                                                                                                                                                  
   * *                                                                                                                                                                                                 
  * * *                                                                                                                                                                                                
 * * * *                                                                                                                                                                                               
* * * * *
```

This can be done in two ways
```java
//We can add an additional loop for keep count of space in either RIGHT SIDED TRIANGLE or LEFT SIDED TRIANGLE discussed above

//the loop is

for(int space=1;space<=row-i;space++){
	System.out.print(" ");
}
```

Code:
```java
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
```

## Complete Triangle (without space)

Output:
```
for input 5

    *               
   ***              
  *****             
 *******            
********* 
```

Code:
```java
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
```

## Inverted left sided Triangle

Output:

```
for input : 5

*****
****
***
**
*
```

Code:
```java
import java.io.*;

import java.util.Scanner;

  
public class inverted_left_sided_right_triangle{

    static void prints(int m){
        for(int i=m;i>=0;i--){          //keeps control of depth
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
```


## Inverted Right Triangle

Output:

```
for input: 5

*****
 ****
  ***
   **
    *
```

Code:
```java
import java.io.*;
import java.util.Scanner;

public class inverted_right_sided_triangle{
	static void prints(int m){
		for(int i=m;i>=1;i--){
			for(int space=(m-i);space>=1;space--){
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--){
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
```

## Inverted Complete Triangle (spaced)

Output: 
```
for input 8

* * * * * * * * 
 * * * * * * *
  * * * * * *
   * * * * *
    * * * *
     * * *
      * *
       *
```

Code: 
```java
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
```

## Inverted Complete Triangle Without Space

Output:
```
for input 5

*********
 *******
  *****
   ***
    *
```

Code:
```java
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
```

## Rhombus

Output: 
```
for input: 7

        *******
       *******
      *******
     *******
    *******
   *******
  *******
```

Code: 

```java
import java.io.*;
import java.util.Scanner;

public class rhombus{
	static void prints(int m){
		for(int i=m;i>=1;i--){
			for(int space=m;space>=(m-i);space--){
				System.out.print(" ");
			}
			for(int j=m;j>=1;j--){
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
```

