/**
 * 
 */
package transports;
import java.util.Scanner;
/**
 * @author lenovo
 *
 */
public class test
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		plane p1=new plane();
		train t1=new train();
		car c1=new car();
		Scanner reader=new Scanner (System.in);
		System.out.print("出发地：");
		c1.fname=t1.fname=p1.fname=reader.next();
		System.out.print("；目的地：");
		c1.dname=t1.dname=p1.dname=reader.next();
		System.out.print(" 距离：");
		c1.dis=t1.dis=p1.dis=reader.nextDouble();
		System.out.print(" 飞机时间："+p1.shows()+" 飞机票："+p1.money1());
		System.out.print(" 火车时间："+t1.shows()+" 火车票："+t1.money2());
		System.out.print(" 汽车时间："+c1.shows()+" 汽车票："+c1.money3());
	}

}
