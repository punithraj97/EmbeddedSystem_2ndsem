package lambda;
import java.util.*;


interface example
{
	void average(Thread t,int size);
}

public class AverageThread extends Thread implements Runnable {
	
	static int size;
	 int num;
	 int average;
	 int [] arr;
	 Random rand=new Random();
	
	AverageThread()
	{}
	
	public static void calculate(Thread t,int siz)
	{
		size=siz;
		t.start();
		
	}
	
	public void run()
	{
		arr=new int[size];
		for(int i=0;i<size;i++)
		{
			num=rand.nextInt(10)+1;
			System.out.print(num+" ");
			arr[i]=num;
		}
		
		System.out.println();

		for(int i=0;i<size;i++)
			average +=arr[i];
		
		System.out.println("The average of" +" "+ size +" " + "numbers is "+ (average/size));
	}

	public static void main(String[] args) {
		
		
		AverageThread t1=new AverageThread();
		
		example ex=(t,n)->calculate(t,n);
		
		ex.average(t1,10);
		
		
	}

}
