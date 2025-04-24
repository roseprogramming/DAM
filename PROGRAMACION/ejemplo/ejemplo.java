package PROGRAMACION.ejemplo;


import java.io.File;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

public class ejemplo {
    public static void main(String[] args) throws Exception {
        // Crear estructura del documento
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.newDocument();

        // Nodo raíz: <agenda>
        Element agenda = doc.createElement("agenda");
        doc.appendChild(agenda);

        // Crear un contacto
        Element contacto = doc.createElement("contacto");

        // Elementos del contacto
        Element nombre = doc.createElement("nombre");
        nombre.setTextContent("Ana López");

        Element direccion = doc.createElement("direccion");
        direccion.setTextContent("Calle Falsa 123");

        Element email = doc.createElement("email");
        email.setTextContent("ana@example.com");

        // Agregar elementos al contacto
        contacto.appendChild(nombre);
        contacto.appendChild(direccion);
        contacto.appendChild(email);

        // Agregar contacto a la agenda
        agenda.appendChild(contacto);

        // Guardar el documento en un archivo XML (opcional)
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes"); // formato bonito
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("agenda.xml"));
        transformer.transform(source, result);

        System.out.println("Archivo 'agenda.xml' creado correctamente.");
    }
}
