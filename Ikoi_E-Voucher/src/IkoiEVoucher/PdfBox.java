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
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.tools.imageio.ImageIOUtil;

/**
 *
 * @author Rick
 */
public class PdfBox {

    public PdfBox(String dest) throws IOException{
        PDDocument dc = PDDocument.load(new File(System.getProperty("user.dir") + "\\" + dest + ".pdf"));
        PDFRenderer pdr = new PDFRenderer(dc);
        for (int x = 0; x < dc.getNumberOfPages(); x++) {
            BufferedImage bim = pdr.renderImageWithDPI(x, 300, org.apache.pdfbox.rendering.ImageType.RGB); 
            ImageIOUtil.writeImage(bim, System.getProperty("user.dir") + "\\" + dest + ".png", 300);
        }
        dc.close();
    }
}