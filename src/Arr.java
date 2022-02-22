public class Arr {
    public static void main(String[] args) {
        int [] numbers = {1, 4, 6, 9, 13, 16};
        int oddSum = 0;
        int evenSum = 0;
        for (int number: numbers) {
            if (number %2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        System.out.println("Jumlah bilangan ganjil: "+ oddSum);
        System.out.println("Jumlah bilangan genap: "+ evenSum);

        String[] names = {"Ken", "Alfa", "Sanders"};
        System.out.println(names[0]);
        System.out.println(names[2]);

        names[0]="Candy";
        System.out.println(names[0]);
        
        for (int i=0; i<names.length; i++) {
            System.out.println("My name is "+ names[i]);
        }

        for (String name: names) {
            System.out.println("Nama saya adalah "+ name);
        }
    }
}
