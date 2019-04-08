package hackerrank;

public class Solution3 {
	public static void main (String []args) {
		 
		int[][] arr={	{6,8
						-6,9}					
						};
		
		int result = diagonalDifference(arr);
		System.out.println(result);
	}

	
	static int diagonalDifference(int[][] arr) {
		int sum = 0;
		int leftToRight = 0;
		int rightToLeft = 0;
		int row = 0;
		
		//laço de leftToRight (row 1, col 1) (row 2, col 2) , (row 3, col 3)
		for (int i = 0; i < arr.length; i++) {
			leftToRight = leftToRight + arr[i][i];
		}
		
		//laço de rightToLeft
		for (int col = arr.length-1; col >= 0; col--) {
			rightToLeft = rightToLeft + arr[row][col];
			row++;
		}
		
		//subtrai leftToRight de rightToleft
		sum = leftToRight - rightToLeft;
		
		//solucao alternativa para transformar em postivo
//		if(rightToLeft>leftToRight) {
//			sum = rightToLeft-leftToRight;
//		}else {
//			sum = leftToRight-rightToLeft;
//		}
		
		//retornar resultados sempres positvos
		sum =(sum)*(-1);
		
		//retorna o resultado da subtração
		return sum;
    }
	
}

