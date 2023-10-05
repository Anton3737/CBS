package WebService.Lesson_2;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.*;
import java.util.List;

public class SAXHelperForCandies extends DefaultHandler {

    private String currentQname;

    private List<Candies> candiesList;

    private Candies candies;

    private String attribut;


    public SAXHelperForCandies() {
        candiesList = new ArrayList<>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        System.out.println("Start element " + qName);
        currentQname = qName;

        if (attributes.getLength() >= 0) {
            attribut = attributes.getValue(0);
            candies = new Candies();
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length);
        System.out.println("Метод characters");
        switch (currentQname) {
            case "id":
                candies.setId(attribut);
                candies.setId(value);
                break;
            case "name":
                candies.setName(value);
                break;
            case "flavor":
                candies.setFlavor(value);
                break;
            case "color":
                candies.setColor(value);
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("End element: " + qName);

        if (currentQname.equals("name")) {
            candiesList.add(candies);
        }
    }

    public List<Candies> getCandiesList() {
        return candiesList;
    }
}
