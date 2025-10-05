import java.util.Scanner;
public class forumlatihanswitchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang di warung enaak");
        System.out.println("Mau pesan apa? ");
        System.out.println("Pilihan menu: ");
        System.out.println("1. sate");
        System.out.println("2. pecel");
        System.out.println("3. penyetan");
        String pesan = input.nextLine();

        double totalHarga = 0; // ...changed code...

        switch (pesan) {
            case "1":
                System.out.println("Varian sate apa? (ayam/kambing)");
                String varian11 = input.nextLine();
                    if (varian11.equalsIgnoreCase("ayam")) {
                        System.out.println("Varian sate ayam harganya 1500/tusuk");
                        System.out.println("Mau pesan berapa tusuk? ");
                        int varian12 = input.nextInt();
                        input.nextLine(); // consume newline ...changed code...
                        int totalsateayam=1500*varian12;
                        totalHarga = totalsateayam; // ...changed code...
                        System.out.println("Total harga sate ayam adalah "+totalsateayam);    
                    } else if (varian11.equalsIgnoreCase("kambing")) {
                        System.out.println("Varian sate kambing harganya 3000/tusuk");
                        System.out.println("Mau pesan berapa tusuk? ");
                        int varian12 = input.nextInt();
                        input.nextLine(); // consume newline ...changed code...
                        int totalsatekambing=3000*varian12;
                        totalHarga = totalsatekambing; // ...changed code...
                        System.out.println("Total harga sate kambing adalah "+totalsatekambing);
                    } else {
                        System.out.println("Varian sate tidak tersedia");
                    }
                break;
            case "2":
                System.out.println("Lauk apa? (ayam/empal)");
                String varian21 = input.nextLine();
                    if (varian21.equalsIgnoreCase("ayam")) {
                        System.out.println("Pecel ayam harganya 13.000");
                        System.out.println("Mau pesan berapa porsi? ");
                        int varian22 = input.nextInt();
                        input.nextLine(); // consume newline ...changed code...
                        int totalpecelayam=13000*varian22;
                        totalHarga = totalpecelayam; // ...changed code...
                        System.out.println("Total harga pecel ayam adalah "+totalpecelayam);
                    } else if (varian21.equalsIgnoreCase("empal")) {
                        System.out.println("Pecel empal harganya 15.000");
                        System.out.println("Mau pesan berapa porsi? ");
                        int varian22 = input.nextInt();
                        input.nextLine(); // consume newline ...changed code...
                        int totalpecelempal=15000*varian22;
                        totalHarga = totalpecelempal; // ...changed code...
                        System.out.println("Total harga pecel empal adalah "+totalpecelempal);
                    } else {
                        System.out.println("Lauk tidak tersedia");
                    }
                break;
            case "3":
                System.out.println("Lauk apa?");
                System.out.println("1. tahu tempe");
                System.out.println("2. telur");
                System.out.println("3. ayam");

                String varian31 = input.nextLine();
                switch (varian31) {
                    case ("1"): {
                        System.out.println("Penyetan tahu tempe harganya 5.000");
                        System.out.println("Mau pesan berapa porsi? ");
                        int varian32 = input.nextInt();
                        input.nextLine(); // consume newline ...changed code...
                        int totaltahutempe=5000*varian32;
                        totalHarga = totaltahutempe; // ...changed code...
                        System.out.println("Total harga penyetan tahu tempe adalah "+totaltahutempe);
                        break;
                    }
                    case ("2"): {
                        System.out.println("Penyetan telur harganya 7.000");
                        System.out.println("Mau pesan berapa porsi? ");
                        int varian33 = input.nextInt();
                        input.nextLine(); // consume newline ...changed code...
                        int totaltelur=7000*varian33;
                        totalHarga = totaltelur; // ...changed code...
                        System.out.println("Total harga penyetan telur adalah "+totaltelur);    
                        break;
                    }                    
                    case ("3"): {
                        System.out.println("Penyetan ayam harganya 10.000");
                        System.out.println("Mau pesan berapa porsi? ");
                        int varian34 = input.nextInt();
                        input.nextLine(); // consume newline ...changed code...
                        int totalayam=10000*varian34;
                        totalHarga = totalayam; // ...changed code...
                        System.out.println("Total harga penyetan ayam adalah "+totalayam);
                        break;
                    }
                    default:
                        System.out.println("Maaf, menu tidak tersedia");
                        break;
                }
                break; // ...changed code...
        }
        if (totalHarga > 0) { // ...changed code...
            System.out.println("Apakah anda member? (ya/tidak)");
            String memberr=input.nextLine();
            if (memberr.equalsIgnoreCase("ya")) {
                double akhir = totalHarga * 0.95; // 5% diskon ...changed code...
                System.out.println("Anda mendapatkan diskon 5%");
                System.out.println("Total sebelum diskon: " + (int)totalHarga);
                System.out.println("Total setelah diskon: " + (int)akhir);
            } else {
                System.out.println("Anda tidak mendapatkan diskon");
                System.out.println("Total yang harus dibayar: " + (int)totalHarga);
            }
            input.close();
        }
    }   
}