package com.company.decorator;

public class Main {

    public static void main(String[] args) {

        //let's create a circle with a border
            Shape circle = new Circle();
            ShapeDecorator circleWithBorder = new BorderDecorator(circle);
            circleWithBorder.draw();

            // let's create a triangle with a border
            Shape triangle = new Triangle();
            ShapeDecorator triangleWithBorder = new BorderDecorator(triangle);
            triangleWithBorder.draw();

            //let's create a red circle
            Shape rectangle = new Rectangle();
            ShapeDecorator redRectangle = new ColorDecorator(rectangle, "red");
            redRectangle.draw();


            //let's create a bordered red triangle
            Shape triangle1 = new Triangle();
            Shape borderedTriangle = new BorderDecorator(triangle1);
            Shape borderedRedTriangle = new ColorDecorator(borderedTriangle,"red");
            borderedRedTriangle.draw();



    }
}


// An application which can be used to draw different shapes.
//Circles, squares, triangles, rectangles etc...
//classes:
//Shape.java(parent class)
//1.Circle.java
//2.Rectangle.java
//3.Triangle.java
//....
//Red Circle -> SolidCircle.java
//Circle with a dotted border -> CircleWithDottedBorder.java
//Red Rectangle -> SolidRectangle.java
//Blue Triangle -> SolidTriangle.java
//Rectangle with border -> RectangleWithBorder.java
//......

//we will end up writting a lot of classes.
//so lets use the Decorator pattern to create the objects.