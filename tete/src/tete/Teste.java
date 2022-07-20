package tete;

import java.util.Scanner;

class Teste{

    public static void main(String[] args)
 {
       /* int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2!=0)
        {
            System.out.println("Weird");
        }
        else if(N >=2&&N<=5)
        {
            System.out.println("Not Weird");
        }
        else if(N>=6 && N <= 20)
        {    
            System.out.println("Weird");
        }
        else if(N>=20)
        {
            System.out.println("Not Weird");
        }
        scanner.close();*/
    	
    	
    	
    	
    	 /*Scanner sc=new Scanner(System.in);
         int x=sc.nextInt();
         sc.nextLine();
         double y=sc.nextDouble();
          sc.nextLine();
         String s=sc.nextLine();
         //Complete this code

         System.out.println("String: "+s);
         System.out.println("Double: "+y);
         System.out.println("Int: "+x);
         sc.close();*/
    	
    	Scanner tc = new Scanner(System.in);
    	int n =tc.nextInt();
    	
    	for(int i = 0; i <= 10; i++) {
    		System.out.println( n + " x " + i +  " = " + (n * i));
    	}
    	
    	tc.close();
    	
    	
    	
    }
}