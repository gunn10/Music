package Printer;

import Printer.config.TypeofPrint;

public class PrinterService {
    Printer printer;

    PrinterService(Printer printer){
        this.printer=printer;
    }

   void fax(){
        if(printer instanceof Faxing){
          ((Faxing) printer).fax();
        }
        else{
            System.out.println("This printer does not support faxing");
        }
   }

   void scan(){
        if(printer instanceof Scanning){
            ((Scanning) printer).scan();
        }
        else{
            System.out.println("This printer does not scan");
        }
   }
   void photocopy(){
        if(printer instanceof PhotoCopying){
            ((PhotoCopying) printer).photocopy();
        }
        else{
            System.out.println("This printer does not support photocopy");
        }
   }
}
