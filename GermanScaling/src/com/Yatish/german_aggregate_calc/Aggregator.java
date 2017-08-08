package com.Yatish.german_aggregate_calc;

import java.security.PublicKey;

public class Aggregator {
    private double score;
    private int credit;
    private int totalcredit;
    private double total;
    private static int sub;
    public  Aggregator()
    {
        this(0.0,0,0);
    }
    public Aggregator(double score,int credit,int sub)
    {
        this.score=score;
        this.credit=credit;
        this.sub=sub;
    }

    public double getScore() {
        return score;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public double calculator(String[] values)
    {
        for(int i=0;i<values.length;i++)
        {
            String value=values[i].trim();
            int index0=value.indexOf(',');
            int index1=value.lastIndexOf(',');
            String scstr=value.substring(0,index0);
            //System.out.println(scstr);
            String crstr=value.substring(index1+1);
            //System.out.println(crstr);
            this.score=Double.parseDouble(scstr);
            this.credit=Integer.parseInt(crstr);
            this.totalcredit+=Integer.parseInt(crstr);
            this.total+=this.score*this.credit;
        }
        return total();
    }
    public double total()
    {
        return this.total=this.total/this.totalcredit;
    }

}
