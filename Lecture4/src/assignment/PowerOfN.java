package assignment;

import java.util.Scanner;

public class PowerOfN {

	public static void main(String[] args) {

    	Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
        int temp=1;
		int n=sc.nextInt();

        while(n!=0)
        {
            temp=temp*x;
            n--;
        }
	
	    System.out.println(temp);

	}

}
