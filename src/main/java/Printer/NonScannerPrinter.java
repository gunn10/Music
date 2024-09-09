package Printer;

import Printer.config.TypeofPrint;

public class NonScannerPrinter extends Printer implements Faxing,PhotoCopying{


    @Override
    public void fax() {
        System.out.println("It can do faxing");
    }

    @Override
    public void photocopy() {
        System.out.println("It can do photocopy");
    }
}
