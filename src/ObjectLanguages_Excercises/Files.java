package ObjectLanguages_Excercises;

public class Files {
    public static void Emerytura(){
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
    }

    public static void Kredyt(){
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
