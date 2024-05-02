package threads;

import java.util.Random;

class Producer implements Runnable {
    private Generator generator;
    int randomNumber;

    Producer(Generator generator) {
        this.generator = generator;
    }
    synchronized public void run() {
    	
    	   while(randomNumber!=9)
    	   {
             Random random = new Random();
        
            randomNumber = random.nextInt(10) + 1;
            generator.put(randomNumber);
            System.out.println("Producer generated: " + randomNumber);
    	   }
    }
}