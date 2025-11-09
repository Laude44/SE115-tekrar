import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        /*
        my answers to the questions:

        int[] myArr = {4, 8, 15, 16, 23, 42};

        a- the length of the array is       = 6,
        b- value of the first element is    = 4
        c- index is                         = 5
        d- it is                            = 15
        e- myArry[3]                        = 16
        f- console will show the exeption
         */

        // Senario 0: question 2
//        int[] myArr = {4, 8, 15, 16, 23, 42};
//     /*a*/   System.out.println(myArr.length);
//     /*b*/   System.out.println(myArr[0]); // First elements index is 0
//     /*c*/   System.out.println(myArr.length-1);
//     /*d*/   System.out.println(myArr[2]);
//     /*e*/   System.out.println(myArr[3]);
//     /*f*/   //System.out.println(myArr[10]); /* We saw the ArrayIndexOutOfBoundException error. Program saying that the value is bigger than the length of the array*/
//        System.out.println();
//        System.out.println();


        //Senario 1
//    int[] studentID = new int[20];
//    for(int i=0;i<studentID.length;i++){
//        studentID[i]=i+1000;

        //Senario 2
//        int[] randomArray = new int[random.nextInt(10,20)];
//        for(int i=0;i<randomArray.length;i++){
//            randomArray[i]=random.nextInt(100);
//        }
//        for(int i=0;i<randomArray.length;i++){          //This part prints the normal form of the array.
//            System.out.print(randomArray[i]);
//        }
//        System.out.println();
//        for(int i=0;i<randomArray.length;i++){          //This part prints the shifted form of the array.
//            System.out.print(arrayShifter(randomArray)[i]);
//        }





    }   

//        System.out.println(arrayExpander(studentID,42).length); //Prints the new length of the array




//    }

        // Senario 1
//    public static int[] arrayExpander(int[] a, int size){
//        int[] b = new int[size];
//        for(int i =0;i<a.length;i++){
//            b[i]=a[i];
//        }
//    return b;
//    }



        //Senario 2
//    public static int[] arrayShifter(int[] a){
//        int[] b = new int[a.length];
//        for(int i=0;i<a.length;i++){
//
//            if(i==a.length-1){
//                b[0]=a[a.length-1];
//                break;
//            }
//
//            b[i+1]=a[i];
//        }
//        return b;
//    }


}
