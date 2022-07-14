package ObjectLanguages_Excercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.ArrayList;

public class Files {
    //Solution by Mordej
    public static void Emerytura(String plik) throws Exception{
        /*
         2020_Z1_A1
         Dany jest plik danych o strukturze:
          imię (łańcuch znaków)
          nazwisko (łańcuch znaków)
          płeć (znak)
          PESEL (ur. po roku 2000, 11cyfr – liczba całkowita)
          lata do emerytury (liczba całkowita)
         Napisać funkcję poprawiającą w tym pliku liczbę lat do emerytury
         (było liczone dla 67 lat dla wszystkich, ma być 60/65 dla
         kobiet/mężczyzn). Parametrem funkcji jest nazwa pliku. Funkcja
         powinna zwrócić łańcuch znaków zawierający imię i nazwisko
         osoby mającej najwięcej lat do emerytury (dowolnej osoby, gdy jest
         ich więcej).
         */
            var inputFile = new BufferedReader(new FileReader(plik));
            String line;
            List<String> tablica=new ArrayList<String>();

            while(( line = inputFile.readLine()) != null)
            {
                tablica.add(line);
            }

            int age = 0;
            String buffor_age = "";

            for(int i=0; i<tablica.size(); i++)
            {
                if((tablica.get(i)).equals("K"))
                {
                    int d = Integer.parseInt(tablica.get(i+2));
                    age = 67 - d;
                    age = 60 - age;
                    buffor_age += age;
                    tablica.set(i+2, buffor_age);
                }
                else if((tablica.get(i)).equals("M"))
                {
                    int d = Integer.parseInt(tablica.get(i+2));
                    age = 67 - d;
                    age = 65 - age;
                    buffor_age += age;
                    tablica.set(i+2, buffor_age);
                }
                buffor_age = "";
            }

            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("src/test.txt"));
                for (String item : tablica) {
                    out.write((item) + "\n");
                }
                out.flush();
                out.close();
            }
            catch(Exception blad)
            {
                System.out.println("Blad zapisu");
            }
    };

    public static String Kredyt(String file){
        /*
        2020_Z1_D1
        Dany jest plik danych o strukturze:
         imię (łańcuch znaków)
         nazwisko (łańcuch znaków)
         kredyt (liczba rzeczywista)
         pensja (liczba rzeczywista)
         wiek (liczba całkowita)
        Napisać funkcję wpisującą w tym pliku proponowaną kwotę
        kredytu. Kwota jest wyliczana według wzoru:
        𝑘𝑟𝑒𝑑𝑦𝑡 = (𝑝𝑒𝑛𝑠𝑗𝑎/7)(65 − 𝑤𝑖𝑒𝑘)
        Parametrem funkcji jest nazwa pliku. Funkcja powinna zwrócić
        łańcuch znaków, zawierający imię i nazwisko osoby z największym
        proponowanym kredytem (dowolnejosoby, gdy jest ich więcej).
         */
        String highest_credit ="Instructions unclear for now I will skip this assignment";

        return highest_credit;
    }

    public static void Emerytura_2(){
        /*
        2020_Z2_A1
        Dany jest plik tekstowy, w którym umieszczono w kolejnych wierszach dane:
         imię (łańcuch znaków)
         nazwisko (łańcuch znaków)
         płeć (znak)
         PESEL (10/11cyfr (liczba całkowita)
         lata do emerytury (liczba całkowita)
        Napisać funkcję, przepisującą do pliku danych (binarnego) PESEL i liczbę lat do emerytury (poprawioną, ze względu
        na to, że było liczone dla 67 lat dla wszystkich, ma być 60/65 dla kobiet/mężczyzn). Parametrem funkcji jest nazwa
        pliku (bez rozszerzenia). Nazwa pliku wejściowego powstaje przez dodanie rozszerzenia „.TXT”, wynikowego przez
        dodanie rozszerzenia „.DATA”. Funkcja powinna zwrócić łańcuch znaków zawierający imię i nazwisko osoby mającej
        najmniej lat do emerytury (dowolnej osoby, gdy jest ich więcej).
         */
    }

    public static void Kredyt_2(){
        /*
        //2020_Z2_B2
        Dany jest plik tekstowy, w którym umieszczono w kolejnych wierszach dane::
         imię (łańcuch znaków)
         nazwisko (łańcuch znaków)
         pensja (liczba rzeczywista)
         wiek (liczba całkowita)
        Napisać funkcję przepisującą do pliku danych (binarnego) nazwisko i proponowaną kwotę kredytu. Kwota jest
        wyliczana według wzoru:
        𝑘𝑟𝑒𝑑𝑦𝑡 = ((𝑝𝑒𝑛𝑠𝑗𝑎 ∙ 1,5)/6)∙(60 − 𝑤𝑖𝑒𝑘)
        Parametrem funkcji jest nazwa pliku (bez rozszerzenia). Nazwa pliku wejściowego powstaje przez dodanie
        rozszerzenia „.TXT”, wynikowego przez dodanie rozszerzenia „.DATA”. Funkcja powinna zwrócić łańcuch znaków,
        zawierający imię i nazwisko osoby z największym proponowanym kredytem (dowolnej osoby, gdy jest ich więcej).
         */
    }

    public static void Budynki(){
        /*
        2020_Z2_D1
        Dany jest plik tekstowy, w którym zapisano (w kolejnych wierszach) informacje o budynkach:
        • nazwa domu (łańcuch znaków)
        • adres domu (łańcuch znaków)
        • liczba kondygnacji (liczba całkowita)
        • cena (liczba rzeczywista)
        Napisać funkcję która jako pierwszy parametr otrzymuje nazwę tego pliku (bez rozszerzenia, należy dopisać
        rozszerzenie „.TXT”). Funkcja zwraca cenę domu o nazwie podanej drugim parametrem. Dodatkowo, funkcja
        przepisuje do pliku danych (binarnego) (o nazwie jak dla pierwszego, ale z rozszerzeniem „.WYN”) informacje o
        wszystkich domach (nazwy, ceny i liczby kondygnacji), których cena jest większa niż 500 i liczba kondygnacji wynosi
        co najwyżej 2
         */
    }

    public static void Leki(){
        /*
        2020_Z2_C2
        Dany jest plik tekstowy, w którym zapisano (w kolejnych wierszach) informacje o lekach:
        • nazwa leku (łańcuch znaków)
        • firma (łańcuch znaków)
        • cena leku (liczba całkowita)
        • refundacja (char, „T” / „N”)
        Napisać funkcję która jako pierwszy parametr otrzymuje nazwę tego pliku (bez rozszerzenia, należy dopisać
        rozszerzenie „.TXT”). Funkcja zwraca cenę leku o nazwie podanej drugim parametrem. Dodatkowo, funkcja
        przepisuje do pliku danych (binarnego) (o nazwie jak dla pierwszego, ale z rozszerzeniem „.WYN”) informacje o
        wszystkich lekach (nazwy i ceny), których cena jest większa niż 50 i nie są refundowane.
         */
    }

}
