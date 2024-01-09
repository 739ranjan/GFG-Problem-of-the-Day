//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            if(res.size()==0)
                System.out.print(-1);
            else {
                for(int i = 0;i<res.size();i++)
                    System.out.print(res.get(i) + " ");
            }
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> search(String pat, String txt)
    {
        ArrayList<Integer> res = new ArrayList<>();
        boolean flag = true;
        int prev = 1, patLen = pat.length();
        while(flag){
            int ind = txt.indexOf(pat);
            if(ind<0)
                flag = false;
            else{
                res.add(prev+ ind);
                prev = prev + ind + 1;
                txt = txt.substring(ind+1);
            }
        }
        return res;
    }
}
