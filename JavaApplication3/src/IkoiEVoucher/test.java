/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IkoiEVoucher;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Rick
 */
public class test {
    public static void main(String[] args) throws IOException{
        PdfItext pi = new PdfItext(new File("F:/Try00/copy01.pdf"), new File("F:/Try00/copy.pdf"));
//        pi.fillFormField("Recipient", "hwlloWorld");
//            pi.fillFormField("Title", "just a title");
            pi.fillFormField("Recipient", "nobody");
            pi.fillFormField("Vaild up to and including", "123");
            pi.fillFormField("TreatmentDetail", "hahah");
            pi.close();
    }
}
