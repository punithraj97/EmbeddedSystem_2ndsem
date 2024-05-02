package threads;

class Consumer implements Runnable {
    private Generator generator;
    int number;

    Consumer(Generator generator) {
        this.generator = generator;
    }

    synchronized public void run() {
    	
    	 while(number!=9)
    	 {
        
           number = generator.take();
            System.out.println("Consumer consumed: " + number);
    	 }
    }
}
