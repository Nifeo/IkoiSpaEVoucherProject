package IkoiEVoucher;

import java.io.BufferedReader;
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

    private ArrayList al;

    public LoadFile(String path) throws IOException {
        al = getResource(path);
    }

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

    public ArrayList<String> getArrayList() {
        return al;
    }
}
