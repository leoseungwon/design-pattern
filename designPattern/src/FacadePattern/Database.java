package FacadePattern;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private Map<String,Row> db = new HashMap<>();

    public Database() {
        db.put("John",new Row("1","John","Doe"));
        db.put("Jane",new Row("2","Jane","Doe"));
        db.put("Jim",new Row("3","Jim","Beam"));
        db.put("Jill",new Row("4","Jill","Doe"));
    }

    public Row getRow(String name){
        return db.get(name);

    }
}
