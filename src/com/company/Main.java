package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int missingInt(int[] a)
    {
        int missing= 0;
        Arrays.sort(a);
        for(int i = 0; i < a.length; i++)
        {
            int x = a[i];
            int y = a[i + 1];
            if(y != x + 1)
            {
                missing = y;
                break;
            }
        }
        return missing;
    }
}
