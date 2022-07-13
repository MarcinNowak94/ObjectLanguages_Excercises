package ObjectLanguages_Excercises;

import javax.swing.JOptionPane;     //Windows and dialog boxes
import static java.lang.System.out;

/*
Exercises based on assignments available here
https://tinyurl.com/arekjava

Assignment Naming conventions (in comments)
[year]_[set]_[assignment] , eg.: 2020_Z1_A1
Year        2020
Set         Z1
Assignment  A1
*/
public class Main {
    public static int Menu(String[] options, String title, String message){
        return JOptionPane.showOptionDialog(
                null,
                message,
                title,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
        );
    }

    public static int Files() {
        String[] options = {
                "Emerytura",        //2020_Z1_A1
                "Kredyt",           //2020_Z1_D1
                "Emerytura_2",      //2020_Z2_A1
                "Kredyt_2",         //2020_Z2_B2
                "Budynki",          //2020_Z2_D1
                "Leki",             //2020_Z2_C2
                "Return",
                "Exit"
        };
        int choice = Menu(options,
                "File exercises",
                "Chose file exercise");

        switch (options[choice]) {
            case "Emerytura": {
                try {
                    out.println("prawie");
                    Files.Emerytura("src/emerytura.txt");
                    out.println("zyje");
                }
                catch(Exception e) {
                    out.println("chuja");
                };
            }; break;
            case "Kredyt": {Files.Kredyt();}; break;
            case "Emerytura_2": { Files.Emerytura_2();}; break;
            case "Kredyt_2": {Files.Kredyt_2();}; break;
            case "Budynki": {Files.Budynki();}; break;
            case "Return": { return 0;}
            case "Exit": { System.exit(0); /*exit program*/ }; break;
            default: {
                JOptionPane.showMessageDialog(
                        null,
                        "Wrong choice somehow, pick once more",
                        "Wrong choice",
                        JOptionPane.WARNING_MESSAGE
                );
            };break;
        };
        return 0;
    }

    public static int Classes(){
        String[] options={
                "Osoby",            //2020_Z1_A1
                "Statki",           //2020_Z1_C1
                "Egzamin",          //2020_Z2_A2
                "Indeksy",          //2020_Z2_B1
                "Testy",            //2020_Z2_D2
                "Skoki",            //2020_Z2_C1
                "FunkcjaKwadratowa",//2018_Z1_Z2
                "Return",
                "Exit"
        };
        int choice = Menu(options,
                "Classes",
                "Chose class excercise");

        switch (options[choice]){
            case "Osoby": {
                int[] years={1999,2000,2001};
                Osoby test=new Osoby("Jan","Kowalski", years);
                JOptionPane.showMessageDialog(null,
                (String)(test.getimie()+" "+test.getnazwisko()+" "+test.getrok()[1]));
            }; break;
            case "Statki": {
                Statki game = new Statki("John", "Doe", 5,5);
                Boolean one = game.placeOnemast(1,1);
                Boolean two = game.placetwoMast(2,2,2,3);
                String shot= game.shot(2,2);

                JOptionPane.showMessageDialog(null,
                "One mast:\t"+one.toString()
                        +"\nTwo mast:\t"+two.toString()
                +"\nShot at [2][2]:\t"+shot
                        );

            }; break;
            case "Egzamin": {new Egzamin();}; break;
            case "Indeksy": {
                Indeksy index= new Indeksy(20,2);
            }; break;
            case "Testy": {new Testy();}; break;
            case "Skoki": {new Skoki();}; break;
            case "FunkcjaKwadratowa": {new FunkcjaKwadratowa();}; break;
            case "Return": {return 0;}
            case "Exit": { System.exit(0);}; break;
            default: {
                JOptionPane.showMessageDialog(
                    null,
                    "Wrong choice somehow, pick once more",
                    "Wrong choice",
                    JOptionPane.WARNING_MESSAGE
            );
            };break;
        }
        return 0;
    };

    public static int CLIPrograms(){
        String[] options={
                "Palindromy",            //2018_Z1_Z1
                "Return",
                "Exit"
        };
        int choice = Menu(options,
                "CLI Programs",
                "Chose class excercise");

        switch (options[choice]){
            case "Palindromy": {Programs.Palindromy();}; break;
            case "Return": {return 0;}
            case "Exit": { System.exit(0);}; break;
            default: {
                JOptionPane.showMessageDialog(
                        null,
                        "Wrong choice somehow, pick once more",
                        "Wrong choice",
                        JOptionPane.WARNING_MESSAGE
                );
            };break;
        }
        return 0;
    };

    public static void main(String[] args) {
	    String[] options = {
                "Files",
                "Classes",
                "CLI Programs",
                "Exit"};
        int choice;
        do{
         choice = Menu(options,
                "Exercises",
                "Pick your exercise");
        switch (options[choice]) {
            case "Files": { Files();}; break;
            case "Classes": {Classes();}; break;
            case "CLI Programs": {CLIPrograms();}; break;
            case "Exit": {System.exit(0); /*exit program*/}; break;
            default: {
                JOptionPane.showMessageDialog(
                        null,
                        "Wrong choice somehow, pick once more",
                        "Wrong choice",
                        JOptionPane.WARNING_MESSAGE
                );
            }; break;
        };
    } while(Boolean.TRUE);
    }
}