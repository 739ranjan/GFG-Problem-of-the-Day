//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            long a;
            a = Long.parseLong(br.readLine().trim());
            
            
            long b;
            b = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            long res = obj.sumOfPowers(a, b);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static long factorPowerSum(long n) {
        long sum = 0;
        long factor = 2;
        while (n > 1) {
            long power = 0;
            while (n % factor == 0) {
                n /= factor;
                power++;
            }
            sum += power;
            factor++;
            if (factor > Math.sqrt(n) && n > 1) {
                sum++;
                break;
            }
        }
        return sum;
    }

    public static long sumOfPowers(long a, long b) {
        long ans = 0;
        for(long i=a; i<=b; i++){
            ans += factorPowerSum(i);
        }
        return ans;
    }
}
        
