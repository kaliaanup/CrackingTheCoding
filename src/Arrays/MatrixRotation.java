package Arrays;

public class MatrixRotation {
	 //derviation: Rotation
    //i,j => cols-j, i //can be seen from symmetry of matrices
    //keep substituing
    //cols-j, i => cols-i, cols-j
    //cols-i, cols-j => cols-(cols-j),cols-i => j, cols-i
    //j, cols -i => cols -(cols-i), j => i,j rotation is complete
    //M/2 since centre doesn't need to be rotated
    public void rotate(int[][] matrix) {
        for (int i = 0; i < (matrix.length+1)/2; i++) {
            for (int j = 0; j < matrix.length/2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length-j-1][i];
                matrix[matrix.length-j-1][i] = matrix[matrix.length-i-1][matrix.length-j-1];
                matrix[matrix.length-i-1][matrix.length-j-1] = matrix[j][matrix.length-i-1];
                matrix[j][matrix.length-i-1] = tmp;
            }
        }
    }
}
