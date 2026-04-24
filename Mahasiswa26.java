public class Mahasiswa26 {
    String nim, nama, kelas;
    int nilai;

    Mahasiswa26() {

    }

    Mahasiswa26(String nim, String nama, String kelas) {
        this.nim= nim;
        this.nama= nama;
        this.kelas= kelas;
        nilai= -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai= nilai;
    }
}
