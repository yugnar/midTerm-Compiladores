import java.util.*;
import java.io.*;

public abstract class TablaTransicion {
    public abstract Set<Integer> get(int state, char c);
    public abstract int getStates(); //gets the number of states in the final table.
    public abstract Set<Character> getAlphabet(); // return the characters used and/or found in regex.

    public String toString() {
        //System.out.println("Starting to print table...\n States: " + getStates() + "\n Alphabet: " + getAlphabet());
        Set<Character> alphabet = getAlphabet();
        alphabet.add('ñ');
        int states = getStates();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        ps.printf("%19c",' ');
        for(Character c: alphabet) {
            ps.printf("%20c", c);
        }
        ps.println();
        for(int i = 0; i < states; i++) {
            ps.printf("%-20d", i);
            for(Character c: alphabet) {
                ps.printf("%20s", get(i, c).toString());
            }
            ps.println();
        }
        String str = null;
        try {
            str =  baos.toString("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return str;
    }
}
