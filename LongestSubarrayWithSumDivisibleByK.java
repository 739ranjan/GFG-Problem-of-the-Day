//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0, prevSum = 0;
        for(int i=0; i<n; i++){
            prevSum += a[i];
            int rem = prevSum % k;
            if(rem == 0)
                maxLen = Math.max(maxLen, i+1);
            if(rem < 0)
                rem += k;
            if(map.containsKey(rem))
                maxLen = Math.max(maxLen, i-map.get(rem));
            else
                map.put(rem, i);
        }
        return maxLen;
    }
 
}


//{ Driver Code Starts.

// Driver class
class LongestSubarrayWithSumDivisibleByK {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    String line1 = br.readLine();
		    String[] element = line1.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		   
		    int res = obj.longSubarrWthSumDivByK(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		    
		    
		}
	}
}



// } Driver Code Ends
