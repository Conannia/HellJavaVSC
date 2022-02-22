package Polymorphism;


public abstract class Connection {
    protected String data;
    public void connect(){
        System.out.println("Connecting.....");
    }
    public void inputDate(String data) {
        this.data = data;
    }
}
