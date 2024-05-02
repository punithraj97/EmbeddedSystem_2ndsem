package lambda;

import java.util.*;

interface numbersort
{
	public void numsort(Thread t,int arr[]);
}

interface charactersort
{
	public void charsort(Thread t,char arr[]);
}

public class MultipleThreads extends Thread implements Runnable {
	
	static int arr[];
	static char arr1[];
	static int a=0,b=0;
	
	public MultipleThreads()
	{
		
	}
	
	public static void sort(Thread t,int arr1[])
	{
		a=1;
		arr=arr1;
		t.start();
	}
	public static void sort1(Thread t,char arr[])
	{
		b=1;
		arr1=arr;
		t.start();
	}
	
	public synchronized void run() {
		
		if(a==1)
		{
		Arrays.sort(arr);
		a=0;
		}
		else if(b==1)
		{
		Arrays.sort(arr1);
		b=0;
		}
	}
	
    
	public static void main(String[] args) {
		int[] numbers = {9, 5, 7, 2, 4, 6, 1, 8, 3, 10};
	    char[] characters = {'d', 'b', 'a', 'e', 'c'};
		
		MultipleThreads m=new MultipleThreads();
		MultipleThreads m1=new MultipleThreads();
		
		numbersort n=(t,arr)->sort(t,arr);
		charactersort s=(t,arr)->sort1(t,arr);
		
		n.numsort(m,numbers);
		s.charsort(m1,characters);
		
		System.out.println("After sorting integers and characters");
		
		for(int value:numbers)
		{
			System.out.print(value);
			System.out.print(" ");
		}
		
		System.out.println();
		
		for(char value:characters)
		{
			System.out.print(value);
			System.out.print(" ");
		}
			
		
}}
