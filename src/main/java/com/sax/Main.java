package com.sax;


import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

//для создания парсера данных
//Данный класс содержит основу для создания парсера и перенаправление
// на обработку и чтения данных из XML.
public class Main {
    public static void main (String [] args){
        String path = new File("E:\\!!!EDUCATION\\IBA 2021\\ANKazakov\\ПрилИС\\DOM, SAX, JAXB\\lab3_sax\\books.xml").getAbsolutePath();
        try{
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            BookXMLHandler handler = new BookXMLHandler();
            parser.parse(new File(path), handler);
        } catch (IOException x) {
            System.err.println(x);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();

        }
    }
}
