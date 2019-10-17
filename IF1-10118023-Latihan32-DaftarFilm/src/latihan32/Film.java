/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan32;

/**
 *
 * @author Zaenal PC
 */
public class Film {
    public String filmName;
    public String filmGendre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying(){
        System.out.println("Judul Film\t: " + filmName);
        System.out.println("Gendre Film\t: " + filmGendre);
        System.out.println("Rating Film\t: " + filmRating);
        System.out.println("Duration Film\t: " + filmDuration + " Menit");
        System.out.println("");
    }
    
}
