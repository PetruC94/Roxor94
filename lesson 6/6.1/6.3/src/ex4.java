import java.util.Scanner;

class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();

        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSeq = 1;
        int tempSeq = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {              // if nextElement > previousElement
                tempSeq++;                          // increase tempSeq
                if (maxSeq < tempSeq) {             // if maxSeq < tempSeq
                    maxSeq++;                       // increase maxSeq
                }
            } else if (arr[i] <= arr[i - 1]) {      // else if  nextElement <= previousElement
                tempSeq = 1;
            }
        }
        System.out.println(maxSeq);
    }
}