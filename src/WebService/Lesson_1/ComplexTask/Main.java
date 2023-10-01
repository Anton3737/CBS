package WebService.Lesson_1.ComplexTask;

import WebService.Lesson_1.ComplexTask.entity.Orangery;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {


        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        SAXObjHendler saxObjHendler = new SAXObjHendler();

        File file = new File("src/WebService/Lesson_1/ComplexTask/Orangery.xml");
        parser.parse(file, saxObjHendler);

        List<Orangery> plantsList = saxObjHendler.getPlantsList();

        System.out.println("##################################");

        System.out.println(plantsList.size());




        System.out.println("All plants: ");


        String tableForPage = plantsList.toString();
        System.out.println(tableForPage);




        // Сортировка є але не працює як треба

        Collections.sort(plantsList, new Comparator<Orangery>() {
            public int compare(Orangery o1, Orangery o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });


        for (Orangery plant : plantsList) {
            System.out.println(
                            plant.getCode() + " " +
                            plant.getName() + " " +
                            plant.getSoil() + " " +
                            plant.getOrigin() + " " +
                            plant.getStemColor() + " " +
                            plant.getLeafColor() + " " +
                            plant.getSize() + " " +
                            plant.getTemperature() + " " +
                            plant.getLight() + " " +
                            plant.getWatering() + " " +
                            plant.getMultiplying());
        }


        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer(new StreamSource(new File("src/WebService/Lesson_1/ComplexTask/Orangery.xslt")));
            StreamSource streamSource = new StreamSource(new File("src/WebService/Lesson_1/ComplexTask/Orangery.xml"));
            StreamResult streamResult = new StreamResult(new File("src/WebService/Lesson_1/ComplexTask/Orangery.html"));
            transformer.transform(streamSource,streamResult);

        }catch (Exception e ){
            System.out.println(e.getMessage());
        }



    }
}
