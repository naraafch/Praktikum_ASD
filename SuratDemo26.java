import java.util.Scanner;
public class SuratDemo26 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StackSurat26 stack= new StackSurat26(5);
        int pilih;

        do{
            System.out.println("======= MENU =======");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Lihat Semua Surat");
            System.out.print("Pilih menu: ");
            pilih= sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat        : ");
                    String idSurat= sc.nextLine();
                    System.out.print("Nama            : ");
                    String nama= sc.nextLine();
                    System.out.print("Kelas           : ");
                    String kelas= sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenisIzin= sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari)   : ");
                    int durasi= sc.nextInt();

                    Surat26 surat= new Surat26(idSurat, nama, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.println("Surat izin dari "+nama+" berhasil diterima.");
                    System.out.println();
                    break;
            
                case 2:
                    Surat26 proses= stack.pop();
                    if(proses!=null) {
                        String jenis= (proses.jenisIzin=='S') ? "Sakit":"Izin";
                        System.out.println("Nama          : "+proses.namaMahasiswa);
                        System.out.println("ID Surat      : "+proses.idSurat);
                        System.out.println("Kelas         : "+proses.kelas);
                        System.out.println("Jenis Izin    : "+jenis);
                        System.out.println("Durasi        : "+proses.durasi+" hari");
                        System.out.println("Status      : Surat berhasil diproses.");
                        System.out.println();
                    }
                    break;

                case 3:
                    Surat26 teratas= stack.peek();
                    if(teratas!=null) {
                         String jenis= (teratas.jenisIzin=='S') ? "Sakit":"Izin";
                        System.out.println("  ID Surat   : "+teratas.idSurat);
                        System.out.println("  Nama       : "+teratas.namaMahasiswa);
                        System.out.println("  Kelas      : "+teratas.kelas);
                        System.out.println("  Jenis Izin : "+jenis);
                        System.out.println("  Durasi     : "+teratas.durasi+" hari");
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari= sc.nextLine();
                    stack.cariSurat(cari);
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Daftar semua surat");
                    stack.print();
                    System.out.println();
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilih>0 && pilih<=5);
    }
    
}
