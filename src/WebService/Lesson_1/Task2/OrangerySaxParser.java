package WebService.Lesson_1.Task2;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class OrangerySaxParser extends DefaultHandler {

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
    }


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("start element " + qName);
        for (int i = 0; i < attributes.getLength(); i++) {
            System.out.println("atributes " + attributes.getQName(i) + " | " + attributes.getValue(i));
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println("characters" + new String(ch, start, length) + "");
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("end element " + qName);
    }


    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
    }

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {


        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();

        File file = new File("/Users/macintosh/IdeaProjects/CBS/src/WebService/Lesson_1/Task2/Orangery.xml");


        if (file.exists()){
            saxParser.parse(file, new OrangerySaxParser());
        }else {
            System.err.println("XML не спарсився ");
        }


    }
}
