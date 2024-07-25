package com.dragonshiftystudios.app;
import java.util.LinkedList;

public abstract class TrackStats implements IGather {
    LinkedList<Participant> participants = new LinkedList<>();

    String trackName = "";

    int participantsTotal = 0;
    int maleLedTotal = 0;
    int femaleLedTotal = 0;
    int malePartipantTotal = 0;
    int femaleParticipantTotal = 0;
    int nBParticipantTotal = 0;
    int uParticipantTotal = 0;

    double malePreferred = 0;
    double femalePreferred = 0;
    double maleOtherPreferred = 0;
    double femaleOtherPreferred = 0;

    double malePreferredML = 0;
    double femalePreferredML = 0;
    double maleOtherPreferredML = 0;
    double femaleOtherPreferredML = 0;

    double malePreferredFL = 0;
    double femalePreferredFL = 0;
    double maleOtherPreferredFL = 0;
    double femaleOtherPreferredFL = 0;

    double malePreferredMP = 0;
    double femalePreferredMP = 0;
    double maleOtherPreferredMP = 0;
    double femaleOtherPreferredMP = 0;

    double malePreferredFP = 0;
    double femalePreferredFP = 0;
    double maleOtherPreferredFP = 0;
    double femaleOtherPreferredFP = 0;

    double malePreferredNBP = 0;
    double femalePreferredNBP = 0;
    double maleOtherPreferredNBP = 0;
    double femaleOtherPreferredNBP = 0;

    double malePreferredUP = 0;
    double femalePreferredUP = 0;
    double maleOtherPreferredUP = 0;
    double femaleOtherPreferredUP = 0;

    double venueSize;
    double festivalPercent;
    double rating;
    double otherRating;
    double pay;
    double otherPay;
    double prefMaleMean;
    double prefFemaleMean;
    double otherPrefMaleMean;
    double otherPrefFemaleMean;

    double venueSizeML;
    double festivalPercentML;
    double ratingML;
    double otherRatingML;
    double payML;
    double otherPayML;
    double prefMaleMeanML;
    double prefFemaleMeanML;
    double otherPrefMaleMeanML;
    double otherPrefFemaleMeanML;

    double venueSizeFL;
    double festivalPercentFL;
    double ratingFL;
    double otherRatingFL;
    double payFL;
    double otherPayFL;
    double prefMaleMeanFL;
    double prefFemaleMeanFL;
    double otherPrefMaleMeanFL;
    double otherPrefFemaleMeanFL;

    double venueSizeMP;
    double festivalPercentMP;
    double ratingMP;
    double otherRatingMP;
    double payMP;
    double otherPayMP;
    double prefMaleMeanMP;
    double prefFemaleMeanMP;
    double otherPrefMaleMeanMP;
    double otherPrefFemaleMeanMP;

    double venueSizeFP;
    double festivalPercentFP;
    double ratingFP;
    double otherRatingFP;
    double payFP;
    double otherPayFP;
    double prefMaleMeanFP;
    double prefFemaleMeanFP;
    double otherPrefMaleMeanFP;
    double otherPrefFemaleMeanFP;

    double venueSizeNBP;
    double festivalPercentNBP;
    double ratingNBP;
    double otherRatingNBP;
    double payNBP;
    double otherPayNBP;
    double prefMaleMeanNBP;
    double prefFemaleMeanNBP;
    double otherPrefMaleMeanNBP;
    double otherPrefFemaleMeanNBP;

    double venueSizeUP;
    double festivalPercentUP;
    double ratingUP;
    double otherRatingUP;
    double payUP;
    double otherPayUP;
    double prefMaleMeanUP;
    double prefFemaleMeanUP;
    double otherPrefMaleMeanUP;
    double otherPrefFemaleMeanUP;

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

    int venueSizeTotalNBP = 0;
    int festivalTotalNBP = 0;
    int ratingTotalNBP = 0;
    int otherRatingTotalNBP = 0;
    int payTotalNBP = 0;
    int otherPayTotalNBP = 0;

    int venueSizeTotalUP = 0;
    int festivalTotalUP = 0;
    int ratingTotalUP = 0;
    int otherRatingTotalUP = 0;
    int payTotalUP = 0;
    int otherPayTotalUP = 0;

