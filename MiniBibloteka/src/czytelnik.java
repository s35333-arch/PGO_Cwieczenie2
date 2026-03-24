public class czytelnik {
    private String imie;
    private String nazwisko;
    private int numerKarty;
    private int liczbaWypozyczen;

    public czytelnik(String imie, String nazwisko, int numerKarty) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = 0;
    }

    public void wypiszDane() {
        System.out.println("Czytelnik: " + imie + " " + nazwisko +
                " | Nr karty: " + numerKarty +
                " | Wypożyczone książki: " + liczbaWypozyczen);
    }

    public void zwiekszLiczbeWypozyczen() {
        liczbaWypozyczen++;
    }

    public void zmniejszLiczbeWypozyczen() {
        if (liczbaWypozyczen > 0) {
            liczbaWypozyczen--;
        } else {
            System.out.println("Błąd: Czytelnik " + imie + " nie ma nic do zwrotu!");
        }
    }
}