import org.abstractica.javacsg.Geometry2D;
import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;
import org.abstractica.javacsgmodules.nodemcucutout.NodeMCUBIGv2Cutout;

public class Test
{
	public static void main(String[] args)
	{
		JavaCSG csg = JavaCSGFactory.createDefault();

		//inner split
		Geometry2D circle = csg.circle2D(5, 64);
		Geometry3D ext = csg.linearExtrude( 4, false, circle);

		//outer grip
		Geometry2D circle2 = csg.circle2D(11, 360);
		Geometry3D ext2 = csg.linearExtrude( 4, false, circle2);

		Geometry2D pie = csg.cutoutPie2D(11, csg.degrees(0), csg.degrees(102.521));
		pie = csg.rotate2D(csg.degrees(-140)).transform(pie);

		Geometry3D ext3 = csg.linearExtrude( 4, false, pie);

		Geometry3D box = csg.box3D(2,7,4, false);
		box = csg.translate3DY(6).transform(box);

		Geometry3D grip = csg.difference3D(ext2, ext);
		grip = csg.difference3D(grip, ext3);
		grip = csg.union3D(grip, box);

		

		csg.view(grip);

	}
}
