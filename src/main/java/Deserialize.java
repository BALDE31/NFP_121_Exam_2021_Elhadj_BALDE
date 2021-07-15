import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.filter.ElementFilter;
import org.jdom2.input.SAXBuilder;
import org.jdom2.util.IteratorIterable;

import java.io.File;
import java.io.IOException;

public class Deserialize {
     static String FILE_PATH_NAME = "cli.xml";
    public  static void main(String[] args) throws IOException, JDOMException{
       readXmlFile(FILE_PATH_NAME);
    }
    public static void readXmlFile(String pathName) throws JDOMException, IOException {
        Document document = new SAXBuilder().build(new File(pathName));

        System.out.println(document.getRootElement().getName() + ": ");

        IteratorIterable<Element> arguments = document.getDescendants(new ElementFilter("argument"));

        for (Element element : arguments) {
            Attribute accesAttribute = element.getAttribute("acces");
            System.out.print(accesAttribute.getName() + "=" + accesAttribute.getValue() + " ");

            Attribute nbAttribute = element.getAttribute("nb");
            if (nbAttribute != null) System.out.print(nbAttribute.getName() + "=" + nbAttribute.getValue() + " ");

            System.out.println(element.getText());
        }
    }
}
