package com.dragonshiftystudios.app;
import java.util.LinkedList;

public abstract class TrackStats implements IGather {
    LinkedList<Participant> participants = new LinkedList<>();

    String trackName = "";

    int participantsTotal;
    int maleLedTotal = 0;
    int femaleLedTotal = 0;

    double malePreferred = 0;
    double femalePreferred = 0;
    double maleOtherPreferred = 0;
    double femaleOtherPreferred = 0;

    double venueSize;
    double festivalPercent;
    double rating;
    double otherRating;
    double pay;
    double otherPay;

    double venueSizeML;
    double festivalPercentML;
    double ratingML;
    double otherRatingML;
    double payML;
    double otherPayML;

    double venueSizeFL;
    double festivalPercentFL;
    double ratingFL;
    double otherRatingFL;
    double payFL;
    double otherPayFL;

    int venueSizeTotalML = 0;
    int festivalTotalML = 0;
    int ratingTotalML = 0;
    int otherRatingTotalML = 0;
    int payTotalML = 0;
    int otherPayTotalML = 0;

    int venueSizeTotalFL = 0;
    int festivalTotalFL = 0;
    int ratingTotalFL = 0;
    int otherRatingTotalFL = 0;
    int payTotalFL = 0;
    int otherPayTotalFL = 0;

    int venueSizeTotalMP = 0;
    int festivalTotalMP = 0;
    int ratingTotalMP = 0;
    int otherRatingTotalMP = 0;
    int payTotalMP = 0;
    int otherPayTotalMP = 0;

    int venueSizeTotalFP = 0;
    int festivalTotalFP = 0;
    int ratingTotalFP = 0;
    int otherRatingTotalFP = 0;
    int payTotalFP = 0;
    int otherPayTotalFP = 0;

    @Override
    public void Gather(LinkedList<Participant> participants) {
        this.participants = participants;
        participantsTotal = participants.size();
        getStats();
        getMaleLed();
        getFemaleLed();
        getMeanTotals();
    }

    protected abstract void getStats();

    private void getMaleLed() {
        if (maleLedTotal > 0) {
            venueSizeML = (double) venueSizeTotalML / maleLedTotal;
            festivalPercentML = (double) festivalTotalML / maleLedTotal;
            ratingML = (double) ratingTotalML / maleLedTotal;
            otherRatingML = (double) otherRatingTotalML / maleLedTotal;
            payML = (double) payTotalML / maleLedTotal;
            otherPayML = (double) otherPayTotalML / maleLedTotal;
        }
    }

    private void getFemaleLed() {
        if (femaleLedTotal > 0) {
            venueSizeFL = (double) venueSizeTotalFL / femaleLedTotal;
            festivalPercentFL = (double) festivalTotalFL / femaleLedTotal;
            ratingFL = (double) ratingTotalFL / femaleLedTotal;
            otherRatingFL = (double) otherRatingTotalFL / femaleLedTotal;
            payFL = (double) payTotalFL / femaleLedTotal;
            otherPayFL = (double) otherPayTotalFL / femaleLedTotal;
        }
    }

    private void getMeanTotals(){
        int totalLed = maleLedTotal + femaleLedTotal;

        if (totalLed > 0) {
            venueSize = ((venueSizeML * maleLedTotal) + (venueSizeFL * femaleLedTotal)) / totalLed;
            festivalPercent = ((festivalPercentML * maleLedTotal) + (festivalPercentFL * femaleLedTotal)) / totalLed;
            rating = ((ratingML * maleLedTotal) + (ratingFL * femaleLedTotal)) / totalLed;
            otherRating = ((otherRatingML * maleLedTotal) + (otherRatingFL * femaleLedTotal)) / totalLed;
            pay = ((payML * maleLedTotal) + (payFL * femaleLedTotal)) / totalLed;
            otherPay = ((otherPayML * maleLedTotal) + (otherPayFL * femaleLedTotal)) / totalLed;
        }
    }

    private void getTrackPreferences(){

    }

    public double getRating(){
        return rating;
    }

    public String getTrackName(){
        return trackName;
    }
}
