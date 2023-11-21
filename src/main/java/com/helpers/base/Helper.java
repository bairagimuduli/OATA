package com.helpers.base;

public class Helper {
    public int find2ndLargest(int [] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if (arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }return secondLargest;
    }

    public void login(){
        System.out.println("U r logged in");
        System.out.println("changes");
    }

}
