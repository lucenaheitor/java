package matriz;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		 Scanner tc = new Scanner(System.in);
		 
		 int n  = tc.nextInt();
		 int [][] mat = new int [n][n];
		 
		 for( int i =0; i<mat.length; i++) {
			 for(int j=0; j<mat[i].length; j++) {
				 mat[i][j] = tc.nextInt();
				 
			 }
		 }
		 
		 
		 
		 System.out.println("Main diagonal: ");
		 for (int i=0; i<mat.length; i++) {
			 System.out.print(mat[i][i] + " ");
		 }
		 System.out.println();
		 
		  int count = 0;
		  for(int i=0; i<mat.length; i++) {
			  for(int j=0; j<mat[i].length; j++) {
				  if(mat[i][i] <0) {
					  count++;
			  }
		  }
	    }
		  System.out.print("Negative Number: "  + count);
		 
		 tc.close();

	  
	}	  

}
