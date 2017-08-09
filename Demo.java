package ebook;

import java.io.IOException;
import java.util.regex.*;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Demo {
    public static void main(String args[]){
        String text,bookUrl=null,word=null;
        if(args.length>1){
            word=args[1];
        }
        if(args.length>0){
            bookUrl=args[0];
        }
        try {
            File file = new File(bookUrl);
            PDDocument doc = PDDocument.load(file);
            PDFTextStripper pdfts = new PDFTextStripper();
            text = pdfts.getText(doc);
            //System.out.println(text);
            String source=text;
            Matcher m=null;
            System.out.println("word is ......"+word);
            if(word!=null){
                Pattern p=Pattern.compile(word);
                m=p.matcher(source);
            }

            if(m!=null){
                while(m.find()){
                    int index=m.start();
                    String s=m.group();
                    System.out.println(index+" "+s);
                }
            }

            doc.close();
        } catch (IOException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
