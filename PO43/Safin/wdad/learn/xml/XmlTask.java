package PO43.Safin.wdad.learn.xml;

import java.awt.print.Book;
import java.io.IOException;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.io.Reader;


public class XmlTask {
    Document doc;
    String path = "C:/JAVA/starting-monkey-to-human-path-master/starting-monkey-to-human-path/PO43/Safin/wdad/learn/xml/Test.xml";

  public XmlTask() throws IOException, ParserConfigurationException, SAXException {
      File file = new File(path);
      doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(path);
  }



/*    private Node findReader(String firstName,String secondName) {
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
    }*/


    public void removeBook(Reader reader, Book book) throws TransformerException {

        String tagReader = "reader";
        String tagBook = "book";
        NodeList Reader = doc.getElementsByTagName(tagReader);
        NodeList Book = doc.getElementsByTagName(tagBook);
        NamedNodeMap attributes;
        Node node = null;
        for (int i = 0; i < Reader.getLength(); i++) {
            attributes = Reader.item(i).getAttributes();
            if (attributes.getNamedItem(tagBook).getNodeValue().equals(Book)
                    && attributes.getNamedItem(tagReader).getNodeValue().equals(Reader)) ;
            attributes.removeNamedItem(tagBook);
            writeDoc();
        }
    }

    private void writeDoc() throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(doc);
        StreamResult streamResult = new StreamResult(new File(path));
        transformer.transform(domSource, streamResult);
    }
}






