package com.dragonshiftystudios.app;
import java.util.LinkedList;

import javafx.scene.media.Track;

public class PrintStats {
    OutputToText outputToText = new OutputToText();
    LinkedList<Participant> participants = new LinkedList<>();
    LinkedList<TrackStats> tracks = new LinkedList<>();


    public void startPrint(LinkedList<Participant> participants, LinkedList<TrackStats> tracks){
        this.participants = participants;
        this.tracks = tracks;
        printTotals();
    }

    private void printTotals(){
        String fileName = "Totals.txt";
        outputToText.setFileName(fileName);

        outputToText.openTextFile();
        
        for (TrackStats track : tracks){
            outputToText.writeToText(track.getTrackName());
            outputToText.writeToText("");
            printLine("Venue", track.venueSize, track.participantsTotal);
            printLine("Festival", track.festivalPercent, track.participantsTotal);
            printLine("Rating", track.rating, track.participantsTotal);
            printLine("Other Rating", track.otherRating, track.participantsTotal);
            printLine("Pay", track.pay, track.participantsTotal);
            printLine("Other Pay", track.otherPay, track.participantsTotal);
            outputToText.writeToText("");

            if (track.getTrackName().equals("Dream Wistfully")) continue;
            if (track.getTrackName().equals("Rising")) continue;
            if (track.getTrackName().equals("Triggered")) continue;

            printLine("Male Preffered", track.malePreferred, track.participantsTotal);
            printLine("Female Preffered", track.femalePreferred, track.participantsTotal);
            printLine("Others Male", track.maleOtherPreferred, track.participantsTotal);
            printLine("Others Female", track.femaleOtherPreferred, track.participantsTotal);

            outputToText.writeToText("");
            outputToText.writeToText("");
        }

        outputToText.closeTextFile();
    }

    private void printLine(String element, double stat, int total){
        // double percent = ((double) stat / total) * 100;
        String formattedStat = String.format("%.2f", stat);
        // String formattedPercent = String.format("%.2f", percent);
        
        // String line = String.format("%s: %s %d %s%%", element, formattedStat, total, formattedPercent);
        // outputToText.writeToText(line);

        outputToText.writeToText(element + " " + formattedStat+ " " + total);
    }
}


