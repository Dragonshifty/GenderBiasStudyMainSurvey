package com.dragonshiftystudios.app;
import java.util.LinkedList;

public class AnalyticController {
    CSVConverter csvConverter = new CSVConverter();
    LinkedList<Participant> participants = new LinkedList<>();

    public void go(){
        getParticipantsList();
        getTrackStats();
    }
    
    private void getParticipantsList() {
        participants = csvConverter.populateParticipantList();
    }

    private void getTrackStats(){
        LinkedList<TrackStats> tracks = new LinkedList<>();

        TrackStats clearly = new Clearly();
        TrackStats myOwnExpectations = new MyOwnExpectations();
        TrackStats fine = new Fine();
        TrackStats flyOn = new FlyOn();
        TrackStats myOne = new MyOne();
        TrackStats dreamWistfully = new DreamWistfully();
        TrackStats rising = new Rising();
        TrackStats triggered = new Triggered();

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

        // System.out.println(clearly.rating);
        // System.out.println(fine.ratingML);
        // System.out.println(fine.ratingFL);
        System.out.println(fine.ratingFL);
    }
}
