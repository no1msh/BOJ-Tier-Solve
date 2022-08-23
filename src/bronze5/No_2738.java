package bronze5;

import java.io.*;

public class No_2738 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputSize = br.readLine().split(" ");
		
		int x = Integer.parseInt(inputSize[0]);
		int y = Integer.parseInt(inputSize[1]);
		
		String[][] matrix1 = new String[x][y];
		String[][] matrix2 = new String[x][y];
		int[][] matrixSum = new int[x][y];
		
		for (int i = 0 ; i < x; i++) {
			matrix1[i] = br.readLine().split(" ");
		}

		for (int i = 0 ; i < x; i++) {
			matrix2[i] = br.readLine().split(" ");
		}

		for (int i = 0; i < x ; i++){
			for (int j = 0; j < y ; j++){
				matrixSum[i][j] = Integer.parseInt(matrix1[i][j]) + Integer.parseInt(matrix2[i][j]);
				System.out.print(matrixSum[i][j] + " ");
			}
			System.out.println();
		}

	}

}
