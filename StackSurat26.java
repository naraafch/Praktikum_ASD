public class StackSurat26 {
    Surat26[] stack;
    int size, top;

    StackSurat26(int size) {
        this.size= size;
        stack= new Surat26[size];
        top= -1;
    }

    public boolean isFull() {
        if(top==size-1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isEmpty() {
        if(top==-1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat26 srt) {
        if(!isFull()) {
            top++;
            stack[top]= srt; 
        } else {
            System.out.println("Stack penuh! Tidak bisa menambah surat lagi");
        }
    }

    public Surat26 pop() {
        if(!isEmpty()) {
            Surat26 s= stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses");
            return null;
        }
    }

    public Surat26 peek() {
        if(!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat");
            return null;
        }
    }

    public void print() {
    System.out.printf("%-10s %-20s %-8s %-15s %-8s %n", "ID Surat", "Nama Mahasiswa", "Kelas", "Jenis Izin", "Durasi (Hari)");
    for(int i=0; i<=top; i++) {
        System.out.printf("%-10s %-20s %-8s %-15s %-8d %n", stack[i].idSurat, stack[i].namaMahasiswa, stack[i].kelas, stack[i].jenisIzin, stack[i].durasi);
    }
    System.out.println("");
    } 

    public void cariSurat(String nama) {
        boolean ditemukan= false;
        for(int i=0; i<=top; i++) {
            if(stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                if(!ditemukan) {
                    System.out.printf("%-10s %-20s %-8s %-15s %-8s %n", "ID Surat", "Nama Mahasiswa", "Kelas", "Jenis Izin", "Durasi (Hari)");
                }
            String jenis= (stack[i].jenisIzin=='S' || stack[i].jenisIzin=='s') ? "Sakit":"Izin";
            System.out.printf("%-10s %-20s %-8s %-15s %-8d %n", stack[i].idSurat, stack[i].namaMahasiswa, stack[i].kelas, jenis, stack[i].durasi);
            ditemukan= true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat izin atas nama "+nama+" tidak ditemukan.");
        }
        System.out.println();
    }
}
