package ObjectLanguages_Excercises;

import javax.swing.*;

public class Egzamin {
    /*
    2020_Z2_A2
    Napisać klasę Egzamin reprezentującą informacje o ocenach z egzaminu z programowania. Klasa powinna zawierać
    pole prywatne float[][] oceny – tablicę z listą ocen studentów (pierwszy wymiar – numer studenta, drugi wymiar –
    numer zadania). Konstruktor z dwoma parametrami (liczba studentów, liczba zadań) powinien tworzyć i zainicjować
    odpowiednie elementy tablicy na wartość 0. Zdefiniować metody publiczne:
    • float obliczŚredną(int student) – oblicza i zwraca średnią arytmetyczną dla podanego studenta (gdy
    większość zadań ma ocenę większą niż 2, w przeciwnym razie średnia wynosi 2),
    • boolean zaliczonyEgzamin(int student) – zwraca true, jeśli średnia ocen jest większa lub równa 3,0, w
    przeciwnym wypadku false,
    • void wpiszOcenę(int student, int zadanie, float ocena) – dodaje nową ocenę,
    • void piszDane() – wyświetla na ekran oceny studentów (w jednym wierszu: numer studenta, lista ocen,
    średnia ocen) rozdzielone średnikami.
     */

    private float[][] oceny;
    private int students;       //not in specification but necessary
    private int assignments;    //not in specification but necessary

    public Egzamin(int students, int assignments){
        this.students=students;
        this.assignments=assignments;
        this.oceny= new float[students][assignments];
        for (int student=0;student<students;student++){
            for (int assignment=0;assignment<assignments;assignment++){
                this.oceny[student][assignment]=(float)0;
            };
        };
    };

    public float obliczSrednia(int student){
        float sum=(float)0;
        for (int assignment=0;assignment<this.assignments;assignment++){
            sum+=this.oceny[student][assignment];
        };
        return sum/this.assignments;    //lowest value of 2.0 guaranteed
    };
    public Boolean zaliczonyEgzamin(int student){
        if(this.obliczSrednia(student)>=(float)3){return Boolean.TRUE;};
        return Boolean.FALSE;
    };
    public void wpiszOcene(int student, int zadanie, float ocena){
        this.oceny[student][zadanie]=ocena;
    }
    public void piszDane(){
        String buffer="";
        for (int student=0;student<students;student++){
            buffer+=Integer.toString(student)+", ";
            for (int assignment=0;assignment<assignments;assignment++){
                buffer+=Float.toString(this.oceny[student][assignment])+", ";
            };
            buffer+=Float.toString(this.obliczSrednia(student))+"; ";
        };
        JOptionPane.showMessageDialog(null,
                buffer,
                "Exam",
                JOptionPane.INFORMATION_MESSAGE);
    };
}