    @Override
    public void Gather(LinkedList<Participant> participants) {
        this.participants = participants;
        participantsTotal = participants.size();
        getStats();
        getMaleLed();
        getFemaleLed();
        getMaleParticpant();
        getFemaleParticpant();
        getNBParticipant();
        getUndeclaredParticipant();
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
            prefMaleMeanML = ((double) malePreferredML / maleLedTotal) * 100;
            otherPrefMaleMeanML = ((double) maleOtherPreferredML / maleLedTotal) * 100;
            prefFemaleMeanML = ((double) femalePreferredML / maleLedTotal) * 100;
            otherPrefFemaleMeanML = ((double) femaleOtherPreferredML / maleLedTotal) * 100;
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
            prefMaleMeanFL = ((double) malePreferredFL / femaleLedTotal) * 100;
            otherPrefMaleMeanFL = ((double) maleOtherPreferredFL / femaleLedTotal) * 100;
            prefFemaleMeanFL = ((double) femalePreferredFL / femaleLedTotal) * 100;
            otherPrefFemaleMeanFL = ((double) femaleOtherPreferredFL / femaleLedTotal) * 100;
        }
    }

    private void getMaleParticpant(){
        if (malePartipantTotal > 0) {
            venueSizeMP = (double) venueSizeTotalMP / malePartipantTotal;
            festivalPercentMP = (double) festivalTotalMP / malePartipantTotal;
            ratingMP = (double) ratingTotalMP / malePartipantTotal;
            otherRatingMP = (double) otherRatingTotalMP / malePartipantTotal;
            payMP = (double) payTotalMP / malePartipantTotal;
            otherPayMP = (double) otherPayTotalMP / malePartipantTotal;
            prefMaleMeanMP = ((double) malePreferredMP / malePartipantTotal) * 100;
            otherPrefMaleMeanMP = ((double) maleOtherPreferredMP / malePartipantTotal) * 100;
            prefFemaleMeanMP = ((double) femalePreferredMP / malePartipantTotal) * 100;
            otherPrefFemaleMeanMP  = ((double) femaleOtherPreferredMP / malePartipantTotal) * 100;
        }
    }

    private void getFemaleParticpant(){
        if (femaleParticipantTotal > 0) {
            venueSizeFP = (double) venueSizeTotalFP / femaleParticipantTotal;
            festivalPercentFP = (double) festivalTotalFP / femaleParticipantTotal;
            ratingFP = (double) ratingTotalFP / femaleParticipantTotal;
            otherRatingFP = (double) otherRatingTotalFP / femaleParticipantTotal;
            payFP = (double) payTotalFP / femaleParticipantTotal;
            otherPayFP = (double) otherPayTotalFP / femaleParticipantTotal;
            prefMaleMeanFP = ((double) malePreferredFP / femaleParticipantTotal) * 100;
            otherPrefMaleMeanFP  = ((double) maleOtherPreferredFL / femaleParticipantTotal) * 100;
            prefFemaleMeanFP = ((double) femalePreferredFP / femaleParticipantTotal) * 100;
            otherPrefFemaleMeanFP = ((double) femaleOtherPreferredFP / femaleParticipantTotal) * 100;
        }
    }

    private void getNBParticipant(){
        if (nBParticipantTotal > 0) {
            venueSizeNBP = (double) venueSizeTotalNBP / nBParticipantTotal;
            festivalPercentNBP = (double) festivalTotalNBP / nBParticipantTotal;
            ratingNBP = (double) ratingTotalNBP / nBParticipantTotal;
            otherRatingNBP = (double) otherRatingTotalNBP / nBParticipantTotal;
            payNBP = (double) payTotalNBP / nBParticipantTotal;
            otherPayNBP = (double) otherPayTotalNBP / nBParticipantTotal;
            prefMaleMeanNBP = ((double) malePreferredNBP / nBParticipantTotal) * 100;
            otherPrefMaleMeanNBP = ((double) maleOtherPreferredNBP / nBParticipantTotal) * 100;
            prefFemaleMeanNBP = ((double) femalePreferredNBP / nBParticipantTotal) * 100;
            otherPrefFemaleMeanNBP = ((double) femaleOtherPreferredNBP / nBParticipantTotal) * 100;
        }
    }

    private void getUndeclaredParticipant(){
        if (uParticipantTotal > 0) {
            venueSizeUP = (double) venueSizeTotalUP / uParticipantTotal;
            festivalPercentUP = (double) festivalTotalUP / uParticipantTotal;
            ratingUP = (double) ratingTotalUP / uParticipantTotal;
            otherRatingUP = (double) otherRatingTotalUP / uParticipantTotal;
            payUP = (double) payTotalUP / uParticipantTotal;
            otherPayUP = (double) otherPayTotalUP / uParticipantTotal;
            prefMaleMeanUP = ((double) malePreferredUP / uParticipantTotal) * 100;
            otherPrefMaleMeanUP = ((double) maleOtherPreferredUP / uParticipantTotal) * 100;
            prefFemaleMeanUP = ((double) femalePreferredUP / uParticipantTotal) * 100;
            otherPrefFemaleMeanUP = ((double) femaleOtherPreferredUP / uParticipantTotal) * 100;
        }
    }

    private void getMeanTotals(){
        int totalLed = maleLedTotal + femaleLedTotal;
        participantsTotal = totalLed;

        if (totalLed > 0) {
            venueSize = ((venueSizeML * maleLedTotal) + (venueSizeFL * femaleLedTotal)) / totalLed;
            festivalPercent = ((festivalPercentML * maleLedTotal) + (festivalPercentFL * femaleLedTotal)) / totalLed;
            rating = ((ratingML * maleLedTotal) + (ratingFL * femaleLedTotal)) / totalLed;
            otherRating = ((otherRatingML * maleLedTotal) + (otherRatingFL * femaleLedTotal)) / totalLed;
            pay = ((payML * maleLedTotal) + (payFL * femaleLedTotal)) / totalLed;
            otherPay = ((otherPayML * maleLedTotal) + (otherPayFL * femaleLedTotal)) / totalLed;
            prefMaleMean = (malePreferred / totalLed) * 100;
            prefFemaleMean = (femalePreferred / totalLed) * 100;
            otherPrefMaleMean = (maleOtherPreferred / totalLed) * 100;
            otherPrefFemaleMean = (femaleOtherPreferred / totalLed) * 100;
        }
    }

    public double getRating(){
        return rating;
    }

    public String getTrackName(){
        return trackName;
    }
}
