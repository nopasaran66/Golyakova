public class Primes 
{
 public static void main(String[] args) 
 {
	 for(int i=1; i<=100; i++)
		 {
			if (IsPrime(i))
				System.out.println("Prostoe - "+i);	
			else 
				System.out.println("Sostavnoe - "+i);	
		}
 }
 public static boolean IsPrime(int n)
 {
	 for (int k=2;n>k;k++)
		{
			if (n%k==0)
			{
				return false;
			}
		}
		return true;
	}
 } 