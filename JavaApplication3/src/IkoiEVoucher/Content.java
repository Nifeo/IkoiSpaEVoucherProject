package IkoiEVoucher;


import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rick
 */
public class Content {

    private HashMap<String, String> map = new HashMap<>();
    

    public Content(String[] treartmentName, String[] treartmentDescription) {
        for(int x = 0; x < treartmentName.length; x++){
            map.put(treartmentName[x], treartmentDescription[x]);
        }
    }

    public String getContent(int indexNum, String key){
        return map.get(key);
    }
}
