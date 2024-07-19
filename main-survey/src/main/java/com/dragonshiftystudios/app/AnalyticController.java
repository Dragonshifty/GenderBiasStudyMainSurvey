package com.dragonshiftystudios.app;
import java.util.LinkedList;

public class AnalyticController {
    CSVConverter csvConverter = new CSVConverter();
    OutputToText outputToText = new OutputToText();
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
        competitionWinner.getCompetitionWinner(participants, tracks);
    }

    public void testRating(){
        
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
