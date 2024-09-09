package Printer;

import Printer.config.TypeofPrint;

public class Main
{
    public static void main(String[] args) {
        Printer nonFaxingprinter=new NonFaxingPrinter();
        nonFaxingprinter.print(7,TypeofPrint.COLOURED);
        PrinterService printerService=new PrinterService(nonFaxingprinter);
        printerService.fax();
        printerService.photocopy();
        printerService.scan();


    }
}
