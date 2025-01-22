package de.zettsystems.oo;

import java.awt.*;

public class ObjectOrientedStyle {
    public static void main(String[] args) {
        System.out.println(getArea(new ObjOrCircle(new Point(5, 5), 4)));
        System.out.println(getArea(new ObjOrRectangle(new Point(1, 3), new Point(5, 9))));
    }

    public static double getArea(ObjOrShape objOrShape) {
        return objOrShape.getArea();
    }
}
