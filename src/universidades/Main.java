/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidades;

/**
 *
 * @author dfeli
 */
public class Main {
    public static void main(String[] args) {
        Universidad UN= new Universidad("Unal");
        UN.añadirEdContinua("aa","bb", 0, 0);
        UN.eliminarSede("aa");
        
    }
}
