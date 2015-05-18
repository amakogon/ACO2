package week5.day1;

import week5.day1.dynamic_ds.Node;

import java.util.Arrays;

/**
 * Created by serhii on 18.05.15.
 */
public class TestSequenceArrayParam {

    public static void main(String[] args) {
        int[] mas = {1,2,3,4,5,6};
        testSimpleArr(mas);

        // sequence test
        testSeqArr();
        testSeqArr(1);
        testSeqArr(1,3);
        testSeqArr(1,3,345,24);

        //
        testSeqObj("Oleg",23,new Node());

    }

    public static void testSeqObj(Object...mas){

    }

    public static void testSeqArr(int...nums){
        int num = nums[0];
    }

    public static void testSimpleArr(int[] mas){
        int num = mas[2];
    }

}
