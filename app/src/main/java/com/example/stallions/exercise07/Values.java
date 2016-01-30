package com.example.stallions.exercise07;

/**
 * Created by STALLIONS on 1/29/2016.
 */
public class Values {

  String result;


    public String getnumber(String number){
       this.result=number;

        return result;
    }

    public int add(){

        //Chopping out the numbers from the String and putting the numbers in an array
        String[] elements = this.result.split("\\+");
        int[] numbers = new int[elements.length];
        for(int i = 0;i < elements.length;i++)
        {

            numbers[i] = Integer.parseInt(elements[i]);
        }

        //adding the numbers
        int sum=0;
        for (int j : numbers)
            sum += j;
            return sum;
    }


}
