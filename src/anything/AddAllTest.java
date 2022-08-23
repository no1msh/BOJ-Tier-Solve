package anything;

import java.util.ArrayList;

public class AddAllTest {

	public static void main(String[] args) {
		ArrayList<Integer> testArr = new ArrayList<Integer>();
		ArrayList<Integer> leftArr = new ArrayList<Integer>();
		ArrayList<Integer> rightArr = new ArrayList<Integer>();
		
		rightArr.add(2);
		rightArr.add(3);
		
		testArr.addAll(leftArr);
		testArr.addAll(rightArr);
		
		System.out.println(testArr);
		
		
	}

}
