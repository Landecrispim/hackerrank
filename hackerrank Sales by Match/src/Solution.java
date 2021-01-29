
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
    	int merchant =0;
    	int index;
    	
    	int[] flag = new int[n];
    	for (int i = 0; i < flag.length; i++) {
			flag[i]=0;
		}
    	
    	for (int i = 0; i < ar.length; i++) {
			if(flag[i]==0) {
				for (int j = i; j < flag.length; j++) {
					if(ar[j]==ar[i]) {		
						merchant++;
						ar[i]=1;
						ar[j]=1;
						break;
					}
				}
				
			}
		}
    	
    	
    	return merchant;
    	
    }


	public static void main(String[] args) throws IOException {
		
	}
}
