public class Main {

    public static void main(String[] args) {

        // Declare an array of integers with a length of 5
        int[] numbers = new int[5];

        // Initialize the array with some values
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        // Declare and initialize a second array of integers using curly braces
        int[] squares = {1, 4, 9, 16, 25};

        // Call the printArray method and pass both arrays as arguments
        printArray(numbers);
        printArray(squares);
    }

    public static void printArray(int[] arr) {

        // Loop through the elements of the array and print them
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
