public class Ksiazka{
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna){
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }
    public void InfoOKsiazce(){
        System.out.println("Tytul: " + tytul + ", Autor: " + autor );
    }

    public void wypozycz() {
        if (dostepna) {
            dostepna = true;
            System.out.println("dostępna.");
        } else {
            System.out.println("Przepraszamy, ta książka jest już wypożyczona.");
        }
    }

}