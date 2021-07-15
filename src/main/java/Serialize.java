import exercice_4.Cli;
import exercice_4.Option;
import org.jdom2.DocType;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class Serialize {

    public static void main(String[] args) throws IOException {
        serialize();
    }

    public static void serialize() throws IOException {
        Cli cli = new Cli();
        Option option_1 = new Option('A', "Valeur de alpha", true);
        Option option_2 = new Option('I', "Valeur de indice", true);
        Option option_3 = new Option('P', "Mode matrice pleine", false);
        Option option_4 = new Option('C', "Mode matrice creuse", false);

        cli.addOption(option_1);
        cli.addOption(option_2);
        cli.addOption(option_3);
        cli.addOption(option_4);

        Element rootElement = new Element("cli");

        for (Option option : cli.getMyOptions()) {
            Element argument = new Element("argument").setAttribute("acces", String.valueOf(option.getAccessor()));
            if (option.isValue()) argument.setAttribute("nb", "1");
            argument.setText(option.getDesc());
            rootElement.addContent(argument);
        }

        Document document = new Document(rootElement, new DocType("cli", "cli.dtd"));

        // Afficher le document
        XMLOutputter outputter = new XMLOutputter(Format.getPrettyFormat());
        outputter.output(document, new FileOutputStream("cli.xml"));
    }
}
