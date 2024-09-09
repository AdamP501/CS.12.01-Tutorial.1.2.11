public class DiverseArray {

    public static int arraySum(int[] arr)
    {
        int sum = 0;
        for (int i : arr)
        {
            sum += i;
        }
        return sum;
    }

    public static int[] rowSums (int[][] arr2D)
    {
        int sum = 0;
        int index = 0;
        int[] finalArray = new int[arr2D.length];


        for (int row = 0; row < arr2D.length; row++) {    //sum each row of the 2D array
            for (int i = 0; i < arr2D[row].length; i++) {
                sum += arr2D[row][i];
            }

            finalArray[index] = sum;  //assign the value of sum to the corresponding element in the 1D array
            sum = 0;
            index++;
        }

        return finalArray;
    }

    public static boolean isDiverse (int[][] arr2D)
    {
        int[] sums = rowSums(arr2D);

        //check if there are any repeating elements in the 1D array
        for (int index1 = 0; index1 < sums.length; index1++){
            for (int index2 = 0; index2 < sums.length; index2++)
            {
                if (sums[index1] == sums[index2] && index1 != index2) //condition: the current element in the idex equals another element that doesn't have the same index
                {
                    return false;
                }
            }
        }
        return true;
    }
}
