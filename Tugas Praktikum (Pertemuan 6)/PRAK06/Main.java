public class Main{
    public static void main(String[] args) {
        Jagoan jakaSembung = new Jagoan("Jaka Sembung");
        Jagoan pitung = new Jagoan("Si Pitung");

        Jubah jubahPutih = new Jubah("Jubah Putih", 7, 50);
        Jubah jubahHitam = new Jubah("Jubah Hitam", 8, 52);

        Senjata golok = new Senjata("Golok", 25);
        Senjata toya = new Senjata("Toya", 24);

        jakaSembung.setJubah(jubahPutih);
        jakaSembung.setSenjata(golok);

        pitung.setJubah(jubahHitam);
        pitung.setSenjata(toya);

        jakaSembung.serang(pitung);
        jakaSembung.serang(pitung);

        pitung.serang(jakaSembung);

        jakaSembung.serang(pitung);

        pitung.serang(jakaSembung);

        jakaSembung.display();
        pitung.display();
    }
}