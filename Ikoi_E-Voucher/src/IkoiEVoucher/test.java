/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IkoiEVoucher;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;

/**
 *
 * @author Rick
 */
public class test {
    PDDocument document;

    public test() throws IOException {
        this.document = PDDocument.load(new File(System.getProperty("user.dir") + "\\" + "file/E_Voucher.pdf"));
        PDFRenderer pdr = new PDFRenderer(this.document);
        for(int x =0; x<this.document.getNumberOfPages(); x++){
//            BufferedImage bim = pdr.renderImageWithDPI(x, 300, ImageType.RGB);
        }
        
    }
}
