import java.io.*;

public class Prog2 {
	public static void main(String args[]) throws IOException {
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		int n,i,c=0;
		System.out.println("Enter the number");
		n = Integer.parseInt(in.readLine());
		for(i=2;i<=n/2;i++)
		{
		if(n%i==0)
		{ c=1;
		}
	}
		if(c==0)
		System.out.println(n+ " is a prime number");
		else
		System.out.println(n+ " is not a prime number");
		}
		
	}
		
		