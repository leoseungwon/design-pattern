package FacadePattern;

public class Facade { //복잡한 실행로직을 추상화
    private Database database;
    private Cache cache;

    public Facade() {
        this.database = new Database();
        this.cache = new Cache();
    }

    public void run(String name) {
        Row row = cache.get(name);
        if(row == null){
            row = database.getRow(name);
            if(row != null){
                cache.put(name,row);
            }
        }
        if(row != null){
            Message message = new Message(row);
            System.out.println(message.makeId());
            System.out.println(message.makeName());
            System.out.println(message.makeValue());
        }
        else{
            System.out.println("Row not found");
        }
        
    }
    
}
