import java.io.*;

class Demo
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strr = br.readLine();
		int t = Integer.parseInt(strr);
		while(t-->0)
	    {
	    	boolean checkx= false;
	    	boolean checky = false;
            strr = br.readLine();
	    	int n = Integer.parseInt(strr);
	    	String str[] = new String[n];
	    	for(int i=0;i<n;i++)
	    	{
	    		str[i] = br.readLine();
	    	}

	    	
	    	int half = n/2;
	    	int j=n-1;
	    	for(int i=0;i<half;i++,j--)
	    	{
	    	   if(str[i].equals(str[j]))
	    	   checkx = true;
	    	   
	    	   else
	    	   	{checkx = false;
	    	   		break;}

	    	}
	 
	    	for(int i=0;i<n;i++)
	    	{
	    		int half_1 = str[i].length()/2;
	    		String first_half = str[i].substring(0,half_1);
	    		if(str[i].length()%2!=0)
	    			half_1++;
	    		String second_half = str[i].substring(half_1);
	    		second_half = Demo.reverse(second_half);
	    		if(first_half.equals(second_half))
	    			checky = true;
	    		else
	    		{
	    			checky = false;
	    			break;
	    		}
	    	}
	    	if(checky && checkx)
	    		System.out.println("YES");
	    	else
	    		System.out.println("NO");


	    }

	}
	public static String reverse(String str)
	{
		String rev="";
		int length = str.length();
		for(int i=length-1;i>=0;i--)
			rev+=str.charAt(i);
		return rev;
	}
}