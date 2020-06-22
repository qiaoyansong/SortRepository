package main;

import util.SortUtil;

public class Test {
	public static void main(String[] args) {
		//Hello World
		int[] arr = new int[] {8,3,2,1,7};
		SortUtil.selectSort(arr);
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("[");
		for (int i : arr) {
			sBuilder.append(i);
			sBuilder.append(",");
		}
		sBuilder.reverse();
		sBuilder.deleteCharAt(0);
		sBuilder.reverse();
		sBuilder.append("]");
		System.out.println(sBuilder);
	}
}
