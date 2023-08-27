package com.company.decorator;


//in order to fil the shape with a color
public class ColorDecorator extends ShapeDecorator{

    private  String color;
    public ColorDecorator(Shape shape, String color){
        super(shape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Filling the shape with the color " +color+ "\n\n");
    }
}
