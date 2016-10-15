package PO43.Safin.wdad.learn.xml;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.awt.print.Book;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.io.Reader;

public class TestXml{
    public static void main(String[] args)  {
        try {
            XmlTask List = new XmlTask();
            // NodeList Reader = null;
            // Node Book = null;
            List.removeBook(null, null);
        }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
}
