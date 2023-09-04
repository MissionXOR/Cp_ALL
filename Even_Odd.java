public class Even_Odd {
    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        int n = 8;
        int array[] = { 23, 55, 54, 9, 76, 66, 2, 91 };
        int evenSize = 0;
        int oddSize = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0)
                evenSize++;
            else
                oddSize++;
        }
        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];
        int j = 0, k = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0)
                even[j++] = array[i];
            else
                odd[k++] = array[i];
        }
        System.out.print("Even Array contains: ");
        printArray(even);
        System.out.print("Odd Array contains: ");
        printArray(odd);
    }
}