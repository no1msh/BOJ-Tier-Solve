package anything;

import java.util.ArrayList;

public class SplitArrayList {

	static void splitFunc(ArrayList<Integer> dataList) {
		if (dataList.size() <= 1) {
			return;
		}
		
		int medium = dataList.size()/2;
		
		ArrayList<Integer> leftArr;
		ArrayList<Integer> rightArr;
		
		leftArr = new ArrayList<Integer>(dataList.subList(0, medium));
		rightArr = new ArrayList<Integer>(dataList.subList(medium, dataList.size()));
		
		System.out.println(leftArr);
		System.out.println(rightArr);
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> randomArr = new ArrayList<Integer>();
		
		for (int i = 0 ; i < 100 ; i++) {
			randomArr.add((int) (Math.random()*100));
		}
		
		splitFunc(randomArr);
	}

}
