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
//        /*a*/
//        System.out.println(myArr.length);
//        /*b*/
//        System.out.println(myArr[0]); // First elements index is 0
//        /*c*/
//        System.out.println(myArr.length - 1);
//        /*d*/
//        System.out.println(myArr[2]);
//        /*e*/
//        System.out.println(myArr[3]);
//        /*f*/
//        //System.out.println(myArr[10]); /* We saw the ArrayIndexOutOfBoundException error. Program saying that the value is bigger than the length of the array*/
//        System.out.println();
//        System.out.println();
//
//
//        //Senario 1
//        int[] studentID = new int[20];
//        for (int i = 0; i < studentID.length; i++) {
//            studentID[i] = i + 1000;
//        }
//
//        //Senario 2
//        int[] randomArray = new int[random.nextInt(10, 20)];
//        for (int i = 0; i < randomArray.length; i++) {
//            randomArray[i] = random.nextInt(100);
//        }
//        for (int i = 0; i < randomArray.length; i++) {          //This part prints the normal form of the array.
//            System.out.print(randomArray[i]);
//        }
//        System.out.println();
//        for (int i = 0; i < randomArray.length; i++) {          //This part prints the shifted form of the array.
//            System.out.print(arrayShifter(randomArray)[i]);
//        }
//
//        //Senario 3
//        //Thsi part creates a statistic to use
//        String[] weatherStatistic = new String[100];
//        for (int i = 0; i < 100; i++) {
//            if (i < 40) {
//                weatherStatistic[i] = "Sunny";
//            } else if (i < 70) {
//                weatherStatistic[i] = "Cloudy";
//            } else if (i < 90) {
//                weatherStatistic[i] = "Rainy";
//            } else {
//                weatherStatistic[i] = "Stormy";
//            }
//        }
//        // This part simülates the 1 milloin day and count the number of days according to weather
//        double[] counter = new double[4];
//        int days = 1000000;
//        for (int i = 0; i < days; i++) {
//            String today = weatherStatistic[random.nextInt(100)];
//            if (today.equals("Sunny")) {
//                counter[0]++;
//            }
//            if (today.equals("Cloudy")) {
//                counter[1]++;
//            }
//            if (today.equals("Rainy")) {
//                counter[2]++;
//            }
//            if (today.equals("Stormy")) {
//                counter[3]++;
//            }
//        }
//        System.out.printf("The number of the sunny days is: %.0f %n", counter[0]);
//        System.out.printf("The number of the cloudy days is: %.0f %n", counter[1]);
//        System.out.printf("The number of the rainy days is: %.0f %n", counter[2]);
//        System.out.printf("The number of the stormy days is: %.0f %n", counter[3]);
//        System.out.println();
//        System.out.printf("The percentage of the sunny days is : %.2f %% %n", 100 * counter[0] / days);
//        System.out.printf("The percentage of the cloudy days is : %.2f %% %n", 100 * counter[1] / days);
//        System.out.printf("The percentage of the rainy days is : %.2f %% %n", 100 * counter[2] / days);
//        System.out.printf("The percentage of the stormy days is : %.2f %% %n", 100 * counter[3] / days);
//
//        //Senario 4
//        int[] integerArray = new int[30];
//        for (int i = 0; i < integerArray.length; i++) {
//            integerArray[i] = random.nextInt(1, 101);
//        }
//        int peakCounter = 0;
//        int gratestPeakValue = 0;
//        for (int i = 1; i < integerArray.length - 1; i++) {
//            if (integerArray[i] > integerArray[i - 1] && integerArray[i] > integerArray[i + 1]) {
//                System.out.println("integerArray[" + i + "] is a peak and its value is: " + integerArray[i]);
//                peakCounter++;
//            }
//            if (gratestPeakValue < integerArray[i]) {
//                gratestPeakValue = integerArray[i];
//            }
//        }
//        System.out.println("The number of the peaks are: " + peakCounter);
//        System.out.println("The gratest peak is : " + gratestPeakValue);
//
//        System.out.println(arrayExpander(studentID, 42).length); //Prints the new length of the array
//
//        //Bonus problem
        int[][] scores = new int[5][5]; // 5 student and 4 quizes but 5 rows. İn order to show students on the top row.
        int highestScore = 0;
        int[] highestScoreİndex = new int[2];
        highestScoreİndex[0]=0;
        highestScoreİndex[1]=0;
        for (int i = 0; i < scores.length; i++) {
            scores[i][0] = i + 1;
            System.out.printf("%01d    ", scores[i][0]);
        }
        System.out.println();
        for (int i = 1; i < scores.length; i++) {
            System.out.println();
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = random.nextInt(101);
                if (scores[i][j] > highestScore) {
                    highestScore = scores[i][j];
                    highestScoreİndex[0]=i;
                    highestScoreİndex[1]=j;
                }
                if (scores[i][j]==highestScore){
                    if(i>highestScoreİndex[0]){
                        highestScore=scores[i][j];
                        highestScoreİndex[0]=i;
                        highestScoreİndex[1]=j;
                    } else if (i<highestScoreİndex[0]) {
                        continue;
                    }
                    else {
                        if(j>highestScoreİndex[1]){
                            highestScore=scores[i][j];
                            highestScoreİndex[0]=i;
                            highestScoreİndex[1]=j;
                        }
                        else {continue;}
                    }
                }
                System.out.printf("%02d   ", scores[i][j]);
            }
        }
        System.out.println("The highest score is : " + highestScore+" and it is the student number "+highestScoreİndex[0]+". Quiz number is "+highestScoreİndex[1]);
//    }
//
//
//    // Senario 1
//    public static int[] arrayExpander(int[] a, int size) {
//        int[] b = new int[size];
//        for (int i = 0; i < a.length; i++) {
//            b[i] = a[i];
//        }
//        return b;
//    }
//
//
//    //Senario 2
//    public static int[] arrayShifter(int[] a) {
//        int[] b = new int[a.length];
//        for (int i = 0; i < a.length; i++) {
//
//            if (i == a.length - 1) {
//                b[0] = a[a.length - 1];
//                break;
//            }
//
//            b[i + 1] = a[i];
//        }
//        return b;
    }
}


