 class Main1 {
    public static void main(String[] args) {
        String nama = "Yuni";
        String jenisKelamin = "Perempuan";
        String alamat = "Kurik";
        String noTelp = "085265121834";
        String email = "Yunitri@gmail.com";
        String hobby = "Memasak";
        String sd = "SD kurik";
        String smp = "SMP NEGERI 1 KURIK";
        String sma = "SMA NEGERI 1 KURIK";
        String keterampilankhusus = "Memasak";

        Main1 cv = new Main1();
        cv.printDataDiri(nama, jenisKelamin, alamat, noTelp, email, hobby, sd, smp, sma, keterampilankhusus);
    }

    public void printDataDiri(String nama, String jenisKelamin, String alamat, String noTelp, String email, String hobby, String sd, String smp, String sma,String keterampilankhusus) {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Jenis Kelamin\t: " + jenisKelamin);
        System.out.println("Alamat\t\t: " + alamat);
        System.out.println("No.Telp\t\t: " + noTelp);
        System.out.println("em@il\t\t: " + email);
        System.out.println("Riwayat Pendidikan");
        System.out.println("Hobby\t\t: " + hobby);
        System.out.println("a. SD\t\t: " + sd);
        System.out.println("b. SMP\t\t: " + smp);
        System.out.println("c. SMU/SMK\t: " + sma);
        System.out.println("Keterampilan Khusus :" + keterampilankhusus);
    }
}
