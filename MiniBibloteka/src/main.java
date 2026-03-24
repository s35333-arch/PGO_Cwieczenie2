public class main {
    public static void main(String[] args){
        Ksiazka harrypoter = new Ksiazka("tytul1","Autor1", 300, true);
        harrypoter.InfoOKsiazce();
        harrypoter.wypozycz();
        harrypoter.zwroc();

        Ksiazka k1 = new Ksiazka("tytul2", "Autor2", 243, true);
        Ksiazka k2 = new Ksiazka("tytul3","Autor3", 150, false);
        Ksiazka k3 = new Ksiazka("tytul4","Autor4",400, true);

        k1.InfoOKsiazce();
        k1.wypozycz();
        k1.zwroc();
        k2.InfoOKsiazce();
        k2.wypozycz();
        k2.zwroc();
        k3.InfoOKsiazce();
        k3.wypozycz();
        k3.zwroc();

        czytelnik czytelnik1 = new czytelnik("Jan", "Kowalski", 1001);
        czytelnik czytelnik2 = new czytelnik("Anna", "Nowak", 1002);

        System.out.println("--- Stan początkowy ---");
        czytelnik1.wypiszDane();
        czytelnik2.wypiszDane();

        System.out.println("\n--- Po kilku wypożyczeniach ---");
        czytelnik1.zwiekszLiczbeWypozyczen();
        czytelnik1.zwiekszLiczbeWypozyczen();
        czytelnik2.zwiekszLiczbeWypozyczen();
        czytelnik1.wypiszDane();
        czytelnik2.wypiszDane();

        System.out.println("\n--- Po zwrotach ---");
        czytelnik1.zmniejszLiczbeWypozyczen();

        czytelnik1.wypiszDane();

        System.out.println("--- TEST BIBLIOTEKI ---");
        Biblioteka biblioteka = new Biblioteka(5);
        biblioteka.dodajKsiazke(new Ksiazka("tytul5", "autor5", 350, true));
        biblioteka.wypiszDostepneKsiazki();

        System.out.println("\n--- TEST CZYTELNIKA ---");
        czytelnik czytelnik = new czytelnik("Jan", "Nowak", 123);
        czytelnik.zwiekszLiczbeWypozyczen();
        czytelnik.wypiszDane();
    }


}