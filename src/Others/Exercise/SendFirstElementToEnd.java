package Others.Exercise;

import java.util.Arrays;

public class SendFirstElementToEnd {

    public static void main(String[] args) {

        int[] a = {6,2,5,3};

        int[] b = new int[a.length];

        int[] c = new int[a.length];


        for (int i = 1,j=0 ; i < a.length; j++,i++) {   // int [] b = {2,5,3,0}

             b[j] = a[i];

        }
        for (int i = 0 , j=0; i < a.length ;  i++,j++) { // int [] c ={6,0,0,0}

            c[j] =a[i];
            break;
        }

        Arrays.sort(c);                                  // int [] c ={0,0,0,6}

        for (int i = 0,j=0; i < b.length; i++,j++) {

            if (b[i]>c[j]){
                c[j]=b[i];                               // first ===>  int [] a = {2,5,3}
            }else {
                c[j]=c[j];                               // second ==>  int [] a = {2,5,3,6}
            }

        }

        System.out.println(Arrays.toString(c));


    }
}
