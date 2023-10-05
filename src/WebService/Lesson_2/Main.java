package WebService.Lesson_2;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {

        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();

        SAXHelperForCandies saxHelperForCandies = new SAXHelperForCandies();

        File file = new File("/Users/macintosh/IdeaProjects/CBS/src/WebService/Lesson_2/candies.xml");
        saxParser.parse(file, saxHelperForCandies);

        List<Candies> newCandiesList = saxHelperForCandies.getCandiesList();

        System.out.println("Виводимо спарсений файл");

        System.out.println("All plants: ");
        System.out.println(newCandiesList.size() + " Обєктві");

        for (Candies resObj : newCandiesList) {
            System.out.println(resObj.getName() + " " + resObj.getColor() + " " + resObj.getFlavor());
        }


        DOMHelperForCandies domHelperForCandies = new DOMHelperForCandies();

        Candies candies = new Candies();
        candies.setId("14");
        candies.setName("Салов в шоколаді");
        candies.setFlavor("шоколад");
        candies.setColor("Білий");

        domHelperForCandies.addCandy(candies);


        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer(new StreamSource(new File("/Users/macintosh/IdeaProjects/CBS/src/WebService/Lesson_2/candies.xslt")));
            StreamSource streamSource = new StreamSource(new File("/Users/macintosh/IdeaProjects/CBS/src/WebService/Lesson_2/candies.xml"));
            StreamResult streamResult = new StreamResult(new File("/Users/macintosh/IdeaProjects/CBS/src/WebService/Lesson_2/candiesOut.html"));
            transformer.transform(streamSource, streamResult);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

}

class CandiesSort implements Comparator<Candies> {

    @Override
    public int compare(Candies o1, Candies o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

