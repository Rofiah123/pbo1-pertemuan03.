package percabangan;

public class Switch {
    public static void main(String[] args){
        char nilai='D';
        switch (nilai){
            case 'A';
                System.out.println("Mhs   : \"Terima kasih pak\"");
                System.out.println("Dosen : \"Selamat ya !!\"");
                break;
            case 'B';
                System.out.println("Mhs   : \"Kenapa ulun kada dapat A, pak\"");
                System.out.println("Dosen : \"Tapi bisa lah menjawab ujian?\"");
                System.out.println("Hehehehe..\"");
                break;
            default:
                System.out.println("Mhs     : \"Ulun tutun pul pak ai, tugas pul jua\"");
                System.out.println("Dosen   : \"Bujur jua kah?\"");
                System.out.println("Dosen   : \"*memeriksa berkas\"");
                System.out.println("Dosen   : \*menceleng\"");
                System.out.println("Mhs     : \"Kaburrrrrr..\"");
                break;
        }
    }

}
