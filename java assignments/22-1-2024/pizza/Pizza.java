package pizza;

import java.util.*;

/**
 * 
 */
public class Pizza {

    /**
     * Default constructor
     */
    public Pizza() {
    }

    private double price;
    private IShape shape;

    public double getPrice() {
        // TODO implement here
        return price;
    }

    /**
     * @return
     */
    public IShape getShape() {
        // TODO implement here
        return shape;
    }

    /**
     * @param price 
     * @param shape
     */
    public Pizza(double price, IShape shape) {
        // TODO implement here
    	this.price = price;
    	this.shape = shape;
    }

}