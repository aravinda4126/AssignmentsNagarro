import java.util.ArrayList;

public class Assignment2 {

    // Answers for Part 01
    // part 01)
    // method for selection sort
    public static int[] selectionSort(int[] arr){
        for (int i=0; i<arr.length-1; i++){
            int min = arr[i];
            int minIndex=i;
            //go through the unsorted array an find the minimum element and corresponding index
            for (int j=i+1; j<arr.length; j++){
                if (min>arr[j]){
                    min=arr[j];
                    minIndex=j;
                }
            }
            //swap the minimum element with 1st element of unsorted array and it will put to the sorted array
            int temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    //method for print the array
    public static void printArray(int[] arr){
        for(int el: arr){
            System.out.print(el+" ");
        }
        System.out.println();
    }

    // part 01) a)
    //method to find the median of a sorted array
    public static void findMedian(int[] sortedArray){

        //get the array length
        int arrLength = sortedArray.length;

        //if the length is even, add two middle numbers and divided by 2.(since no exact middle number)
        if (arrLength%2==0){
            double medianVal1 = (sortedArray[(arrLength-1)/2] + sortedArray[((arrLength-1)/2)+1])/2d;
            System.out.println("Median : " + medianVal1);
            // if length is odd  get the exact middle number
        }else {
            int medianVal2 = (sortedArray[(arrLength-1)/2]);
            System.out.println("Median : " + medianVal2);
        }
    }

    // part 01) b)
    //method to find the highest value of an sorted array
    public static void findHighestValue(int[] sortedArray){

        //in a sorted array, last element is highest value
        int highestValue = sortedArray[sortedArray.length-1];
        System.out.println("Highest value : " + highestValue);
    }

    // part 01) c)
    //method to find the mode of a sorted array
    public static void findMode(int[] sortedArray) {
        //initially mode is equal to 0th value of array
        int mode = sortedArray[0];
        int previousValue = mode;
        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < sortedArray.length; i++) {
            //check current value is equal to previous value, if it is equal count will web increased
            //if not equal count will be reset and current value is assigned to previous value
            if (sortedArray[i] == previousValue) {
                count++;
            } else {
                count = 1;
                previousValue = sortedArray[i];
            }
            //if count of the current value higher than maxCount, maxCount will be reassigned and mode is previous value
            if (count > maxCount) {
                maxCount = count;
                mode = previousValue;
            }
        }
        System.out.println("Mode : " + mode);
    }
//  -----------------------------------------------------------------------------------------------------------------

    //part 02
    //method to find prime numbers
    public static void findPrimeNumbers(int[] arr){

        //create an instance from linked list class
        ArrayList<Integer>list = new ArrayList<>();

        //iterate through the array
        for (int i=0; i<arr.length; i++){

            //boolean variable to indicate an element is prime or not
            boolean isPrime = true;
            //if an integer divisible by only one and number itself it's a prime number
            for(int j=2; j<arr[i]; j++){
                if (arr[i]%j==0){
                    isPrime = false;
                    break;
                }
            }
            //if a number is prime, add it to the list
            if (isPrime){
                list.add(arr[i]);
            }
        }
        //print the list of prime numbers
        System.out.println("Prime numbers in given array : " + list);
    }


    //main method
    public static void main(String[] args) {

        int[] arr = {47, 84, 75, 21, 14, 14, 79};
        System.out.print("Given array : ");
        printArray(arr);

        System.out.println("---------------Part 01------------------");

        int[] sortedArray = selectionSort(arr);

        System.out.print("Sorted array : ");
        printArray(sortedArray);

        System.out.print("a)  ");
        findMedian(sortedArray);

        System.out.print("b)  ");
        findHighestValue(sortedArray);

        System.out.print("c)  ");
        findMode(sortedArray);

        System.out.println();
        System.out.println("---------------Part 02------------------");
        findPrimeNumbers(arr);
    }

}
