package PO43.Safin.wdad.learn.xml;

import java.awt.print.Book;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.Reader;
import java.util.*;


public class XmlTask {
    private Document document;
    private String path = "C:/Users/Андрей/IdeaProjects/starting-monkey-to-human-path-master/starting-monkey-to-human-path/PO43/Safin/wdad/learn/xml/Test.xml";

    public XmlTask() throws IOException, ParserConfigurationException, SAXException {
        document = createDocument();
    }
    private Document createDocument() throws ParserConfigurationException, IOException, SAXException {//метод, который возвращает документ
        File file = new File(path);//обьявляем файл, в качестве входного параметра скармливаем ему путь к файлу
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);//парсим документ, то есть получаем из него xml документ, в котором уже можем работать по нодам
        return document;//возвращаем документ
    }

    private void updateDoc() throws IOException {
        DOMImplementationLS domImplementationLS =
                (DOMImplementationLS) document.getImplementation().getFeature("LS", "3.0");
        LSOutput lsOutput = domImplementationLS.createLSOutput();
        FileOutputStream outputStream = new FileOutputStream(path);
        lsOutput.setByteStream(outputStream);
        LSSerializer lsSerializer = domImplementationLS.createLSSerializer();
        lsSerializer.write(document, lsOutput);
        outputStream.close();
    }


    public List<Reader> nehligentReaders() throws ParserConfigurationException,SAXException,IOException
    {
        List<Reader> readers = new ArrayList<Reader>();
        Reader reader = null;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        DocumentBuilder builder = builder.parse(new File("C:/Users/Andrei/IdeaProjects/starting-monkey-to-human-path/PO43/Safin/wdad/learn/xml/Test.xml"));
        document.getDocumentElement().normalize();;
        NodeList nList = document.getElementsByTagName("reader");
        for (int temp = 0;temp<nList.getLength();temp++){
            Node node = nList.item(temp);
            {
                if (node.getNodeType() == Node.ATTRIBUTE_NODE)
                {
                    Element element = (Element) node;
                    String firstname = element.getElementsByTagName("firstname").item(0).getChildNodes().item(0).getNodeValue();
                    String secondname = element.getElementsByTagName("secondname").item(0).getChildNodes().item(0).getNodeName();
                    readers.add(new );
                }
                for (Reader reader1:readers)
                 //   (System.out.println(reader1.getFirstName););
            }
        }
    }

    }




