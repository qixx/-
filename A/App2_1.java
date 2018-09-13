public class App2_1
{
	public static void main (String[] args)
	{
	int j=0;
	for(int i=99;i>=j;i--)
	{
	if(i!=0&&i!=1)
		System.out.println(i+"bottles");
	else if(i==1)
		System.out.println(i+"bottle");
	else
	System.out.println("no more bottle !");
	}
	}
}