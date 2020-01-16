package com.usa.smarttechA;

public class Testlooping {
	public static void main(String[] args) {
		
		System.out.println("just for testing");
		int i;
		for(i = 0;i<=10; i++) {
		System.out.println(i);	
		}
		int j;
		for(j = 10;j>= 0;j--) {
			System.out.println("Ans true " +j);
		}
		int k;
		for(k = 1;k<= 10;k+=2) {
		System.out.println("increse 2:"+k); 
	}//direction under the parenthesis()
		int l;
		for( l = 100;l>=0; l-= 5) {
		System.out.println("Decrise 5:"+l);

}
		int a= 0;
		while(a<=4) {
			System.out.println("While Loop"+a);
			a++;//direction under the body
		}
		int b = 0;
		while(b<=10) {
			System.out.println(b);
			b++;
		}
		int c = 10;
		while (c>=0) {
			System.out.println(c);
			c--;
		}
		int d = 0;
		while(d<=10) {
			System.out.println(d);
			d+=2;
			int e= 10;
			while(e>=0) {
				System.out.println(e);
				e-=2;
			}
		}
		
	}
	
	
	}

