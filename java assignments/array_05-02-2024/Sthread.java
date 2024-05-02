package array;
import java.util.Random;
import java.util.*;

public class Sthread extends Thread {

	    private int[] arr;
	    private int sum;

	    public Sthread(int[] row) {
	          arr = row;
	          sum = 0;
	    }

	    public int getSum() {
	        return sum;
	    }
	    public void run() {
	        for (int value : arr) {
	            sum += value;
	        }
	    }
}

	
	       
