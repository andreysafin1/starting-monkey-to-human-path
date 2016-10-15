package PO43.Safin.wdad.learn.xml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.io.File;



public class XmlTask {
    private Document document;
    private String path = "C:/Users/Андрей/IdeaProjects/starting-monkey-to-human-path-master/starting-monkey-to-human-path/PO43/Safin/wdad/learn/xml/Test.xml";

    public XmlTask() throws IOException, ParserConfigurationException, SAXException {
        File file = new File(path);
        document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(path);
    }

    }




