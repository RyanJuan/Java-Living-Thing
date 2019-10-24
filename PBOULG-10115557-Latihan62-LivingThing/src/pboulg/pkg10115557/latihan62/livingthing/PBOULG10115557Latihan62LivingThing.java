/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg.pkg10115557.latihan62.livingthing;

/**
 *
 * @author RyanJuan
 * Nama                 : Rayan
 * Kelas                : PBO ULG
 * NIM                  : 10115557
 * Deskripsi Program    : Program ini menampilkan data tentang mahkluk hidup
 */
public class PBOULG10115557Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Human human = new Human();
        human.setNama("Ryan Juan");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    
    }
    
}
