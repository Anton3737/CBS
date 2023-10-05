package WebService.Lesson_2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class DOMHelperForCandies {

    private Document document;


    public DOMHelperForCandies() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        // Створюємо файл за вказаним посиланням
        // Звідки беремо інформацію і з якм ми маніпулюємо
        document = (Document) documentBuilder.parse("src/WebService/Lesson_2/candies.xml");
    }


    public void addCandy(Candies newCandy) throws TransformerException {
        Element root = document.getDocumentElement();

        Element candy = document.createElement("candy");
        Element name = document.createElement("name");
        Element flavor = document.createElement("flavor");
        Element color = document.createElement("color");


        name.setTextContent(newCandy.getName());
        flavor.setTextContent(newCandy.getFlavor());
        color.setTextContent(newCandy.getColor());

        root.appendChild(candy);
            candy.appendChild(name);
            candy.appendChild(flavor);
            candy.appendChild(color);

        //  Куди додаємо Цукерку
        DOMSource domSource = new DOMSource(document);
        String outputURL = "src/WebService/Lesson_2/candies.xml";


        StreamResult streamResult = new StreamResult(new File(outputURL));


        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.transform(domSource, streamResult);
    }

}
