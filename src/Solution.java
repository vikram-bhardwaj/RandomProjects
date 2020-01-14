import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	public static void main(String arg[])
	{
		int n = 10;
		int ar[] = {1,4,3,6,4,4,5,2,1,1};
		int a = sockMerchant(n, ar);
		System.out.println(a);
	}
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) 
    {
        int[] tArr;
        tArr = ar;
        Arrays.sort(tArr);
        System.out.println(tArr[0]);
        int count = 0;
        int result = 0;
        for(int i = 0; i < n; i++)
        {
            while(true)
            {
            	if(tArr.length != n)
            	{
	                if(tArr[i] == tArr[i+1])
	                {
	                    count++;
	                    i++;
	                }
	                else
	                    break;
            	}
            	else 
            		break;
            }
            result = result + (count/2);
        }
        return result;
    }

}