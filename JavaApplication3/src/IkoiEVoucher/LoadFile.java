package IkoiEVoucher;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rick
 */
public class LoadFile {

    private InputStream src;
    private File file;

    public LoadFile(String fileName) throws FileNotFoundException {
        setFile(fileName);
        this.src = new FileInputStream(getFile());
    }
    
    public LoadFile() throws FileNotFoundException {
        String defaultPath = "F:/Try00/serviceManu.csv";
        this.src = new FileInputStream(new File(defaultPath));
    }

    public InputStream getSrc() {
        return src;
    }

    public void setSrc(InputStream src) {
        this.src = src;
    }

    public File getFile() {
        return file;
    }

    public void setFile(String filePath) {
        this.file = new File(filePath);
    }


    
    
}
