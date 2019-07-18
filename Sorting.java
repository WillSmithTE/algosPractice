public class Sorting {

     public static void main(String []args){
        int[] unsorted = { 4, 3, 9, 2, 1 };
        int[] sorted = sort(unsorted);
        printArray(new int[]{1, 2, 3, 4, 9});
        printArray(sorted);
     }
     
     public static int[] selectionSort(int[] unsorted) {
         int length = unsorted.length;
         int[] sorted = unsorted;
         for (int i = length - 1 ; i >= 0 ; i--) {
             int maxIndex = 0;
             for (int j = 1 ; j <= i ; j++) {
                 if (sorted[maxIndex] < sorted[j]) {
                     maxIndex = j;
                 }
             }
             int placeHolder = sorted[i];
             sorted[i] = sorted[maxIndex];
             sorted[maxIndex] = placeHolder;
         }
         return sorted;
     }
     
     public static void printArray(int[] array) {
         for (int item : array) {
             System.out.print(item + " ");
         }
         System.out.println();
     }
}
