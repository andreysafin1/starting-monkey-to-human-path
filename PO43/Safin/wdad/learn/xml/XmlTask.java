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
import java.util.*;


public class XmlTask {
    private Document document1;
    private String path = "C:/Users/Андрей/IdeaProjects/starting-monkey-to-human-path-master/starting-monkey-to-human-path/PO43/Safin/wdad/learn/xml/Test.xml";

    public XmlTask() throws IOException, ParserConfigurationException, SAXException {
        generateDoc();
    }
    private void generateDoc() throws IOException,ParserConfigurationException,SAXException{
        File fXmlFile = new File(path);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        document1 = dBuilder.parse(fXmlFile);
    }

    private void updateDoc() throws IOException {
        DOMImplementationLS domImplementationLS =
                (DOMImplementationLS) document1.getImplementation().getFeature("LS", "3.0");
        LSOutput lsOutput = domImplementationLS.createLSOutput();
        FileOutputStream outputStream = new FileOutputStream(path);
        lsOutput.setByteStream(outputStream);
        LSSerializer lsSerializer = domImplementationLS.createLSSerializer();
        lsSerializer.write(document1, lsOutput);
        outputStream.close();
    }


    /*public void removeBook (Person reader, Book book) throws IOException {
        NodeList readerList = document1.getElementsByTagName("reader");
        for (int i = 0; i < readerList.getLength(); i++) {
            NamedNodeMap readerAttribut = readerList.item(i).getAttributes();
            if ((readerAttribut.item(0).getNodeValue().equals(readerList))) {
readerList.item(i).getParentNode().removeChild(readerList.item(i));
                i--;
            }
        }
        updateDoc();*/
    }




