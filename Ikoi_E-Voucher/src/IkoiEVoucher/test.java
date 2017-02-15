/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IkoiEVoucher;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import sun.tools.jar.Main;

/**
 *
 * @author Rick
 */
public class test {
//    public class Resource {
//            public void getResource() throws IOException{
//                    //返回读取指定资源的输入流
//                    InputStream is=this.getClass().getResourceAsStream("/resource/res.txt");
//                    BufferedReader br=new BufferedReader(new InputStreamReader(is));
//                    String s="";
//                    while((s=br.readLine())!=null)
//                            System.out.println(s);
//            }
//    }
    public static void main(String[] args) throws IOException{
//        InputStream src = Main.class.getResourceAsStream("/E_Voucher.pdf");
        System.out.print(Main.class.getResourceAsStream("/src/E_Voucher.pdf"));
//        OutputStream dest = new FileOutputStream(new File("C:/E_Voucher1.pdf"));
//        PdfReader pr = new PdfReader(src);
//        PdfWriter pw = new PdfWriter(dest);
//        PdfDocument pdfDoc = new PdfDocument(new PdfReader(src), new PdfWriter(dest));
//        PdfItext pi = new PdfItext();
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
//       Desktop ds = Desktop.getDesktop();
//       ds.open(new File("./test/try01.txt"));
//        LoadFile lf = new LoadFile("/src/serviceManu.csv");
//        ArrayList al = lf.getArrayList();
//        for(int x = 0; x < al.size(); x++){
//            System.out.println(al.get(x));
//        }
//        System.out.println(Main.class.getResource("/E_Voucher.pdf").toString());
    }
}
