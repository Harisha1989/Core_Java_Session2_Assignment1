public class PatternX 
{
	public static void main(String[] args) 
	{
		int num=5; // Pattern provided in statement is in 5 lines
		System.out.println("Printing X Pattern -\n");
		for(int i=0;i<num;i++) //this loop is used to enter into new line
		{
	        for(int j=0;j<num;j++) // this loop is used for printing the pattern
	        {
	            if(j==i || j==num-i-1) 
	                System.out.print("*");
	            else 
	                System.out.print(" ");
	        }
	        System.out.println();
		}
	}

}
