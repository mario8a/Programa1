/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1compiladores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



/**
 *
 * @author MARIO
 */
public class Programa1Compiladores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        //abrir el fichero
        FileReader fr = new FileReader("archivo.txt");
        //leer caracter a caracter
        BufferedReader br = new BufferedReader(fr);
        //leer el primer caracter
        int caracterASCII = br.read();
        
        int contador = 0;
        
        while(caracterASCII != -1)
        {
            contador++;
            caracterASCII = br.read();
        }
        
       //ESTA parte crea otro archivo de texto donde me dice el numero de caracteres :)
         /*
        File f = new File("caracteres.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("He contado que en el fichero hay "+ contador+ " caracteres");
        bw.close();
        */
        
        System.out.println("He contado que en el fichero hay "+ contador+ " caracteres");
       
    }
    
}
