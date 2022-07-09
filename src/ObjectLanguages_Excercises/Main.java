package ObjectLanguages_Excercises;

import javax.swing.JOptionPane;     //Windows and dialog boxes


/*
Exercises based on assignments available here
https://tinyurl.com/arekjava
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
                "Emerytura",
                "Return",
                "Exit"
        };
        int choice = Menu(options,
                "File exercises",
                "Chose file exercise");

        switch (options[choice]) {
            case "Z1_A12020": { Files.Emerytura();}; break;
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
                "Osoby",
                "Return",
                "Exit"
        };
        int choice = Menu(options,
                "Classes",
                "Chose class excercise");

        switch (options[choice]){
            case "Osoby": {new Osoby();} break;
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
                "Exit"};
        int choice;
        do{
         choice = Menu(options,
                "Exercises",
                "Pick your exercise");
        switch (options[choice]) {
            case "Files": { Files();}; break;
            case "Classes": {Classes();}; break;
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