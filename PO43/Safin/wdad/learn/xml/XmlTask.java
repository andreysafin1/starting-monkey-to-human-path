package PO43.Safin.wdad.learn.xml;

import java.awt.print.Book;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import com.sun.org.apache.bcel.internal.classfile.*;
import com.sun.org.apache.bcel.internal.classfile.Node;
import com.sun.org.apache.xerces.internal.impl.dv.xs.DayDV;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;

import java.io.File;
import java.io.Reader;
import java.util.List;


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





