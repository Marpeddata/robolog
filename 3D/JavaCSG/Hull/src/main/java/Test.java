import org.abstractica.javacsg.Geometry2D;
import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;
import org.abstractica.javacsgmodules.nodemcucutout.HumidSensorCutout;

public class Test
{
	public static void main(String[] args)
	{
		JavaCSG csg = JavaCSGFactory.createDefault();

		HumidSensorCutout humidSensorCutout = new HumidSensorCutout();

		csg.view(humidSensorCutout.getCutout(csg));





	}
}
