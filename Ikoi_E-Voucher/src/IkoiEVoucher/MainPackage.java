package IkoiEVoucher;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Nifeo
 */
class MainPackage {
    private ArrayList serviceTitle, addonTitle, serviceDescription, addonDescription;
    private Content c1, c2;

    public MainPackage() throws IOException, Exception {
        this.serviceTitle = new ArrayList();
        this.serviceDescription = new ArrayList();
        this.addonTitle = new ArrayList();
        this.addonDescription = new ArrayList();
        addService(System.getProperty("user.dir") + "\\"+"file\\serviceManu.csv", this.serviceTitle, this.serviceDescription);
        addService(System.getProperty("user.dir")+"\\"+"file\\addon.csv", this.addonTitle, this.addonDescription);
        this.c1 = new Content(toStringArray(this.serviceTitle), toStringArray(this.serviceDescription));
        this.c2 = new Content(toStringArray(this.addonTitle), toStringArray(this.addonDescription));
    }
    
    public void addService(String path, ArrayList title, ArrayList description) throws IOException, Exception{
        LoadFile lf1 = new LoadFile(path);
        ArrayList al = lf1.getArrayList();
        for(int x = 0; x <= al.size() -1; x++){
            if(x%2==0){
                title.add(al.get(x));
            } else if(x%2!=0){
                description.add(al.get(x));
            }else{
                throw new Exception("something wrong!!! code: addService");
            }
        }
    }
    
    public String[] toStringArray(ArrayList al){
        String[] str = new String[al.size()];
        for(int x = 0; x <= al.size() -1; x++){
            str[x]=(String) al.get(x);
        }
        return str;
    }

    public ArrayList getAddonTitle() {
        return addonTitle;
    }

    public ArrayList getServiceTitle() {
        return serviceTitle;
    }

    public ArrayList getServiceDescription() {
        return serviceDescription;
    }

    public ArrayList getAddonDescription() {
        return addonDescription;
    }

    public Content getC1() {
        return c1;
    }

    public Content getC2() {
        return c2;
    }
    
}
