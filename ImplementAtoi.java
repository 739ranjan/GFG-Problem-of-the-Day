//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class ImplementAtoi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String s) {
	    int sign = 1;
	    int i=0;
	    if(s.charAt(0) == '-'){
	        sign = -1;
	        i++;
	    }
	    int num = 0;
	    for(; i<s.length(); i++){
	        char ch = s.charAt(i);
	        if(ch >='0' && ch<='9'){
	            num = (num * 10) + (ch - '0');
	        }else{
	            return -1;
	        }
	    }
	    return num * sign;
    }
}
