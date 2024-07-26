package com.dragonshiftystudios.app;
import java.util.LinkedList;

public class PrintStats {
    OutputToText outputToText = new OutputToText();
    LinkedList<Participant> participants = new LinkedList<>();
    LinkedList<TrackStats> tracks = new LinkedList<>();


    public void startPrint(LinkedList<Participant> participants, LinkedList<TrackStats> tracks){
        this.participants = participants;
        this.tracks = tracks;
        printTotals();
        printMaleLed();
        printFemaleLed();
        printMaleParticipant();
        printFemaleParticipant();
        printNBParticipant();
        printUndeclaredParticipant();
    }

    private void printTotals(){
        String fileName = "Total Participants.txt";
        outputToText.setFileName(fileName);

        outputToText.openTextFile();
        
        for (TrackStats track : tracks){
            outputToText.writeToText(track.getTrackName());
            outputToText.writeToText("");
            outputToText.writeToText("Participants: " + track.participantsTotal);
            printLine("Venue", track.venueSize);
            printLine("Festival", track.festivalPercent);
            printLine("Rating", track.rating);
            printLine("Other Rating", track.otherRating);
            printLine("Pay", track.pay);
            printLine("Other Pay", track.otherPay);
            outputToText.writeToText("");

            if (track.getTrackName().equals("Dream Wistfully")) continue;
            if (track.getTrackName().equals("Rising")) continue;
            if (track.getTrackName().equals("Triggered")) continue;

            printLinePref("Male Preffered", track.malePreferred, track.prefMaleMean);
            printLinePref("Female Preffered", track.femalePreferred, track.prefFemaleMean);
            printLinePref("Others Male", track.maleOtherPreferred, track.otherPrefMaleMean);
            printLinePref("Others Female", track.femaleOtherPreferred, track.otherPrefFemaleMean);

            outputToText.writeToText("");
            outputToText.writeToText("");
        }

        outputToText.closeTextFile();
    }

    private void printMaleLed(){
        String fileName = "Male Led Participants.txt";
        outputToText.setFileName(fileName);

        outputToText.openTextFile();
        
        for (TrackStats track : tracks){
            outputToText.writeToText(track.getTrackName());
            outputToText.writeToText("");
            outputToText.writeToText("Participants: " + track.maleLedTotal);
            printLine("Venue", track.venueSizeML);
            printLine("Festival", track.festivalPercentML);
            printLine("Rating", track.ratingML);
            printLine("Other Rating", track.otherRatingML);
            printLine("Pay", track.payML);
            printLine("Other Pay", track.otherPayML);
            outputToText.writeToText("");

            if (track.getTrackName().equals("Dream Wistfully")) continue;
            if (track.getTrackName().equals("Rising")) continue;
            if (track.getTrackName().equals("Triggered")) continue;

            printLinePref("Male Preffered", track.malePreferredML, track.prefMaleMeanML);
            printLinePref("Female Preffered", track.femalePreferredML, track.prefFemaleMeanML);
            printLinePref("Others Male", track.maleOtherPreferredML, track.otherPrefMaleMeanML);
            printLinePref("Others Female", track.femaleOtherPreferredML, track.otherPrefFemaleMeanML);

            outputToText.writeToText("");
            outputToText.writeToText("");
        }

        outputToText.closeTextFile();
    }

    private void printFemaleLed(){
        String fileName = "Female Led Participants.txt";
        outputToText.setFileName(fileName);

        outputToText.openTextFile();
        
        for (TrackStats track : tracks){
            outputToText.writeToText(track.getTrackName());
            outputToText.writeToText("");
            outputToText.writeToText("Participants: " + track.femaleLedTotal);
            printLine("Venue", track.venueSizeFL);
            printLine("Festival", track.festivalPercentFL);
            printLine("Rating", track.ratingFL);
            printLine("Other Rating", track.otherRatingFL);
            printLine("Pay", track.payFL);
            printLine("Other Pay", track.otherPayFL);
            outputToText.writeToText("");

            if (track.getTrackName().equals("Dream Wistfully")) continue;
            if (track.getTrackName().equals("Rising")) continue;
            if (track.getTrackName().equals("Triggered")) continue;

            printLinePref("Male Preffered", track.malePreferredFL, track.prefMaleMeanFL);
            printLinePref("Female Preffered", track.femalePreferredFL, track.prefFemaleMeanFL);
            printLinePref("Others Male", track.maleOtherPreferredFL, track.otherPrefMaleMeanFL);
            printLinePref("Others Female", track.femaleOtherPreferredFL, track.otherPrefFemaleMeanFL);

            outputToText.writeToText("");
            outputToText.writeToText("");
        }

        outputToText.closeTextFile();
    }

