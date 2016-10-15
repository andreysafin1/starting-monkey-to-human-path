package PO43.Safin.wdad.learn.xml;

import java.awt.print.Book;
import java.io.IOException;


import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;


import org.w3c.dom.*;
import org.xml.sax.SAXException;


import java.io.File;
import java.io.Reader;


public class XmlTask {
    private Document document;
    private String path = "C:/Users/Андрей/IdeaProjects/starting-monkey-to-human-path-master/starting-monkey-to-human-path/PO43/Safin/wdad/learn/xml/Test.xml";

    public XmlTask() throws IOException, ParserConfigurationException, SAXException {
        File file = new File(path);
        document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(path);
    }
    private Node findReader(String firstName,String secondName) {
        String tedReader = "reader";
        String attrFirstName = "firstname";
        String attrSecondName = "secondname";
        NodeList reader = document.getElementsByTagName(tedReader);
        Node node = null;
        NamedNodeMap attributes;
        for (int i = 0;i<reader.getLength();i++)
        {
            attributes = reader.item(i).getAttributes();
            if (attributes.getNamedItem(attrFirstName).getNodeValue().equals(firstName) && attributes.getNamedItem(attrSecondName).getNodeValue().equals(secondName));
            node = reader.item(i);
            return node;
        }
        return null;
    }


public void removeBook(Reader reader,Book book) throws TransformerException
{
    try {
        NodeList tagReader = document.getElementsByTagName("reader");
        NodeList tagBook = document.getElementsByTagName("book");
    }
 catch (NullPointerException e)
 {
     System.out.println("Такой записи нет");
 }


}
}





