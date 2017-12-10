package com.beyondcoding.training.cleancode.comments;

import com.beyondcoding.training.cleancode.comments.support.Instrument;
import com.beyondcoding.training.cleancode.comments.support.MusicSheet;
import com.beyondcoding.training.cleancode.comments.support.Song;

public class Musician {

    public void play(Song song) {
        Instrument instrument = getMyInstrument();
        // clean(instrument);
        tune(instrument);
        // warmUpMyFingers();
        MusicSheet musicSheet = song.getMusicSheet();
        instrument.play(musicSheet);
    }

    private Instrument getMyInstrument() {
        return new Instrument();
    }

    private void tune(Instrument instrument) { }


}
