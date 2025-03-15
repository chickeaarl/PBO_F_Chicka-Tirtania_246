class RekeningBank{
    String nomorRekening;
    String namaPemilik;
    Double saldo;

    RekeningBank(String nomorRekening, String namaPemilik, Double saldo){
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }
    void tampilkanInfo(){
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo + "\n");

    }
    void setorUang(double jumlah){
        if (jumlah > 0){
            saldo += jumlah;
            System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: " + saldo);
        }else{
            System.out.println("Setor uang gagal! Jumlah setor harus lebih dari 0.");
        }
    }
    void tarikUang(double jumlah){
        if (jumlah > 0 && jumlah <= saldo){
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo + "\n");
        }else{
            System.out.println("\n" + namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        }
    }
}

public class Codelab_2{
    public static void main(String[]args){
        RekeningBank rekening1 = new RekeningBank("202410370110246", "Chicka", 500000.0);
        RekeningBank rekening2 = new RekeningBank("202410370110235", "Surya", 1000000.0);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        rekening1.setorUang(200000.0);
        rekening2.setorUang(500000.0);

        rekening1.tarikUang(800000.0);
        rekening2.tarikUang(300000.0);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}