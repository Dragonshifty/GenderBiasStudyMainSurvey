package com.dragonshiftystudios.app;
import java.util.LinkedList;

public class AnalyticController {
    CSVConverter csvConverter = new CSVConverter();
    OutputToText outputToText = new OutputToText();
    PrintStats printStats = new PrintStats();
    CompetitionWinner competitionWinner = new CompetitionWinner();
    TrackStats clearly = new Clearly();
    TrackStats myOwnExpectations = new MyOwnExpectations();
    TrackStats fine = new Fine();
    TrackStats flyOn = new FlyOn();
    TrackStats myOne = new MyOne();
    TrackStats dreamWistfully = new DreamWistfully();
    TrackStats rising = new Rising();
    TrackStats triggered = new Triggered();
    LinkedList<Participant> participants = new LinkedList<>();
    LinkedList<TrackStats> tracks = new LinkedList<>();

    public void go(){
        getParticipantsList();
        getTrackStats();
        testAverages();
        // competitionWinner.getCompetitionWinner(participants, tracks);
        printStats.startPrint(participants, tracks);
        // tester();
    }

    
    private void getParticipantsList() {
        participants = csvConverter.populateParticipantList();
    }

    private void getTrackStats(){
        tracks.add(clearly);
        tracks.add(myOwnExpectations);
        tracks.add(fine);
        tracks.add(flyOn);
        tracks.add(myOne);
        tracks.add(dreamWistfully);
        tracks.add(rising);
        tracks.add(triggered);

        for (TrackStats track : tracks){
            track.Gather(participants);
        }
    }

    private void testTotals(){
        for (TrackStats track : tracks){
            int mp = track.malePartipantTotal;
            int fp = track.femaleParticipantTotal;
            int nb = track.nBParticipantTotal;
            int up = track.uParticipantTotal;

            int ml = track.maleLedTotal;
            int fl = track.femaleLedTotal;
            System.out.println(mp + fp + nb + up + " " + track.getTrackName());
        }
    }

    private void tester(){
        int otherM = 0;
        int otherF = 0;
        for (Participant participant : participants){
            if (participant.getmPMOE1() != null)otherM += (participant.getmPMOE1().equals("1")) ? 1 : 0;
            if (participant.getmPMOE1() != null)otherF += (participant.getmPMOE1().equals("0")) ? 1 : 0;
            if (participant.getfPMOE1() != null)  otherM += (participant.getfPMOE1().equals("1")) ? 1 : 0;
            if (participant.getfPMOE1() != null)  otherF += (participant.getfPMOE1().equals("0")) ? 1 : 0;

            System.out.println(participant.getfPF1());
        }

        // System.out.println(otherM + " " + otherF);
    }

    private void testAverages(){
        outputToText.openTextFile();

        String[] names = {
            "Clearly",
            "MOE",
            "Fine",
            "Fly On",
            "My One",
            "DW",
            "Rising",
            "Triggered"
        };
        
        int counter = 0;
        for (TrackStats track : tracks){

            outputToText.writeToText(names[counter]);
            outputToText.writeToText("");

            outputToText.writeToText(String.valueOf(tracks.get(counter).venueSizeML));
            outputToText.writeToText(String.valueOf(tracks.get(counter).festivalPercentML));
            outputToText.writeToText(String.valueOf(tracks.get(counter).ratingML));
            outputToText.writeToText(String.valueOf(tracks.get(counter).otherRatingML));
            outputToText.writeToText(String.valueOf(tracks.get(counter).payML));
            outputToText.writeToText(String.valueOf(tracks.get(counter).otherPayML));

            outputToText.writeToText("");

            outputToText.writeToText(String.valueOf(tracks.get(counter).venueSizeFL));
            outputToText.writeToText(String.valueOf(tracks.get(counter).festivalPercentFL));
            outputToText.writeToText(String.valueOf(tracks.get(counter).ratingFL));
            outputToText.writeToText(String.valueOf(tracks.get(counter).otherRatingFL));
            outputToText.writeToText(String.valueOf(tracks.get(counter).payFL));
            outputToText.writeToText(String.valueOf(tracks.get(counter).otherPayFL));

            counter++;
            outputToText.writeToText("");
            outputToText.writeToText("");
        }
        outputToText.closeTextFile();
    }

    
}
