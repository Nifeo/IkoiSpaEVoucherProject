package IkoiEVoucher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

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

//    private InputStream src;
//    private File file;
    private ArrayList al;

    public LoadFile(String path) throws IOException {
        al = getResource(path);
    }

//    public LoadFile(String fileName) throws FileNotFoundException {
//        setFile(fileName);
//        this.src = new FileInputStream(getFile());
//    }
//    public LoadFile() throws FileNotFoundException {
//        String defaultPath = "F:/Try00/serviceManu.txt";
//        this.src = new FileInputStream(new File(defaultPath));
//    }
    public ArrayList<String> getResource(String path) throws IOException {
        InputStream is = this.getClass().getResourceAsStream(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String s = br.readLine();
        ArrayList<String> al = new ArrayList<String>();
        for (int x = 0; x < s.split(";").length; x++) {
            al.add(s.split(";")[x]);
        }
        return al;
    }

//    public InputStream getSrc() {
//        return src;
//    }
//
//    public void setSrc(InputStream src) {
//        this.src = src;
//    }
//
//    public File getFile() {
//        return file;
//    }
//
//    public void setFile(String filePath) {
//        this.file = new File(filePath);
//    }
    public ArrayList<String> getArrayList() {
        return al;
    }

//    public void copyFile(String path) throws FileNotFoundException, IOException {
//        FileInputStream input = (FileInputStream) this.getClass().getResourceAsStream(path);
//        FileOutputStream output = new FileOutputStream("c:/result.pdf");//可替换为任何路径何和文件名
//        int in = input.read();
//        while (in != -1) {
//            output.write(in);
//            in = input.read();
//        }
//    }
}
