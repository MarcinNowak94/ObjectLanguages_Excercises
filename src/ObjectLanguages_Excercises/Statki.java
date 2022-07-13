package ObjectLanguages_Excercises;

public class Statki {
    /*
    2020_Z1_C1
    Zdefiniować klasę pisującą grę w statki o polach:
     imię gracza (łańcuch znaków)
     nazwisko gracza (łańcuch znaków)
     plansza (dwuwymiarowa tablica boolowska)
    Zdefiniować metody:
     konstruktor z parametrami: imię i nazwisko gracza, liczba
    wierszy i liczba kolumn (tworzy tablicę)
     umieszczającą jednomasztowiec (true) na polu o podanych
    współrzędnych
     umieszczającą dwumasztowiec na polach o podanych
    współrzędnych; jeśli współrzędne nie wskazują elementów w
    jednym wierszu lub w jednej kolumnie, to metoda zwraca
    false, inaczej true
     wykonującą strzał – parametrami są współrzędne strzału,
    wynikiem napis: ,,trafiony” lub ,,pudło”
     */

    private String imie;
    private String nazwisko;
    private Boolean[][] field;

    Statki(String firstname, String surname, int rows, int cols){
      this.imie=firstname;
      this.nazwisko=surname;
      this.field= new Boolean[rows][cols];
      //would be nice to initialize but non compulosry
    };

    public Boolean placeOnemast(int row, int col){
      if(!(this.field[row][col]==Boolean.TRUE)){
          this.field[row][col]=Boolean.TRUE;
          return Boolean.TRUE;
      };
      return Boolean.FALSE;
    };

    public Boolean placetwoMast(int startrow, int startcol, int endrow, int endcol){
        int rowdiff=Math.abs(startrow-endrow);
        int coldiff=Math.abs(startcol-endcol);
        //must be same row or same col, simplest naive solution (2, -3 will work too)
        if((rowdiff+coldiff)==1){
            this.field[startrow][startcol]=Boolean.TRUE;
            this.field[endrow][endcol]=Boolean.TRUE;
            return Boolean.TRUE;
        };
        return Boolean.FALSE;
    };

    public String shot(int row, int col){
      if(this.field[row][col]==Boolean.TRUE) {return "trafiony";};
      return "pudło";
    };
}
