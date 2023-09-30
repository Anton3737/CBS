package WebService.Lesson_1.ComplexTask;

import WebService.Lesson_1.ComplexTask.entity.Orangery;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.*;

public class SAXObjHendler extends DefaultHandler {

    private String currentQName;
    private List<Orangery> plantsList;
    private Orangery currentPlants;
    private String atrr;

    public SAXObjHendler() {
        plantsList = new ArrayList<>();
    }


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("Start element: " + qName);
        currentQName = qName;

        if (attributes.getLength() > 0) {
            atrr = attributes.getValue(0);
        }

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        String value = new String(ch, start, length);
        System.out.println("Characters: " + value);
        switch (currentQName) {
            case "code":
                currentPlants.setCode(atrr);
                currentPlants.setCode(value);
                break;
            case "Name":
                currentPlants = new Orangery();
                currentPlants.setName(value);
                break;
            case "Soil":
                currentPlants.setSoil(value);
                break;
            case "Origin":
                currentPlants.setOrigin(value);
                break;
            case "StemColor":
                currentPlants.setStemColor(value);
                break;
            case "LeafColor":
                currentPlants.setLeafColor(value);
                break;
            case "Size":
                currentPlants.setSize(value);
                break;
            case "Temperature":
                currentPlants.setTemperature(value);
                break;
            case "Light":
                currentPlants.setLight(value);
                break;
            case "Watering":
                currentPlants.setWatering(value);
                break;
            case "Multiplying":
                currentPlants.setMultiplying(value);
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("End element: " + qName);
        if (currentQName.equals("Name")) {
            plantsList.add(currentPlants);
        }
    }


    public List<Orangery> getPlantsList() {
        return plantsList;
    }
}
