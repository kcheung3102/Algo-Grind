package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	//Contains Duplicates
        //Hmmm where to start. OH! OICE
        // O: boolean
        // I: Array of integers
        // C: N/A
        // E: What if the array is not numbers,

        System.out.println(containsDuplicate());

    }


    //Duplicate checker
   private static boolean containsDuplicate() {
       int[] nums =  new int[] {1,1,5,3,3,4};
        //if the array is empty or if the array does not contain numbers
        if(nums == null) {
            return false;
        } else if(nums.length == 0){
            return false;
        }

        //Sort the array
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }
}
