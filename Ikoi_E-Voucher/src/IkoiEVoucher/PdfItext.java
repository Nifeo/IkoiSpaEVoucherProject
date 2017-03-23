package IkoiEVoucher;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import sun.tools.jar.Main;

/**
 *
 * @author Rick
 */
public class PdfItext {

    private final InputStream src;
    private final OutputStream dest;
    PdfDocument pdfDoc;
    String fileName;
    
    public PdfItext(String str) throws IOException{
        this.src = Main.class.getResourceAsStream("/src/E_Voucher.pdf");
        this.dest = new FileOutputStream(new File(System.getProperty("user.dir")+"\\"+str));
        this.pdfDoc = new PdfDocument(new PdfReader(this.src), new PdfWriter(this.dest));
    }

    public void fillFormField(String formName, String value) throws IOException {
        PdfAcroForm form = PdfAcroForm.getAcroForm(pdfDoc, true);
        Map<String, PdfFormField> fields = form.getFormFields();
        fields.get(formName).setValue(value);
        fields.get(formName).setReadOnly(true);
    }
     
    public void close(){
        pdfDoc.close();
    }
}
