
package bt2982024;

import java.util.Scanner;

public class Bt2982024 {

    public static float[] importData (float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<arrays.length; i++)
        {
            System.out.print("Nhap phan tu cua mang "+(i+1)+": ");
            arrays[i]= scanner.nextFloat();
        }
                return arrays;
    }
    public static void printData (float[] arrays) {
        for (int i=0; i<arrays.length; i++)
        {
            System.out.print(arrays[i]+" ");
        }
        System.out.println();
    }
    public static float findMax2 (float[] arrays) {
        float max1 = Float.MIN_VALUE;
        float max2 = Float.MIN_VALUE;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > max1) {
                max2 = max1;
                max1 = arrays[i];
            } else 
                if (arrays[i] > max2 && arrays[i] != max1) {
                max2 = arrays[i];
            }
        }
         if (max2 ==Float.MIN_VALUE) {
            System.out.println("k co so lon thu 2.");
        } else {
            System.out.println("So lon thu 2: " + max2);
        }
        return max2;
       
    }
    public static float[] deleteOddNumber(float[] arrays) {
        int dem = 0;
        for (int i=0; i<arrays.length; i++) {
            if (arrays[i] % 2 == 0) {
                dem++;
            }
        }

        float[] newArray = new float[dem];
        int index = 0;
        for (int i=0; i<arrays.length; i++) {
            if (arrays[i] % 2 == 0) {
                newArray[index++] = arrays[i];
            }
        }
        return newArray;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n=keyboard.nextInt();
        float[] arrays= new float[n];
        importData(arrays);
        System.out.print("Cac phan tu cua mang: ");
        printData(arrays);
        findMax2(arrays);
        System.out.print("Mang sau khi xoa cac so le: ");
        arrays=deleteOddNumber(arrays);
        printData(arrays);
    }
}
