package array;
import java.util.Random;
import java.util.*;

	public class MainThread{
		
	    public static void main(String[] args) {
	       
	        int[][] arr = new int[3][4];
	        
	        Random rand = new Random();
	        
	        for (int i = 0; i < 3; i++) {
	        	
	            for (int j = 0; j < 4; j++) {
	                arr[i][j] = rand.nextInt(100) + 1; 
	            }
	        }

	       
	        Sthread[] threads = new Sthread[3];
	        for (int i = 0; i < 3; i++) {
	            threads[i] = new Sthread(arr[i]);
	            threads[i].start();
	        }
	        
	        int totalSum = 0;
	        try {
	            for (int i = 0; i < 3; i++) {
	                threads[i].join();
	                totalSum += threads[i].getSum();
	            }
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("Matrix:");
	        for (int[] row : arr) {
	            for (int value : row) {
	                System.out.print(value + "\t");
	            }
	            System.out.println();
	        }
	        System.out.println("Total sum of matrix elements: " + totalSum);
	    }
	}

