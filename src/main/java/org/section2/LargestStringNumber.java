package org.section2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LargestStringNumber {
    public static void main(String[] args) {
        System.out.println(getLargestNumber());
    }

    public static String getLargestNumber(){
        int[] nums = {3,30,34,5,9};
       //List<Integer> numbers = Arrays.asList(3,30,34,5,9);
        String[] numStrings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrings[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numStrings, (a, b) -> {
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1);
        });

        if (numStrings[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String num : numStrings) {
            sb.append(num);
        }
        return sb.toString();
    }
}

