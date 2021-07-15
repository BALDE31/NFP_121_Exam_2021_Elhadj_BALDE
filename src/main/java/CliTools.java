import exercice_4.Cli;
import exercice_4.Option;

import java.lang.reflect.Field;

public class CliTools {
    static public Cli generateCli(String nomDeClasse) throws ClassNotFoundException {
        Cli cli = new Cli();
        Class<?> theClass = Class.forName(nomDeClasse);

        for (Field field : theClass.getDeclaredFields()) {
            Option option = new Option(
                    field.getName().charAt(0),
                    "content  " + field.getName(),
                    !field.getType().isEnum()
            );

            cli.addOption(option);
        }
        return cli;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        CliTools.generateCli("Configuration");
    }
}
