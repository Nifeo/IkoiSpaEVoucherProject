package IkoiEVoucher;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rick
 */
public class Run {

    public static void main(String[] args) throws FileNotFoundException {
        LoadFile lf = new LoadFile("F:/Try00/serviceManu.csv");
        InputStream is = new FileInputStream(lf.getFile());
        Scanner sc = new Scanner(is);
        sc.useDelimiter(";");
//        while (sc.hasNext()) {
            System.out.println("123"+sc.next());
//        }
    }
}
