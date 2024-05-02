package threads;
import java.util.Random;

public class Generator {
	
	    private int number;
	    private boolean available = false;

	    synchronized int take() {
	        while (!available) {
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        available = false;
	        notifyAll();
	        return number;
	    }

	    synchronized void put(int number) {
	        while (available) {
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        this.number = number;
	        available = true;
	        notifyAll();
	    }
	}

