public class ArrayOps {
    public static void main(String[] args) {
       testFindMissingInt();
       testSecondMaxValue();
       testContainsTheSameElements();
       testIsSorted();
    }

    public static void testFindMissingInt () {
         int[] array = {3, 0, 1};
        int result1 = findMissingInt(array);
        System.out.println(result1);
    }

    public static void testSecondMaxValue () {
       int[] array = {3, 0, 1};
       int result2 = secondMaxValue(array);
       System.out.println(result2);
   }

   public static void testContainsTheSameElements () {
    int[] array1 = {-4, 5, 3, 1};
    int[] array2 = {1, -4, 5};
    boolean result = containsTheSameElements(array1, array2);
    System.out.println("Contains: " + result);
}

public static void testIsSorted () {
    int[] array = {3, 2, 4};
    boolean result = isSorted(array);
    System.out.println("Is sorted :" + result);
}

    public static int findMissingInt (int [] array) {
        int n = array.length;
        int expectedSum = 0;
        // Calculate the sum of integers from 1 to n
        for (int i = 0; i < n+1; i++) {
            expectedSum += i;
        }
        // Calculate the sum of array elements
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum = actualSum + array[i];
        }
        int missingInt = (expectedSum - actualSum);
        return (missingInt);
    }
    

    public static int secondMaxValue(int [] array) {
        int largest = 0;
        int secondLargest = 0;
        for (int i =0; i< array.length; i++){
            if(array[i] > largest){
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest){
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int n1 = array1.length;
        int n2= array2.length;
        for (int i = 0; i < n1; i++) {
            boolean found = false;
            for (int j = 0; j < n2; j++) {
                if (array1[i] == array2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        for (int i = 0; i < n2; i++) {
            boolean found = false;
            for (int j = 0; j < n1; j++) {
                if (array2[i] == array1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        int n = array.length;
        boolean increasing = true;
        for (int i = 0 ; i < n- 1; i++){
            if (array[i+1] < array[i]) {
                increasing = false;
                break;
            }
        }
        boolean decreasing = true;
        for (int i = 0; i < n - 1; i++) {
        if (array[i + 1] > array[i]) {
            decreasing = false;
            break;
        }
    }
        return increasing || decreasing;
    }
    }
