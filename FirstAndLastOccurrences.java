package com.bnt;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastOccurrences {
	    public static List<Integer> firstAndLast(int[] arr, int N, int X) {
	        List<Integer> result = new ArrayList<>();
	        result.add(findFirstOccurrence(arr, N, X));
	        result.add(findLastOccurrence(arr, N, X));
	        return result;
	    }

	    private static int findFirstOccurrence(int[] arr, int N, int X) {
	        int low = 0, high = N - 1, result = -1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            if (arr[mid] == X) {
	                result = mid;
	                high = mid - 1;
	            } else if (arr[mid] < X) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return result;
	    }

	    private static int findLastOccurrence(int[] arr, int N, int X) {
	        int low = 0, high = N - 1, result = -1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            if (arr[mid] == X) {
	                result = mid;
	                low = mid + 1;
	            } else if (arr[mid] < X) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {1, 3, 3, 4};
	        int N1 = arr1.length;
	        int X1 = 3;
	        System.out.println(firstAndLast(arr1, N1, X1));

	        int[] arr2 = {1, 2, 3, 4};
	        int N2 = arr2.length;
	        int X2 = 5;
	        System.out.println(firstAndLast(arr2, N2, X2)); 
	    }
	}


