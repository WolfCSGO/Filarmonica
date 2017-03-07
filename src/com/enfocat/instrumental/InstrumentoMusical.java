package com.enfocat.instrumental;

import com.alexco.media.MP3Player;
import com.alexco.media.MP3PlayerThread;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class InstrumentoMusical {

    private String rutaBase = "/com/enfocat/instrumental/media/";

    public void sonar() {
        MP3PlayerThread mp3a;
        try {
            mp3a = new MP3PlayerThread(rutaBase + this.getFileName(), true);
            mp3a.play();
        } catch (Exception ex) {
            Logger.getLogger(MP3PlayerThread.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*MP3Player mp3;
        try {
            mp3 = new MP3Player(MP3Player.class.getResource(rutaBase + this.rutaSonido));
            mp3.play();
        } catch (Exception ex) {
            Logger.getLogger(InstrumentoMusical.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

    public abstract String getFileName();

    public abstract String getNombre();

    public abstract String getTipo();
}
