package com.java.lhd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements you want to insert in list :");
		int n = sc.nextInt();
		System.out.println("Start entering the elements:");
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		sort(list, 0, list.size() - 1);
		System.out.println("The sorted list is: ");
		System.out.println(list);
		sc.close();
	}

	public static void sort(List<Integer> list, int from, int to) {
	    if (from < to) {
	        int pivot = from;
	        int left = from + 1;
	        int right = to;
	        int pivotValue = list.get(pivot);
	        while (left <= right) {
	            // left <= to -> limit protection
	            while (left <= to && pivotValue >= list.get(left)) {
	                left++;
	            }
	            // right > from -> limit protection
	            while (right > from && pivotValue < list.get(right)) {
	                right--;
	            }
	            if (left < right) {
	                Collections.swap(list, left, right);
	            }
	        }
	        Collections.swap(list, pivot, left - 1);
	        sort(list, from, right - 1); 
	        sort(list, right + 1, to);   
	    }
	}
}
