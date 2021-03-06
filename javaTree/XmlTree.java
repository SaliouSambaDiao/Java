import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import java.io.*;

public class XmlTree {
    private static int level;

    public static String pathToXml(String path) {
        File directory = new File(path);
        String myXmlString = "\n" + "<directory name = " + "\"" + directory.getName() + "\"" + ">";
        File[] directories = directory.listFiles();
        for (File myCurrentFile : directories) {
            if (myCurrentFile.isFile()) {
                myXmlString = myXmlString + "\n" + "\t" + "<file name = " + "\"" + myCurrentFile.getName() + "\"" + "/>";
            }
            else if (myCurrentFile.isDirectory()) {
                myXmlString = myXmlString + pathToXml(myCurrentFile.getAbsolutePath());
            }
        }
        myXmlString = myXmlString + "\n" + "</directory>" + "\n";
        return myXmlString;
    }

    public static Component insertionOfCOmponent(Element e) {
        XmlFolder myNewDirectory = new XmlFolder(e.getAttribute("name"), level);
        NodeList nodes = e.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) nodes.item(i);
                if (element.getNodeName().equals("file")) {
                    Component myFile;
                    myFile = new XmlFile(element.getAttribute("name"), myNewDirectory.getLevel() + 1);
                    myNewDirectory.addComponent(myFile);
                }
                else if (element.getNodeName().equals("directory")) {
                    level = myNewDirectory.getLevel() + 1;
                    myNewDirectory.addComponent(insertionOfCOmponent(element));
                    level--;
                }
            }
        }
        return myNewDirectory;
    }

    public static Component xmlToDoc(String currentXmlString) throws ParserConfigurationException, SAXException, IOException {
        String xmlStr = "<?xml version=\"1.0\"?>" + currentXmlString;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        StringBuilder xmlStringBuilder = new StringBuilder();
        xmlStringBuilder.append(xmlStr);
        ByteArrayInputStream input = new ByteArrayInputStream(xmlStringBuilder.toString().getBytes("UTF-8"));
        Document doc = builder.parse(input);
        Element element = doc.getDocumentElement();
        return insertionOfCOmponent(element);
    }

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        String xmlString1 = pathToXml("/home/cheeks/Bureau/DIC1/ForXML");
        System.out.println(xmlString1);
        Component directoryToDisplay = xmlToDoc(xmlString1);
        directoryToDisplay.recursiveTreeDisplay();
    }
}
