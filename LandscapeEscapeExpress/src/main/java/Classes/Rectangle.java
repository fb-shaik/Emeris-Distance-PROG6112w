/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author nmagongo
 */
public class Rectangle
{
    private double length;
    private double width;

    public Rectangle(double length, double width)throws InvalidDimensionException
    {

        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) throws InvalidDimensionException
    {

        if (length <= 0)
        {
            throw new InvalidDimensionException("Length must be greater than zero.");
        }

        this.length = length;
    }
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width)
            throws InvalidDimensionException {

        if (width <= 0) {
            throw new InvalidDimensionException(
                    "Width must be greater than zero."
            );
        }

        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
    
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    
    
    
}
