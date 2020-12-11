package com.demo;

import java.util.ArrayList;
import java.util.List;

public class TargetSum {
	
	public static List<Integer> targetSum(int arr[],int target) {
		int res[]=new int[2];
		ArrayList<Integer> ll=new ArrayList<Integer>();
		
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			if((arr[start]+arr[end])==target) {
				ll.add(start);
				ll.add(end);
				break;
			}else if((arr[start]+arr[end])<target) {
				start++;
			}else {
				end--;
			}
		}
				
		return ll;
	}
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= {2,5,9,11};
		int target=11;
		List<Integer> res=targetSum(arr, target);
		System.out.println(res);
	
		
	}

}

