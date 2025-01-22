package de.zettsystems.oo;

import java.awt.*;

public sealed interface ObjOrShape {
    double getArea();
}

record ObjOrCircle(Point center, int radius) implements ObjOrShape {
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

record ObjOrRectangle(Point lowerLeft, Point upperRight) implements ObjOrShape {
    @Override
    public double getArea() {
        return Math.abs((upperRight.y - lowerLeft.y)
                * (upperRight.x - lowerLeft.x));
    }
}
