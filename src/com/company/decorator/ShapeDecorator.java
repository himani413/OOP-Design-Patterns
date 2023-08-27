package com.company.decorator;

public class ShapeDecorator implements  Shape{

    protected Shape decoratedShape;

    public  ShapeDecorator(Shape shape){
        this.decoratedShape = shape;
    }
    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
