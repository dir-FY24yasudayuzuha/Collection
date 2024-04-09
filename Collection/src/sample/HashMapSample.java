package sample;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

    public static void main(String[] args) {
        Map<String, String> members = new HashMap<>();
        
        members.put("GK", "菅田");
        members.put("DF", "今野");
        members.put("MF", "中村");
        members.put("FW", "佐々木");
        
        String fw = members.get("FW");
        System.out.println("FW（削除前）：" + fw);
        
        members.put("FW", "本高");
        System.out.println("一番目の要素(置換後）：" + members.get("FW"));
        
        System.out.println("GK（削除前）： " + members.get("GK"));
        members.remove("GK");
        System.out.println("GKの要素（削除後）：" + members.get("GK"));
        
        // 拡張forループによる取得：entrySet
        for (Map.Entry<String, String> entry : members.entrySet()) {
            System.out.println("entrySet キー：" + entry.getKey() + ", 値：" + entry.getValue());
        }
        
        // 拡張forループによる取得：keySet
        for (String key : members.keySet()) {
            System.out.println("keySet キー：" + key + ", 値：" + members.get(key));
        }
        
        // 拡張forループによる取得：values
        for (String value : members.values()) {
            System.out.println("values 値：" + value);
        }
        
        int size = members.size();
        System.out.println("Mapのサイズ（クリア前）：" + size);
        members.clear();
        System.out.println("Mapのサイズ（クリア後）：" + members.size());
        
    }

}
