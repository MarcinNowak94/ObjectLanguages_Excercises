package ObjectLanguages_Excercises;

public class Osoby {
    /*
    2020_Z1_B1
    Zdefiniować klasę opisującą osoby. Przewidzieć pola:
         imię (łańcuch znaków)
         nazwisko (łańcuch znaków)
         rok urodzenia dla dzieci – tablica liczb całkowitych
     */
    private String imie;
    private String nazwisko;
    private int[] rok;          //rok urodzenia dla dzieci

    public Osoby(String imie, String nazwisko, int[] rok_ur_dziec){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.rok = new int[rok_ur_dziec.length];
        for (int rok=0;rok<rok_ur_dziec.length;rok++){
            this.rok[rok]=rok_ur_dziec[rok];
        };
    };

    public String getimie(){return this.imie;};
    public String getnazwisko(){return this.nazwisko;};
    public int[] getrok() {return this.rok;};
    public int getSpecificrok(int which){return this.rok[which];};

    public void setimie(String name) {this.imie=name;};
    public void setnazwisko(String surname) {this.nazwisko=surname;};
    public void setrok(int[] lata){
        for (int rok=0;rok<lata.length;rok++){
            this.rok[rok]=lata[rok];
        };
    };
    public void setSpecificrok(int which, int value) {this.rok[which]=value;};
}
