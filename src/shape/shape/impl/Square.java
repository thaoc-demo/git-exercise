package shape.shape.impl;

import shape.shape.IShape;

public class Square implements IShape {

    private double l; //length of the sides of the square

    public Square(double l){
        this.l = l;
    }

    public double getArea() {
        return l*l;
    }
}
