package com.jin;

public class Date implements Comparable<Date>{

private int year;
private int month;
private int day;

public Date(int month, int day, int year){   
   this.month = month;
   this.day = day;
   this.year = year;
}

public int getYear(){
   return this.year;
}

public int getMonth(){
   return this.month;
}

public int getDay(){
   return this.day;
}
public String toString(){
   return month + "/" + day + "/" + year;
}


public int compareTo(Date other){
    if (this.year!=other.year){
        return this.year-other.year;
    } else if (this.month != other.month){
        return this.month-other.month;
    } else {
        return this.day-other.day;
    }
}
}