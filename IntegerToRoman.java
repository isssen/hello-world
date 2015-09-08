package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by isssen on 15-9-6.
 */
public class IntegerToRoman {

    public static String intToRoman(int num) {
        String result="";
        int nums[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String []roman={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<nums.length;i++) {
            while (num >=nums[i]) {
                result += roman[i];
                num = num - nums[i];
            }
        }
        return result;

    }

    public static void main(String []args){
        System.out.println(intToRoman(2000));
    }
}
