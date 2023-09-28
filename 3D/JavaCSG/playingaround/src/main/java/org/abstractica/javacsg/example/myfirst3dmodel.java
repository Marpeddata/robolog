package org.abstractica.javacsg.example;

import org.abstractica.javacsg.Geometry2D;
import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

public class myfirst3dmodel {

    public static void main(String[] args) {

        JavaCSG csg = JavaCSGFactory.createDefault();

        //rounded cornor
        Geometry2D square = csg.rectangle2D(40,40);
        Geometry2D square1 = csg.rectangle2D(5,5);

        Geometry2D circle = csg.circle2D(10,64);

        Geometry3D box = csg.linearExtrude(50, false, square);

        Geometry3D boxcopy = box;

        Geometry3D boxy = csg.linearExtrude(50, false, square1);

        Geometry3D boxx = csg.translate3DX(17.5).transform(boxy);
        Geometry3D box1 = csg.translate3DY(17.5).transform(boxx);


        Geometry3D box2 = csg.difference3D(boxcopy, box1);



        Geometry3D cylinder = csg.linearExtrude(60, false, circle);

        Geometry3D c1 = csg.translate3DX(15).transform(cylinder);
        Geometry3D c2 = csg.translate3DY(15).transform(c1);


        Geometry3D roundedshape = csg.difference3D(box,c2);

        Geometry3D finalround = csg.difference3D(roundedshape, box2);



        //finalround is the cookiecutter!

        //initial shape
        Geometry3D shape = csg.box3D(20,20,20,false);

        Geometry3D moveCutter = csg.translate3DX(-10).transform(finalround);
        Geometry3D moveCutter2 = csg.translate3DY(-10).transform(moveCutter);
        Geometry3D cut1edge = csg.difference3D(shape, moveCutter2);

//        Geometry3D rorate = csg.rotate3DZ(csg.degrees(90)).transform(moveCutter2);
//        Geometry3D moveRight = csg.translate3DX(0).transform(rorate);
//        Geometry3D cut2edge = csg.difference3D(cut1edge, moveRight);
//
//
//
//        Geometry3D liedown = csg.rotate3DY(csg.degrees(90)).transform(moveRight);
//        Geometry3D moveup = csg.translate3DZ(10).transform(liedown);
//        Geometry3D moveright1 = csg.translate3DX(-15).transform(moveup);
//        Geometry3D cut3edge = csg.difference3D(cut2edge, moveright1);


        Geometry3D rotate1 = csg.rotate3DY(csg.degrees(90)).transform(cut1edge);
        Geometry3D move1 = csg.translate3DX(-10).transform(rotate1);
        Geometry3D move2 = csg.translate3DZ(10).transform(move1);
        Geometry3D cut2edge = csg.difference3D(move2, moveCutter2);

        Geometry3D rotate2 = csg.rotate3DY(csg.degrees(90)).transform(cut2edge);
        Geometry3D move3 = csg.translate3DX(-10).transform(rotate2);
        Geometry3D move4 = csg.translate3DZ(10).transform(move3);
        Geometry3D cut3edge = csg.difference3D(move4, moveCutter2);

        Geometry3D rotate3 = csg.rotate3DY(csg.degrees(90)).transform(cut3edge);
        Geometry3D move5 = csg.translate3DX(-10).transform(rotate3);
        Geometry3D move6 = csg.translate3DZ(10).transform(move5);
        Geometry3D cut4edge = csg.difference3D(move6, moveCutter2);

        Geometry3D rotate4 = csg.rotate3DX(csg.degrees(90)).transform(cut4edge);
        Geometry3D move7 = csg.translate3DZ(10).transform(rotate4);
        Geometry3D move8 = csg.translate3DY(10).transform(move7);

        Geometry3D cut5edge = csg.difference3D(move8, moveCutter2);


        Geometry3D rotate5 = csg.rotate3DZ(csg.degrees(90)).transform(cut5edge);
        Geometry3D cut6edge = csg.difference3D(rotate5, moveCutter2);

        Geometry3D rotate6 = csg.rotate3DZ(csg.degrees(90)).transform(cut6edge);
        Geometry3D cut7edge = csg.difference3D(rotate6, moveCutter2);

        Geometry3D rotate7 = csg.rotate3DZ(csg.degrees(90)).transform(cut7edge);
        Geometry3D cut8edge = csg.difference3D(rotate7, moveCutter2);

        csg.view(cut8edge);






    }


}
