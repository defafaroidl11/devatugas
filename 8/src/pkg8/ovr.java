/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template ovr
 */
package pkg8;

/**
 *
 * @author KAMAL
 */
 class PemutarAudio {

    public void putar(String lagu) {
        System.out.println("Memutar lagu: " + lagu);
    }

    public void putar(String artis, String album) {
        System.out.println("Memutar album: " + album + " oleh " + artis);
    }

    public void putar(String artis, String album, int acak) {
        System.out.println("Memutar album: " + album + " oleh " + artis + " dengan acak: " + (acak > 0));
    }
}

class PemutarAudioEkstra extends PemutarAudio {

    @Override
    public void putar(String lagu) {
        System.out.println("Memutar lagu: " + lagu + " (Ekstra)");
    }

    @Override
    public void putar(String artis, String album) {
        System.out.println("Memutar album: " + album + " oleh " + artis + " (Ekstra)");
    }

    @Override
    public void putar(String artis, String album, int acak) {
        System.out.println("Memutar album: " + album + " oleh " + artis + " dengan acak: " + (acak > 0) + " (Ekstra)");
    }
}

public class ovr {

    public static void main(String[] args) {
        PemutarAudio pemutar = new PemutarAudioEkstra();

        pemutar.putar("Bohemian Rhapsody");

        pemutar.putar("Queen", "A Night at the Opera");

        pemutar.putar("Pink Floyd", "The Dark Side of the Moon", 1);
    }
}

