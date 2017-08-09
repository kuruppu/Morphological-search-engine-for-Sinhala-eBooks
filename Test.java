/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebook;

import java.io.UnsupportedEncodingException;

/**
 *
 * @author Yashmika
 */
public class Test {

    public static void main(String[] args) {
        try {
            // Convert from Unicode to UTF-8
            String string = "\u0050";
            byte[] utf8 = string.getBytes("UTF-8");

            // Convert from UTF-8 to Unicode
            string = new String(utf8, "UTF-8");
            
            System.out.println(string);
        } catch (UnsupportedEncodingException e) {
        }
    }
}