    private void printMaleParticipant(){
        String fileName = "Male Participants.txt";
        outputToText.setFileName(fileName);

        outputToText.openTextFile();
        
        for (TrackStats track : tracks){
            outputToText.writeToText(track.getTrackName());
            outputToText.writeToText("");
            outputToText.writeToText("Participants: " + track.malePartipantTotal);
            printLine("Venue", track.venueSizeMP);
            printLine("Festival", track.festivalPercentMP);
            printLine("Rating", track.ratingMP);
            printLine("Other Rating", track.otherRatingMP);
            printLine("Pay", track.payMP);
            printLine("Other Pay", track.otherPayMP);
            outputToText.writeToText("");

            if (track.getTrackName().equals("Dream Wistfully")) continue;
            if (track.getTrackName().equals("Rising")) continue;
            if (track.getTrackName().equals("Triggered")) continue;

            printLinePref("Male Preffered", track.malePreferredMP, track.prefMaleMeanMP);
            printLinePref("Female Preffered", track.femalePreferredMP, track.prefFemaleMeanMP);
            printLinePref("Others Male", track.maleOtherPreferredMP, track.otherPrefMaleMeanMP);
            printLinePref("Others Female", track.femaleOtherPreferredMP, track.otherPrefFemaleMeanMP);

            outputToText.writeToText("");
            outputToText.writeToText("");
        }

        outputToText.closeTextFile();
    }

    private void printFemaleParticipant(){
        String fileName = "Female Participants.txt";
        outputToText.setFileName(fileName);

        outputToText.openTextFile();
        
        for (TrackStats track : tracks){
            outputToText.writeToText(track.getTrackName());
            outputToText.writeToText("");
            outputToText.writeToText("Participants: " + track.femaleParticipantTotal);
            printLine("Venue", track.venueSizeFP);
            printLine("Festival", track.festivalPercentFP);
            printLine("Rating", track.ratingFP);
            printLine("Other Rating", track.otherRatingFP);
            printLine("Pay", track.payFP);
            printLine("Other Pay", track.otherPayFP);
            outputToText.writeToText("");

            if (track.getTrackName().equals("Dream Wistfully")) continue;
            if (track.getTrackName().equals("Rising")) continue;
            if (track.getTrackName().equals("Triggered")) continue;

            printLinePref("Male Preffered", track.malePreferredFP, track.prefMaleMeanFP);
            printLinePref("Female Preffered", track.femalePreferredFP, track.prefFemaleMeanFP);
            printLinePref("Others Male", track.maleOtherPreferredFP, track.otherPrefMaleMeanFP);
            printLinePref("Others Female", track.femaleOtherPreferredFP, track.otherPrefFemaleMeanFP);

            outputToText.writeToText("");
            outputToText.writeToText("");
        }

        outputToText.closeTextFile();
    }

    private void printNBParticipant(){
        String fileName = "Non-binary Participants.txt";
        outputToText.setFileName(fileName);

        outputToText.openTextFile();
        
        for (TrackStats track : tracks){
            outputToText.writeToText(track.getTrackName());
            outputToText.writeToText("");
            outputToText.writeToText("Participants: " + track.nBParticipantTotal);
            printLine("Venue", track.venueSizeNBP);
            printLine("Festival", track.festivalPercentNBP);
            printLine("Rating", track.ratingNBP);
            printLine("Other Rating", track.otherRatingNBP);
            printLine("Pay", track.payNBP);
            printLine("Other Pay", track.otherPayNBP);
            outputToText.writeToText("");

            if (track.getTrackName().equals("Dream Wistfully")) continue;
            if (track.getTrackName().equals("Rising")) continue;
            if (track.getTrackName().equals("Triggered")) continue;

            printLinePref("Male Preffered", track.malePreferredNBP, track.prefMaleMeanNBP);
            printLinePref("Female Preffered", track.femalePreferredNBP, track.prefFemaleMeanNBP);
            printLinePref("Others Male", track.maleOtherPreferredNBP, track.otherPrefMaleMeanNBP);
            printLinePref("Others Female", track.femaleOtherPreferredNBP, track.otherPrefFemaleMeanNBP);

            outputToText.writeToText("");
            outputToText.writeToText("");
        }

        outputToText.closeTextFile();
    }

    private void printUndeclaredParticipant(){
        String fileName = "Undeclared Participants.txt";
        outputToText.setFileName(fileName);

        outputToText.openTextFile();
        
        for (TrackStats track : tracks){
            outputToText.writeToText(track.getTrackName());
            outputToText.writeToText("");
            outputToText.writeToText("Participants: " + track.uParticipantTotal);
            printLine("Venue", track.venueSizeUP);
            printLine("Festival", track.festivalPercentUP);
            printLine("Rating", track.ratingUP);
            printLine("Other Rating", track.otherRatingUP);
            printLine("Pay", track.payUP);
            printLine("Other Pay", track.otherPayUP);
            outputToText.writeToText("");

            if (track.getTrackName().equals("Dream Wistfully")) continue;
            if (track.getTrackName().equals("Rising")) continue;
            if (track.getTrackName().equals("Triggered")) continue;

            printLinePref("Male Preffered", track.malePreferredUP, track.prefMaleMeanUP);
            printLinePref("Female Preffered", track.femalePreferredUP, track.prefFemaleMeanUP);
            printLinePref("Others Male", track.maleOtherPreferredUP, track.otherPrefMaleMeanUP);
            printLinePref("Others Female", track.femaleOtherPreferredUP, track.otherPrefFemaleMeanUP);

            outputToText.writeToText("");
            outputToText.writeToText("");
        }

        outputToText.closeTextFile();
    }

    private void printLine(String element, double stat){
        String formattedStat = String.format("%.2f", stat);
        outputToText.writeToText(element + " " + formattedStat);
    }

    private void printLinePref(String element, double stat, double percent){
        String formattedPercent = String.format("%.2f%%", percent);
        outputToText.writeToText(element + " " + stat + " " + formattedPercent);
    }
}


