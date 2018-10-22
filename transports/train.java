/**
 * 
 */
package transports;

/**
 * @author lenovo
 *
 */
public class train extends transport
{
	private final double speed2=250;
	public train() {}
	public double time()
	{
		return dis/speed2;
	}
	public double money2()
	{
		return 0.45*speed2;
	}
	
}
