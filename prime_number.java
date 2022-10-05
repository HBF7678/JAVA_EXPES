public class prime_number
{
	public static void main(String[] args)
	{
		int num=0,i=0;
		System.out.println("the print numbers from 1-1000 are:");
		for (num=2;num<=1000;num++)
		{
			int count=0;
			for (i=2;i<num/2;i++)
			{
			 if(num%i==0)
			  {
				count=1;
				break;
			  }
		    }
	     if(count==0)
	     System.out.println(" , "+num);
		}
	}
	
}
