package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Console {

    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static Console console;

    public static Console instance() {
        if (Console.console == null) {
            Console.console = new Console();
        }
        return Console.console;
    }

    public String readString(String title) {
        String input = null;
        this.write(title);
        try {
            input = this.bufferedReader.readLine();
        } catch (Exception ex) {
        }
        return input;
    }

    public String readString() {
        return this.readString("");
    }

    public char readChar(String title) {
        char charValue = ' ';
        boolean ok = false;
        do {
            String input = this.readString(title);
            if (input.length() != 1) {
                this.writeError("character");
            } else {
                charValue = input.charAt(0);
                ok = true;
            }
            assert ok;
        } while (!ok);
        return charValue;
    }

    public void writeln() {
        System.out.println();
    }

    public void write(String string) {
        System.out.print(string);
    }

    public void write(int integer) {
        System.out.print(integer);
    }

    public void writeln(String string) {
        System.out.println(string);
    }

    public void write(char character) {
        System.out.print(character);
    }

    public void writeError(String format) {
        System.out.println("FORMAT ERROR! " + "Enter a " + format + " formatted value.");
    }
}
