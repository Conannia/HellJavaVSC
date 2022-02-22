public class App {
    public static void main(String[] args) {
        String name = "Nurul Hidayati";
        int age = 26;
        double height = 1.6;
        double weight = 43.5;
        double bmi = weight / height /  height;
        
        System.out.println("Nama saya adalah " + name);
        System.out.println("Saya berusia "+ age +" tahun.");
        System.out.println("Tinggi saya adalah "+ height + " meter.");
        System.out.println("Berat badan saya adalah " + weight + " kilogram.");
        System.out.println("BMI saya adalah " + bmi);
        
        System.out.println(true || false);
        System.out.println(false && true);
        System.out.println(8<5 && 3>=2);
        System.out.println(8<5 || 3>=2);
        System.out.println(!(8<5));

        if (true) {
            System.out.println("Kondisi adalah true. Cetak...");
        }
        int x = 8;
        if(x>2) {
            System.out.println("x lebih besar dari 2");
        }

        int number = 12;
        if (number < 10) {
            System.out.println("Angkanya lebih kecil dari 10");
        } else if (number < 20) {
            System.out.println("Angkanya sama dengan atau lebih dari 10, tetapi kurang dari 20");
        } else {
            System.out.println("Angkanya sama dengan atau lebih besar dari 20");
        }

        int umur = 16;
        switch (umur%3) {
            case 0:
            System.out.println("Dapat dibagi 3");
            break;
            case 1:
            System.out.println("Sisanya 1 ketika dibagi 3");
            break;
            case 2:
            System.out.println("Sisanya 2 Ketika dibagi 3");
            break;
        }

        String grade = "G";
        switch (grade) {
            case "A":
                System.out.println("Sempurna");
                break;
            case "B":
                System.out.println("Bagus");
                break;
            case "C":
                System.out.println("Cukup");
                break;
            case "D":
                System.out.println("Anda lulus");
                break;
            case "E":
                System.out.println("Anda gagal");
            default:
                System.out.println("Nilai tidak valid");
                break;
        }

        int angka= 10;
        while(angka>0){
            System.out.println(angka);
            angka--;
        }

        for (int i=1; i<=10; i++) {
            System.out.println("Hitungan loop: " +i);
        }

        System.out.println("===loop while===");
        int a = 1;
        while (a<10) {
            if(a%5==0){
                break;
            }
            System.out.println(a);
            a++;
        }

        System.out.println("=== loop for ===");
        for (int j = 1; j < 10; j++) {
            if(j%3==0){
                continue;
            }
            System.out.println(j);
        }
    }
}
