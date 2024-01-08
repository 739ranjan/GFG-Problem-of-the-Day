//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0)
        {
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            Node node1 = null;
            Node temp1 = null;
            for (int i = 0; i < N; i++) {
                int value = scanner.nextInt();
                Node newNode = new Node(value);
                if (node1 == null) {
                    node1 = newNode;
                    temp1 = node1;
                } else {
                    temp1.next = newNode;
                    temp1 = temp1.next;
                }
            }
    
            Node node2 = null;
            Node temp2 = null;
            for (int i = 0; i < M; i++) {
                int value = scanner.nextInt();
                Node newNode = new Node(value);
                if (node2 == null) {
                    node2 = newNode;
                    temp2 = node2;
                } else {
                    temp2.next = newNode;
                    temp2 = temp2.next;
                }
            }
    
            GfG gfg = new GfG();
            Node result = gfg.mergeResult(node1, node2);
    
            printList(result);
        }
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/* Structure of the node*/
/* class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
} */

class GfG
{
    Node reverse(Node node){
        if(node == null)
            return null;
        Node prev = null, next = null, curr = node;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    Node mergeResult(Node node1, Node node2)
    {
        if(node1 == null){
            return reverse(node2);
        }
        if(node2 == null){
            return reverse(node1);
        }
        
        Node curr1 = node1;
        Node curr2 = node2;
        Node res = new Node(-1);
        Node resCurr = res;
        if(curr1.data > curr2.data){
            resCurr.data = curr2.data;
            curr2 = curr2.next;
        }else{
            resCurr.data = curr1.data;
            curr1 = curr1.next;
        }
        
        while(curr1 != null && curr2 != null){
            if(curr1.data > curr2.data){
                resCurr.next = curr2;
                curr2 = curr2.next;
                resCurr = resCurr.next;
            }else{
                resCurr.next = curr1;
                curr1 = curr1.next;
                resCurr = resCurr.next;
            }
        }
        while(curr1 != null){
            resCurr.next = curr1;
            curr1 = curr1.next;
            resCurr = resCurr.next;
        }
        while(curr2 != null){
            resCurr.next = curr2;
            curr2 = curr2.next;
            resCurr = resCurr.next;
        }
        return reverse(res);
    }
}
