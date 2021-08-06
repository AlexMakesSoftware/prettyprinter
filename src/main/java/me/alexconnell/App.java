package me.alexconnell;
import me.alexconnell.utils.prettyprinter.Colouriser;

/**
 * Coloriser demo.
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(
                new Colouriser(
                ).green(" _______ _______ _______ _______\n"
                ).cyan("    |    |______ |______    |\n"
                ).blue("    |    |______ ______|    |   "));

        System.out.println(
            new Colouriser().green("Hello ").red("WORLD!").blue(" How are you?")
        );

        System.out.println(
            new Colouriser().greenBackground("finished")
        );
    }
}
