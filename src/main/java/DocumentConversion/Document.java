package DocumentConversion;

public abstract class Document {
    public  final void sequence() {
        open();
        read();
        convert();
        save();
    };

   public abstract void open();
   public abstract void read();
   public void convert(){
       System.out.println("Converted to HTML");
   }
   public void save(){
       System.out.println("It is saved!");
   }
}
