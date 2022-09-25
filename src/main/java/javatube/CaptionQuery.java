package javatube;

import java.util.*;

public class CaptionQuery {
    Map<String, Captions> langCodeIndex = new HashMap<>();
    public CaptionQuery(ArrayList<Captions> captions){
        for(Captions code : captions){
            langCodeIndex.put(code.code, code);
        }
    }
    public Captions getCode(String code){
        return langCodeIndex.get(code);
    }
}