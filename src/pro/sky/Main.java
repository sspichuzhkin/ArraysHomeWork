package pro.sky;

public class Main {
    public static void main(String[] args) {
        Task1_1();
        Task1_2();
        Task1_3();
        Task2();
        Task3();
        Task4();
    }

    public static int[] Task1_1() {
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        return arr1;
    }

    public static double[] Task1_2() {
        return new double[]{1.57, 7.654, 9.986};
    }

    public static long[] Task1_3() {
        return new long[]{2L, 4L, 6L, 8L, 10L};
    }

    public static void Task2() {
        int[] arr1 = Main.Task1_1();
        for (int j = 0; j < arr1.length; j++) {
            if (j != arr1.length - 1) {
                System.out.print(arr1[j] + ", ");
            } else {
                System.out.print(arr1[j]);
            }
        }
        System.out.println();
        double[] arr2 = Main.Task1_2();
        for (int v = 0; v < arr2.length; v++) {
            if (v != arr2.length - 1) {
                System.out.print(arr2[v] + ", ");
            } else {
                System.out.print(arr2[v]);
            }
        }
        System.out.println();
        long[] arr3 = Main.Task1_3();
        for (int b = 0; b < arr3.length; b++) {
            if (b != arr3.length - 1) {
                System.out.print(arr3[b] + ", ");
            } else {
                System.out.print(arr3[b]);
            }
        }
        System.out.println();
    }

    public static void Task3() {
        int[] arr1 = Main.Task1_1();
        double[] arr2 = Main.Task1_2();
        long[] arr3 = Main.Task1_3();
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr1[i] + ", ");
            } else {
                System.out.print(arr1[i]);
            }
        }
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr2[i] + ", ");
            } else {
                System.out.print(arr2[i]);
            }
        }
        System.out.println();
        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr3[i] + ", ");
            } else {
                System.out.print(arr3[i]);
            }
        }
        System.out.println();
    }

    public static void Task4() {
        int[] arr1 = Main.Task1_1();
        for (int j = 0; j < arr1.length; j++) {
            if (arr1[j] % 2 != 0) {
                System.out.println(++arr1[j]);
            } else {
                System.out.println(arr1[j]);
            }
        }
    }
}