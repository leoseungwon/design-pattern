package FacadePattern;

public class Row {
    private String id;
    private String name;
    private String value;

    public Row(String id, String name, String value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    

    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
    
}
