package com.company.decorator;

public class BorderDecorator extends ShapeDecorator{

    public BorderDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        //super.draw();
        decoratedShape.draw();
        System.out.println("Setting the border\n\n");
    }
}
