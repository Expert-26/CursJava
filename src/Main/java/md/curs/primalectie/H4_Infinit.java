package md.curs.primalectie;

import javax.swing.*;
import java.util.ArrayList;

public class H4_Infinit {

    public static void main(String[] args) {
        ArrayList<String> listaCuvinte = new ArrayList<String>();
        String cuvant = "";

        while (!cuvant.equals("exit")) {
            cuvant = JOptionPane.showInputDialog(null,"Introduceti oricare cuvant");
            if (!cuvant.equals("exit")) {
                listaCuvinte.add(cuvant);
            }
        }
       //char litera = JOptionPane.(null,"Introduceti litera");
        String[] possibleValues = { "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p",
        "q","r","s","t","u","v","x","y","z" };

        Object selectedValue = JOptionPane.showInputDialog(null,
                "Choose one", "Input",
                JOptionPane.INFORMATION_MESSAGE, null,
                possibleValues, possibleValues[0]);

        ArrayList<String> lista2 = new ArrayList<String>();
        for (String word : listaCuvinte) {
            if (word.startsWith((String) selectedValue)) {
                lista2.add(word);
            }
        }
        if (lista2.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Nici un cuvant nu incepe cu litera " + (String) selectedValue);
        }
        else {
            String allWords = "";
            for (String word : lista2) {
                allWords = (allWords + "\n" + word);
            };
            JOptionPane.showMessageDialog(null,"Cuvintele ce au prima litera \"" + (String) selectedValue + "\" sunt \n" + allWords);

        }

    }


}
