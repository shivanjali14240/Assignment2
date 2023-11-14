package com.bnt;

import java.util.Arrays;

public class KthSmallestElement {
	

	    public static int kthSmallest(int[] arr, int l, int r, int K) {
	        Arrays.sort(arr);

	        return arr[K - 1];
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {7, 10, 4, 3, 20, 15};
	        int N1 = arr1.length;
	        int K1 = 3;
	        System.out.println(kthSmallest(arr1, 0, N1 - 1, K1)); 

	        int[] arr2 = {7, 10, 4, 20, 15};
	        int N2 = arr2.length;
	        int K2 = 4;
	        System.out.println(kthSmallest(arr2, 0, N2 - 1, K2)); 
	    }
	}


