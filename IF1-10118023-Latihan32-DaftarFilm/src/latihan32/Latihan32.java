/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan32;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : (Object Oriented) Daftar Film
 */

public class Latihan32 {

    public static void main(String[] args) {
        Film film = new Film();
        
        System.out.println("=====Daftar Sedang Tayang=====");
        System.out.println("");
        
        film.filmName = "Venom";
        film.filmGendre = "Action, Horror, Scifi";
        film.filmRating = 8.5;
        film.filmDuration = 120;
        film.nowPlaying();
        
        film.filmName = "Small Foot";
        film.filmGendre = "Animation";
        film.filmRating = 9.0;
        film.filmDuration = 96;
        film.nowPlaying();
        
        film.filmName = "Crazy Rich Asian";
        film.filmGendre = "Comedy";
        film.filmRating = 7.8;
        film.filmDuration = 119;
        film.nowPlaying();
        
        film.filmName = "Asih";
        film.filmGendre = "Horror";
        film.filmRating = 6.0;
        film.filmDuration = 100;
        film.nowPlaying();
                
    }
    
}
