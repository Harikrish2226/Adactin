package com.sam;

import java.util.Arrays;
import java.util.Iterator;

public class Practice {

	public static void main(String[] args) {
		
		int a[] = { 10, 100, 90, 20, 40 }, temp;
		int b[] = new int[a.length-1];
		
		for(int i=0; i<a.length-1; i++) {
		
		 b[i]= a[i] - a[i+1];
		 System.out.println(b[i]);
	
		}
		

		for(int i=0; i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
			if(b[i]>b[j]) {
				temp= b[i];
				b[i]=b[j];
				b[j]=temp;
			}
		}
		}
		System.out.println(Arrays.toString(b));
		System.out.println(b[0]);
		System.out.println(b[b.length-1]);
		
		}
}



/*
 * int a[] = { 10, 100, 90, 20, 40 }; int temp;
 * 
 * for(int i=0; i<a.length;i++) { for(int j=i+1; j<a.length; j++) {
 * if(a[i]>a[j]) { temp=a[i]; a[i]=a[j]; a[j]= temp; } } }
 * //System.out.println(Arrays.toString(a)); for(int array : a) {
 * System.out.println(array); }
 */


//Arrays.sort(a);
//System.out.println(Arrays.toString(a));

// java 8
//Arrays.stream(a).sorted().forEach(System.out::println);



/*
 * String name = "Welcome To AiiTE Academy";
 * 
 * String[] ss = name.split(" ");
 * 
 * for (String s : ss) { System.out.println(s); }
 */

/*
 * String s = "madamm"; String rev ="";
 * 
 * char[] ch = s.toCharArray(); for(int i =ch.length-1; i>=0; i--) { rev = rev
 * +ch[i]; } if(s.equals(rev)) { System.out.println("palindrome"); }else {
 * System.out.println("Not palindrome"); }
 */

/*
 * String s = "Harikrishnan"; String rev = "";
 * 
 * for(int i =s.length()-1; i>=0;i--) { char ch = s.charAt(i); rev= rev + ch; }
 * System.out.println(rev);
 */

/*
 * int a = 0, b = 1, c = 0, sum=0;
 * 
 * for (int i = 1; i <= 10; i++) { c = a + b; sum = sum +c; a = b; b = c;
 * 
 * } System.out.println(sum);
 */

/*
 * int a = 10, b = 20;
 * 
 * a = a +b; b =a -b; a = a-b; System.out.println(a); System.out.println(b);
 */

/*
 * int a = 15, b = 2, temp;
 * 
 * temp = a; a =b; b=temp; System.out.println(a); System.out.println(b);
 */

/*
 * int a = 222; int sum = 0;
 * 
 * int i =0, j=0;
 * 
 * while(a>0) { i = a%10; sum= sum +i; a = a/10; } System.out.println(sum);
 */

/*
 * int a = 125; int count =0;
 * 
 * while(a>0){ a = a/10; count++; }
 * 
 * System.out.println(count);
 */

/*
 * for (int k = 1; k <= 600; k++) { int i = 0, j = 0; int a = k; int temp = a;
 * 
 * while (a > 0) { i = a % 10; j = j + (i * i * i); a = a / 10; } if (j == temp)
 * { System.out.println(j); } }
 */

/*
 * int a;
 * 
 * int i =0, j=0;
 * 
 * Scanner sc = new Scanner(System.in); System.out.println("Enter the Number");
 * a = sc.nextInt(); int temp =a;
 * 
 * 
 * while (a>0){ i = a %10; j = (j*10) +i; a = a/10; } if(j == temp){
 * System.out.println("palindrome"); }else{
 * System.out.println("Not a palindrome");
 * 
 * }
 */
/*
 * int a =123;
 * 
 * int i =0, j=0;
 * 
 * while(a>0){ i = a%10; j= (j*10) + i; a= a/10;
 * 
 * }
 * 
 * System.out.println(j);
 */

/*
 * int sum =0;
 * 
 * for(int i=1; i<=600; i++){
 * 
 * sum = sum+i; }
 * 
 * System.out.println(sum);
 */
/*
 * int sum =0;
 * 
 * for(int i=1; i<=100; i++){ if(i%2==1){ sum =sum +i; } }
 * 
 * System.out.println(sum);
 */

/*
 * int sum =0;
 * 
 * for(int i=1;i<=500;i++){ if(i%2==0){ sum = sum +i; } }
 * System.out.println(sum);
 */
/*
 * int count =0;
 * 
 * for(int i=1; i<=1000; i++){ if(i%2==0){ count++; } }
 * System.out.println(count);
 */

/*
 * int count =0;
 * 
 * for(int i=1; i<=100; i++){ if(i%2==0){ count++;
 * 
 * }
 * 
 * 
 * }
 * 
 * System.out.println(count);
 */

/*
 * int fact= 1;
 * 
 * for(int i=5; i>=1;i--){ fact = fact*i; } System.out.println(fact);
 */
