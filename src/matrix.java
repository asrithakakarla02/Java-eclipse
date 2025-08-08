public class matrix {
    public static void main(String[] args) {
        
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60}
        };
         int sum = 0;
        for (int i = 0; i < matrix.length; i++) { 
            for (int j = 0; j < matrix[i].length; j++) { 
                sum += matrix[i][j]; 
            }
        }
        System.out.println("Sum of all elements in the matrix: " + sum);
    }
}

