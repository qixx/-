/**
 * 
 */
package transports;

/**
 * @author lenovo
 *
 */
public class car extends transport
{
	private final double speed3=120;
	public car() {}
	public double time()
	{
		return dis/speed3;
	}
	public double money3()
	{
		return 0.32*speed3;
	}
}

