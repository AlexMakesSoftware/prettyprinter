package me.alexconnell.utils.prettyprinter;

public class Colouriser implements ConsoleColours {
    private String str;

    public Colouriser() {
        this.str = "";
    }

    public Colouriser(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str.toString();
    }
    
    public Colouriser red(String s) {
        return new Colouriser(this.toString() + ANSI_RED + s + ANSI_RESET);
    }

    public Colouriser yellow(String s) {
        return new Colouriser(this.toString() + ANSI_YELLOW + s + ANSI_RESET);
    }

    public Colouriser green(String s) {
        return new Colouriser(this.toString() + ANSI_GREEN + s + ANSI_RESET);
    }

    public Colouriser blue(String s) {
        return new Colouriser(this.toString() + ANSI_BLUE + s + ANSI_RESET);
    }

    public Colouriser cyan(String s) {
        return new Colouriser(this.toString() + ANSI_CYAN + s + ANSI_RESET);
    }

    public Colouriser purple(String s) {
        return new Colouriser(this.toString() + ANSI_PURPLE + s + ANSI_RESET);
    }
    
    public Colouriser black(String s) {
        return new Colouriser(this.toString() + ANSI_BLACK + s + ANSI_RESET);
    }

    public Colouriser redBackground(String s) {
        return new Colouriser(this.toString() + ANSI_RED_BACKGROUND + ANSI_BLACK + s + ANSI_RESET);
    }

    public Colouriser yellowBackground(String s) {
        return new Colouriser(this.toString() + ANSI_YELLOW_BACKGROUND + ANSI_BLACK + s + ANSI_RESET);
    }

    public Colouriser greenBackground(String s) {
        return new Colouriser(this.toString() + ANSI_GREEN_BACKGROUND + ANSI_BLACK + s + ANSI_RESET);
    }

    public Colouriser blueBackground(String s) {
        return new Colouriser(this.toString() + ANSI_BLUE_BACKGROUND + ANSI_BLACK + s + ANSI_RESET);
    }

    public Colouriser cyanBackground(String s) {
        return new Colouriser(this.toString() + ANSI_CYAN_BACKGROUND + ANSI_BLACK + s + ANSI_RESET);
    }

    public Colouriser purpleBackground(String s) {
        return new Colouriser(this.toString() + ANSI_PURPLE_BACKGROUND + ANSI_BLACK + s + ANSI_RESET);
    }
    
    public Colouriser whiteBackground(String s) {
        return new Colouriser(this.toString() + ANSI_WHITE_BACKGROUND + ANSI_BLACK + s + ANSI_RESET);
    }    
}
