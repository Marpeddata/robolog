package org.abstractica.javacsgmodules.nodemcucutout;

import org.abstractica.javacsg.Geometry2D;
import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;

public class HumidSensorCutout {


    double width = 19.63;
    double heightToLegs = 13.80;
    double thickness = 1.52;
    double thicknessWithPin = 5.65;
    double widthPin = 4.92;
    double pinLength = 8.73;
    double widthBetweenLegs = 6.4;





    public Geometry3D getCutout(JavaCSG csg){
        Geometry2D body = csg.rectangle2D(width, heightToLegs);

        Geometry3D body1 = csg.linearExtrude(thickness, false, body);

        Geometry2D pin = csg.rectangle2D(widthPin, pinLength);

        Geometry3D pin1 = csg.linearExtrude(thicknessWithPin, false, pin);

        Geometry2D mid = csg.circle2D(widthBetweenLegs,64);

        Geometry3D midform = csg.linearExtrude(thickness+1, false, mid);

        midform = csg.translate3DY((-((heightToLegs-11.16)+heightToLegs)*0.5)).transform(midform);

        body1 = csg.difference3D(body1,midform);

        pin1 = csg.translate3DY(heightToLegs-(4.13+2.53)).transform(pin1);

        Geometry3D base = csg.union3D(pin1,body1);

        return base;

    }

}
