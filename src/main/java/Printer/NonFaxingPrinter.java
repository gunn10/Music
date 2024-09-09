package Printer;

import Printer.config.TypeofPrint;

public class NonFaxingPrinter extends Printer implements PhotoCopying,Scanning{

    @Override
    public void photocopy() {
        System.out.println("It can do photocopy");
    }

    @Override
    public void scan() {
        System.out.println("It can scan");
    }
}
