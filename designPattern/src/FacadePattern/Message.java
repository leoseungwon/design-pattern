package FacadePattern;

public class Message {
    private Row row;

    public Message(Row row){
        this.row = row;
    }

    public String makeId() {
        return row.getId();
    }

   public String makeName(){
    return row.getName();
   }

   public String makeValue(){
    return row.getValue();
   }
}
