package IkoiEVoucher;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.kernel.pdf.extgstate.PdfExtGState;
import com.itextpdf.layout.Document;
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
    PdfDocument pdfDoc;
    String fileName;

    public PdfItext(String filesrc, String filedest) throws IOException {
        InputStream src1 = new FileInputStream(new File(System.getProperty("user.dir") + "\\" + filesrc));
        OutputStream dest1 = new FileOutputStream(new File(System.getProperty("user.dir") + "\\" + filedest));
        this.pdfDoc = new PdfDocument(new PdfReader(src1), new PdfWriter(dest1));
    }

    public PdfItext() throws FileNotFoundException, IOException {
    }

    public void fillFormField(String formName, String value) throws IOException {
        PdfAcroForm form = PdfAcroForm.getAcroForm(pdfDoc, true);
        Map<String, PdfFormField> fields = form.getFormFields();
        fields.get(formName).setValue(value);
        fields.get(formName).setReadOnly(true);
    }

    public void imageToPDF(String filedest, String imageSrc) throws FileNotFoundException, IOException {
        PdfWriter pw = new PdfWriter(filedest);
        pdfDoc = new PdfDocument(pw);
        PageSize ps = new PageSize(PageSize.A4);
        Document dc = new Document(pdfDoc, ps);
        PdfCanvas canvas = new PdfCanvas(pdfDoc.addNewPage());
        ImageData image = ImageDataFactory.create(imageSrc);
        canvas.saveState();
        PdfExtGState state = new PdfExtGState();
        canvas.setExtGState(state);
        canvas.addImage(image,0,0,ps.getWidth(),false);
        canvas.restoreState();
        dc.close();
    }

    public PdfDocument getPdfDoc() {
        return pdfDoc;
    }
    
    public void close() {
        pdfDoc.close();
    }

    public String getFileName() {
        return fileName;
    }
}
