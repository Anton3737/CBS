package WebService.Lesson_1.ComplexTask;

import WebService.Lesson_1.ComplexTask.entity.Orangery;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;


public class DOMHelperForAddObj {

    private Document document;


    public DOMHelperForAddObj() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        document = (Document) documentBuilder.parse("src/WebService/Lesson_1/ComplexTask/OrangeryNewObj.xml");
    }


    public void addPlant(Orangery newPlant) throws TransformerException {

        Element root = document.getDocumentElement();

        Element Plant = document.createElement("Plant");
        Element Name = document.createElement("Name");
        Element Soil = document.createElement("Soil");
        Element Origin = document.createElement("Origin");
        Element VisualParameters = document.createElement("VisualParameters");
        Element StemColor = document.createElement("StemColor");
        Element LeafColor = document.createElement("LeafColor");
        Element Size = document.createElement("Size");
        Element GrowingTips = document.createElement("GrowingTips");
        Element Temperature = document.createElement("Temperature");
        Element Light = document.createElement("Light");
        Element Watering = document.createElement("Watering");
        Element Multiplying = document.createElement("Multiplying");

        Plant.setAttribute("code", newPlant.getCode());

        Name.setTextContent(newPlant.getName());
        Soil.setTextContent(newPlant.getSoil());
        Origin.setTextContent(newPlant.getOrigin());
//        VisualParameters.setTextContent();
        StemColor.setTextContent(newPlant.getStemColor());
        LeafColor.setTextContent(newPlant.getLeafColor());
        Size.setTextContent(newPlant.getSize());
//        GrowingTips.setTextContent(newPlant.getName());
        Temperature.setTextContent(newPlant.getTemperature());
        Light.setTextContent(newPlant.getLight());
        Watering.setTextContent(newPlant.getWatering());
        Multiplying.setTextContent(newPlant.getMultiplying());


        root.appendChild(Plant);

        Plant.appendChild(Name);
        Plant.appendChild(Soil);
        Plant.appendChild(Origin);
        Plant.appendChild(VisualParameters);
        VisualParameters.appendChild(StemColor);
        VisualParameters.appendChild(LeafColor);
        VisualParameters.appendChild(Size);
        Plant.appendChild(GrowingTips);
        GrowingTips.appendChild(Temperature);
        GrowingTips.appendChild(Light);
        GrowingTips.appendChild(Watering);
        Plant.appendChild(Multiplying);


        // Створюємо ХМL файл - вихідний
        DOMSource domSource = new DOMSource(document);
        String outputURL = "/Users/macintosh/IdeaProjects/CBS/src/WebService/Lesson_1/ComplexTask/OrangeryNewObjOut.xml";

        StreamResult streamResult = new StreamResult(new File(outputURL));


        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.transform(domSource, streamResult);

    }

}
