package ex_13_Arrays;

import java.util.Arrays;

public class Lab002_Max_Array {
    static void main() {
        int []array = {12, 45, 78, 98, 67, 99, 54};
            // find max number from the given array

//        Arrays.sort(array);
//        System.out.println(array[array.length-1]); // this is using in built functions


//        int max  = array[0];
//        for (int i = 0; i < array.length ; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//            System.out.println(max);

        //this is to find minimum number
        /*int min = array[0];
        for (int i = 0; i<array.length; i++){
            if (array[i]< min){
                min = array[i];
            }
        }
        System.out.println(min);
*/
        //this is to find 2nd max or 3rd max value
        int num = array[0];
        for (int i =0; i<array.length-4; i++){
            if (array[i]> num){
                num = array[i];
            }
        }
        System.out.println(num);

        }
}
