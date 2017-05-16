package com.cg.testnode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3,3,3,3,3,6,5,5,5,5,7,6,5};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A){
		int retVal = 0;
		
		List<Integer> list = new ArrayList<>();
		
		for(int i : A) {
			list.add(i);
		}
		
		Collections.sort(list);
		int j=0;
		int k=0;
		int tempVal = 0;
		for(int i=1; i < list.size(); i++) {
			if(list.get(k) == list.get(i)) {
				j++;
				tempVal= tempVal + j;
			} else {
				retVal = tempVal + retVal;
				k=i;
				j=0;
				tempVal = 0;
			}
		}
		
		System.out.println(retVal);
		
		return retVal;
	}

}
