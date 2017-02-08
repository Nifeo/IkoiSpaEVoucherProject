/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IkoiEVoucher;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Rick
 */
public class test {
    public static void main(String[] args) throws IOException{
//        PdfItext pi = new PdfItext(new File("F:/Try00/copy01.pdf"), new File("F:/Try00/copy.pdf"));
//        pi.fillFormField("Recipient", "hwlloWorld");
//            pi.fillFormField("Title", "just a title");
//            pi.fillFormField("Recipient", "nobody");
//            pi.fillFormField("Vaild up to and including", "123");
//            pi.fillFormField("TreatmentDetail", "hahah");
//            pi.close();
//    Scanner sc = new Scanner(new FileInputStream(new File("F:/Try00/serviceManu.txt")) {});
//    sc.useDelimiter(";");
//    while(sc.hasNext()){
//        String str = sc.next();
//        System.out.println("1"+str);
//    }
       Desktop ds = Desktop.getDesktop();
       ds.open(new File("./test/try01.txt"));
    }
}
