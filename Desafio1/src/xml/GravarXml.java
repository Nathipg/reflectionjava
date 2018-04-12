package xml;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 *
 * @author nathipg e laionel lellis
 */
public class GravarXml {
    public void gravar( String nomeClasse, String conteudo ) throws IOException {
        String fileName = nomeClasse + ".xml";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(conteudo);
        writer.close();
    }
}
