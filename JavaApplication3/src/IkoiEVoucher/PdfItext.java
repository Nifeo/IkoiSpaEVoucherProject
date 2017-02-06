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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

/**
 *
 * @author Rick
 */
public class PdfItext {

    private InputStream src;
    private OutputStream dest;
    PdfDocument pdfDoc;

    public PdfItext(File src, File dest) throws FileNotFoundException, IOException{
        this.src = new FileInputStream(src);
        this.dest = new FileOutputStream(dest);
        this.pdfDoc = new PdfDocument(new PdfReader(this.src), new PdfWriter(this.dest));
    }

    public void fillFormField(String formName, String value) throws IOException {
        PdfAcroForm form = PdfAcroForm.getAcroForm(pdfDoc, true);
        Map<String, PdfFormField> fields = form.getFormFields();
        fields.get(formName).setValue(value);
        pdfDoc.close();
    }
}
