package org.abstractica.javacsg.example;

import org.abstractica.javacsg.Geometry2D;
import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

public class myfirst3dmodel {

    public static void main(String[] args) {
        JavaCSG csg = JavaCSGFactory.createDefault();

        Geometry3D test = csg.box3D(5,5,10,true);
        Geometry3D testExt = csg.box3D(4,4,12,true);

        Geometry3D box = csg.rotate3DX(csg.degrees(90)).transform(test);
        Geometry3D boxY = csg.rotate3DY(csg.degrees(90)).transform(test);
        Geometry3D boxExt = csg.rotate3DX(csg.degrees(90)).transform(testExt);
        Geometry3D boxExty = csg.rotate3DY(csg.degrees(90)).transform(testExt);

        Geometry2D circle = csg.circle2D(5,64);
        Geometry3D circlebox = csg.linearExtrude(5,false, circle);

        Geometry3D union = csg.union3D(box,test,boxY);

        Geometry3D unionExt = csg.union3D(boxExt,testExt, boxExty);


        Geometry3D boxer = csg.difference3D(union, unionExt);




        csg.view(boxer);
//        csg.view(circlebox);
    }


}
