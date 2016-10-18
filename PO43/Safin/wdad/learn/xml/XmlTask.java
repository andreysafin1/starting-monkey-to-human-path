package PO43.Safin.wdad.learn.xml;

import java.awt.print.Book;
import java.io.IOException;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DateDV;
import com.sun.org.apache.xerces.internal.impl.dv.xs.DayDV;
import com.sun.org.apache.xerces.internal.impl.xs.util.ObjectListImpl;
import org.w3c.dom.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.util.*;




public class XmlTask {
    File file = new File("C:/JAVA/starting-monkey-to-human-path-master/starting-monkey-to-human-path/PO43/Safin/wdad/learn/xml/Test.xml");
    Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

  public XmlTask() throws IOException, ParserConfigurationException, SAXException {
  }

  /* private Node findReader(String firstName,String secondName) {
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

   /* public void removeBook(Reader reader, Book book) throws TransformerException {
        NodeList Reader = document.getElementsByTagName("reader");
        NodeList Book = document.getElementsByTagName("book");
        //NamedNodeMap attributes;
        for (int i = 0; i < Reader.getLength(); i++) {
            if (Reader.item(i).getNodeValue().equals(reader))
            {
                Book.item(i).removeChild((Node) book);
            }
        }
        writeDoc();
    }*/

   public List<Reader> nehligentReaders() throws ParserConfigurationException,SAXException,IOException
   {
       List<Reader> readers = new ArrayList<Reader>();
       Reader reader = null;
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
       DocumentBuilder builder = factory.newDocumentBuilder();
       Document document  = builder.parse(new File("C:/JAVA/starting-monkey-to-human-path-master/starting-monkey-to-human-path/PO43/Safin/wdad/learn/xml/Test.xml"));
       document.getDocumentElement().normalize();
       NodeList nList = document.getElementsByTagName("reader");
       for (int temp = 0;temp < nList.getLength();temp++){
           Node node = nList.item(temp);
           {
               if (node.getNodeType() == Node.ATTRIBUTE_NODE)
               {
                   Element elem = (Element) node;
                   String firstname = elem.getElementsByTagName("firstname").item(0).getChildNodes().item(0).getNodeValue();
                   String secondname = elem.getElementsByTagName("secondname").item(0).getChildNodes().item(0).getNodeName();
                   readers.add(new PO43.Safin.wdad.learn.xml.Reader(firstname,secondname));
               }
               for (Reader red:readers
                       ) {
                   System.out.println(red.getFirstName());
               }
               for (Reader red:readers
                       ) {System.out.println(red.getSecondName());
               }
           }
       }
       return readers;
   }



    private void writeDoc() throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(new File("C:/JAVA/starting-monkey-to-human-path-master/starting-monkey-to-human-path/PO43/Safin/wdad/learn/xml/Test.xml"));
        transformer.transform(domSource, streamResult);
    }

}






