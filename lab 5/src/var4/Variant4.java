package var4;
import java.io.*;
import java.util.Scanner;

 class Variant4 {
     private static Scanner sc;
    public static void main(String[] args) throws FileNotFoundException{
        PrintWriter outputfile = new PrintWriter("MyFile4.txt");
        int Size;
        int i;
        int negative=0;
        sc= new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        Size = sc.nextInt();
        int[] a= new int[Size];
        System.out.println("Введите элемеенты массива:");
        for (i=0;i<Size;i++){
            a[i]= sc.nextInt();
        }

        for (i=0;i<Size;i++){
            if (a[i]<0){outputfile.println(a[i]);System.out.println(a[i]);}
        }

        for (i=0; i<Size;i++){
            if (a[i]<0){ negative=negative+1; }
            else { negative=negative+0; }
        }
        outputfile.println("Количество отрицательных чисел:"+negative);
        System.out.println("Количество отрицательных чисел:"+negative);
        outputfile.close();
       }}

