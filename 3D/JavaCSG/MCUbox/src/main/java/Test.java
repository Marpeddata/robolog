import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;
import org.abstractica.javacsgmodules.nodemcucutout.NodeMCUBIGv2Cutout;
import org.abstractica.javacsgmodules.nodemcucutout.NodeMCUv2Cutout;

public class Test
{
	public static void main(String[] args)
	{
		JavaCSG csg = JavaCSGFactory.createDefault();

		NodeMCUv2Cutout cutout = new NodeMCUv2Cutout();
		NodeMCUBIGv2Cutout cutoutBig = new NodeMCUBIGv2Cutout();

		Geometry3D cutoutGeometry = cutout.getCutout(csg);
		Geometry3D cutoutGeometryBIG = cutoutBig.getCutout(csg);
		cutoutGeometry = csg.translate3DZ(3).transform(cutoutGeometry);
		cutoutGeometryBIG = csg.translate3DZ(3).transform(cutoutGeometryBIG);

		Geometry3D box = csg.box3D(30, 60, 7, false);
		Geometry3D boxBig = csg.box3D(36, 62, 7, false);

		Geometry3D result = csg.difference3D(box, cutoutGeometry);
		Geometry3D resultBig = csg.difference3D(boxBig, cutoutGeometryBIG);

		csg.view(resultBig);

	}
}
