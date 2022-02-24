package DasarKelas;

public class Main {
    public static void main(String[] args) {
        Person.printData(Person.fullName("Ken", "Sanders"), 26, 1.75, 45.0);
        Person.printData(Person.fullName("Ryan", "Black"), 34, 1.89, 70.0);
        Person.printData(Person.fullName("Franklyn", "Alpha", "Sanders"), 38, 1.88, 70.0);
    }
}
