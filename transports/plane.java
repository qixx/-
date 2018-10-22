/**
 * 
 */
package transports;

/**
 * @author lenovo
 *
 */
public class plane extends transport
{
	private final double speed1=800;
	public plane() {}
	public double time()
	{
		return dis/speed1;
	}
	public double money1()
	{
		return 0.75*speed1;
	}
	
}
