package IkoiEVoucher;


import java.util.ArrayList;
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

    private final ArrayList<HashMap<String, String>> ls = new ArrayList<>();

    public void addTreartment(String key, String content) {
        HashMap<String, String> map = new HashMap<>();
        map.put(key, content);
        ls.add(map);
    }
    
    public String getContent(int indexNum, String key){
        return ls.get(indexNum).get(key);
    }
}
