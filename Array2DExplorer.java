public class Array2DExplorer {

    public static void main(String[] args) {
        int array [][] = {  {4,1,8,5},
                {0,2,3,4},
                {6,6,2,2} };
        MyArray2DExplorer exp = new MyArray2DExplorer();

        System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array,0));
        System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array,2));

        System.out.println();

        System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array,1));
        System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array,0));

        System.out.println();


        System.out.print("Test minRow: \n Expecting: {0 2 3 4} \n Actual: {");
        int [] row = exp.minRowPractice(array);
        for(int i = 0; i < row.length; i++){
            System.out.print(row[i] + " ");
        }
        System.out.print("]");

        System.out.println();

        System.out.print("Test minRowAssignment: \n Expecting: 2 \n Actual: ");
        System.out.println(exp.minRowAssignment(array, 2));

        System.out.println();

        System.out.print("Test colMax: \n Expecting: {6 6 8 5} \n Actual: {");
        int [] colMaxs = exp.colMaxs(array);
        for(int i = 0; i < colMaxs.length; i++){
            System.out.print(colMaxs[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test allRowSum: \n Expecting: {18 9 16} \n Actual: {");
        int [] sum = exp.allRowSums(array);
        for(int i = 0; i < sum.length; i++){
            System.out.print(sum[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test averageCol: \n Expecting: {3.333333 3.0 4.333333 3.6666667} \n Actual: {");
        double [] avg = exp.averageCol(array);
        for(int i = 0; i < avg.length; i++){
            System.out.print(avg[i] + " ");
        }
        System.out.print("}");


        System.out.println();
        System.out.println();

        System.out.print("Test smallEven: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.smallEven(array));

        System.out.println();
        System.out.println();

        System.out.print("Test biggestRow: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.biggestRow(array));

        System.out.println();
    }

    public int minRow(int[][] nums, int row) {
        int minimum = nums[row][0];
        for(int c = 0; c<=nums[row].length; c++){
            if(nums[row][c] < minimum) {
                minimum = nums[row][c];
            }
        }
        return minimum;
    }

    //finish later idk how to do
    public static int[] colMaxs(int[][] matrix) {
        int columnMaximum = matrix[0][0];
        int[] colMaximums = new int[matrix.length];
        for (int c = 0; c <= matrix[c].length; c++){
            for(int r = 0; r <= matrix.length; r++) {
                if (matrix[r][c] > columnMaximum){
                        matrix[r][c] = columnMaximum;
                }
            }
            colMaximums[c] = columnMaximum;
        }
    }

    public int[] allRowSums(int[][] data) {
        int[] sums = new int[data.length];
        int rowSum = 0;
        for (int r = 0; r <= data.length; r++){
            for(int c = 0; c <= data[r].length; c++) {
                rowSum = rowSum + data[r][c];
            }
            sums[r] = rowSum;
        }
        return sums;
    }

    public double[] averageCol(int[][] nums) {
        double[] colAvgs = new double[nums[0].length];
        double avg = 0;
        double total = 0;
            for(int c = 0; c < nums[0].length; c++){
                for(int r = 0; r < nums.length; r++){
                    total = nums[r][c] + total;
                }
                avg = (double)total/nums.length;
                colAvgs[c] = avg;
                total = 0;
            }
            return colAvgs;
    }

    //That finds and returns the smallest even number in the array matrix. Assume that the array is filled with only positive ints.
    public int smallEven(int[][] matrix) {
        int evenMin = matrix[0][0];
        for (int r = 0; r <= matrix.length; r++) {
            for (int c = 0; c <= matrix[r].length; c++) {
                if ((matrix[r][c]>evenMin) && (matrix[r][c]%2 == 0){
                    evenMin = matrix[r][c];
                }
            }
        }
    }

    public static int biggestRow(int[][] nums){
        int total = 0;
        int bigTotal = 0;
        int bigIndex = 0;
        int [] rowSum = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums[i].length; j++){
                total = nums[i][j] + total;
            }
            if(total>bigTotal){
                bigTotal = total;
                bigIndex = i;
            }
            total = 0;
        }
        return bigIndex;
    }

}