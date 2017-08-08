package com.Yatish.german_aggregate_calc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] argc)
    {
        System.out.println("Please Enter total subject:");
        InputStreamReader sub=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(sub);
        try {
            String number = br.readLine();
            int num=Integer.parseInt(number);
            String[] score=new String[num];
            System.out.println("Please Enter subject score(,)subject credit:");
            Scanner s=new Scanner(System.in);
            for(int i=0;i<num;i++) {
                System.out.println("Please subject"+(i+1)+":");
                score[i]=s.nextLine();
            }
            Aggregator test=new Aggregator();
            double total=test.calculator(score);
            System.out.println("your total is:"+total);

           /* for (int j=0;j<num;j++)
            {
                System.out.println(score[j]);
            }*/
            //DecimalFormat df= new DecimalFormat("0.00");
            //System.out.println("result:"+ df.format(result));
        }
        catch(Exception ex){
            System.out.println("Error"+ex.getMessage());
        }

    }
}

