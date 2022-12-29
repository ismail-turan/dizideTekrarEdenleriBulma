import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        //Dizideki Tekrar Eden Sayıları Bulan Program
        System.out.print("\n!!! DİZİDEKİ TEKRAR EDEN SAYILARI BULAN PROGRAM !!!\n");

        int[] list1 = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        int[] duplicate = new int[list1.length];
        int startIndex1 = 0;

        String lst1 = Arrays.toString(list1);
        System.out.println("Liste: " + lst1);

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1.length; j++) {
                if ((i != j) && (list1[i] == list1[j])) {
                    if (!isFind(duplicate, list1[i])) {
                        duplicate[startIndex1++] = list1[i];
                    }
                    break;
                }

            }
        }

        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);
            }
        }


        //Dizideki Çift Sayıları Bulan Program
        System.out.print("\n!!! DİZİDEKİ ÇİFT SAYILARI BULAN PROGRAM !!!\n");

        int[] list2 = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        int[] even = new int[list2.length];
        int startIndex = 0;

        String lst2 = Arrays.toString(list2);
        System.out.println("Liste: " + lst2);

        for (int i = 0; i < list2.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if ((i != j) && (list2[i] % 2 == 0)) {

                    even[startIndex++] = list2[i];
                    break;

                }

            }
        }

        for (int value : even) {
            if (value != 0) {
                System.out.println(value);
            }
        }

    }
}