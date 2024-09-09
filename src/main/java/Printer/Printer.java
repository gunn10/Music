package Printer;

import Printer.config.TypeofPrint;

public abstract class Printer {
   //String type;
    int noOfPages;
    TypeofPrint typeofPrint;
  public  void print(int noOfPages, TypeofPrint typeofPrint){
        System.out.println("It can print"+noOfPages+"in"+typeofPrint);
    }

}
