/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebook;

/**
 *
 * @author Yashmika
 */
import com.aspose.pdf.Document;
import com.aspose.pdf.SaveFormat;
import java.io.UnsupportedEncodingException;

public class PdfToxml {
   String docUrl;
    public  PdfToxml(String docUrl){
       this.docUrl=docUrl;
    }

    public static void main(String[] args) {
        // instantiate Document object
        Document doc = new Document("");
       
// save the output in XML format
        doc.save("resultant.xml", SaveFormat.Xml);

         /*try {
            // Convert from Unicode to UTF-8
            String string = "\u0050";
            byte[] utf8 = string.getBytes("UTF-8");

            // Convert from UTF-8 to Unicode
            string = new String(utf8, "UTF-8");

            System.out.println(string);
        } catch (UnsupportedEncodingException e) {
        }*/
    }

}
