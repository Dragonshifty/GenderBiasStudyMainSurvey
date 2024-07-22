package com.dragonshiftystudios.app;
import java.util.LinkedList;

public class CompetitionWinner {
    public void getCompetitionWinner(LinkedList<Participant> participants, LinkedList<TrackStats> tracks){
        double participantTotalWinner = 0;
        String participantID = "";
        int trackWinnerScore = 0;

        double secondClosestTotal = 0;
        String secondClosestID = "";
        int secondClosestTrackScore = 0;

        double thirdClosestTotal = 0;
        String thirdClosestID = "";
        int thirdClosestTrackScore = 0;

        double fourthClosestTotal = 0;
        String fourthClosestID = "";
        int fourthClosestTrackScore = 0;

        double currentDifference = Double.MAX_VALUE;
        
        double ratingTotal = 0;
        double payTotal = 0;

        double clearlyMalePref = 0;
        double clearlyFemalePref = 0;
        double fineMalePref = 0;
        double fineFemalePref = 0;
        double flyOnMalePref = 0;
        double flyOnFemalePref = 0;
        double myOneMalePref = 0;
        double myOneFemalePref = 0;
        double mOEMalePref = 0;
        double mOEFemalePref = 0;
        
        for (TrackStats track : tracks){
            ratingTotal += track.rating;
            payTotal += track.pay;

            switch (track.getTrackName()){
                case "Clearly":
                    clearlyMalePref = track.malePreferred;
                    clearlyFemalePref = track.femalePreferred;
                    break;
                case "Fine":
                    fineMalePref = track.malePreferred;
                    fineFemalePref = track.femalePreferred;
                    break;
                case "Fly On":
                    flyOnMalePref = track.malePreferred;
                    flyOnFemalePref = track.femalePreferred;
                    break;
                case "My One":
                    myOneMalePref = track.malePreferred;
                    myOneFemalePref = track.femalePreferred;
                    break;
                case "My Own Expectations":
                    mOEMalePref = track.malePreferred;
                    mOEFemalePref = track.femalePreferred;
                    break;
            }
        }

        double ratingPayTotal = ratingTotal + payTotal;

        int clearlyPrefGender = clearlyMalePref > clearlyFemalePref ? 1 : 0;
        int finePrefGender = fineMalePref > fineFemalePref ? 1 : 0;
        int flyOnPrefGender = flyOnMalePref > flyOnFemalePref ? 1 : 0;
        int myOnePrefGender = myOneMalePref > myOneFemalePref ? 1 : 0;
        int mOEPrefGender = mOEMalePref > mOEFemalePref ? 1 : 0; 

        for (Participant participant : participants){
            double holdingTotal = 0;

            double clearly = 0;
            double mOE = 0;
            double fine = 0;
            double flyOn = 0;
            double myOne = 0;
            double dW = 0;
            double rising = 0;
            double triggered = 0;

            int trackPrefScore = 0;

            if (participant.getGroup().equals("1")){
                clearly += (Integer.valueOf(participant.getmC3())) + (Integer.valueOf(participant.getmC5()));
                mOE += (Integer.valueOf(participant.getmMOE3())) + (Integer.valueOf(participant.getmMOE5()));
                fine += (Integer.valueOf(participant.getmF3())) + (Integer.valueOf(participant.getmF5()));
                flyOn += (Integer.valueOf(participant.getmFO3())) + (Integer.valueOf(participant.getmFO5()));
                myOne += (Integer.valueOf(participant.getmM3())) + (Integer.valueOf(participant.getmM5()));
                dW += (Integer.valueOf(participant.getmDW3())) + (Integer.valueOf(participant.getmDW5()));
                rising += (Integer.valueOf(participant.getmR3())) + (Integer.valueOf(participant.getmR5()));
                triggered += (Integer.valueOf(participant.getmT3())) + (Integer.valueOf(participant.getmT5()));

                trackPrefScore += (Integer.valueOf(participant.getmPC1()) == clearlyPrefGender) ? 1 : 0;
                trackPrefScore += (Integer.valueOf(participant.getmPF1()) == finePrefGender) ? 1 : 0;
                trackPrefScore += (Integer.valueOf(participant.getmPFO1()) == flyOnPrefGender) ? 1 : 0;
                trackPrefScore += (Integer.valueOf(participant.getmPM1()) == myOnePrefGender) ? 1 : 0;
                trackPrefScore += (Integer.valueOf(participant.getmPMOE1()) == mOEPrefGender) ? 1 : 0;

            } else if (participant.getGroup().equals("2")){
                clearly += (Integer.valueOf(participant.getfC3())) + (Integer.valueOf(participant.getfC5()));
                mOE += (Integer.valueOf(participant.getfMOE3())) + (Integer.valueOf(participant.getfMOE5()));
                fine += (Integer.valueOf(participant.getfF3())) + (Integer.valueOf(participant.getfF5()));
                flyOn += (Integer.valueOf(participant.getfFO3())) + (Integer.valueOf(participant.getfFO5()));
                myOne += (Integer.valueOf(participant.getfM3())) + (Integer.valueOf(participant.getfM5()));
                dW += (Integer.valueOf(participant.getfDW3())) + (Integer.valueOf(participant.getfDW5()));
                rising += (Integer.valueOf(participant.getfR3())) + (Integer.valueOf(participant.getfR5()));
                triggered += (Integer.valueOf(participant.getfT3())) + (Integer.valueOf(participant.getfT5()));

                trackPrefScore += (Integer.valueOf(participant.getfPC1()) == clearlyPrefGender) ? 1 : 0;
                trackPrefScore += (Integer.valueOf(participant.getfPF1()) == finePrefGender) ? 1 : 0;
                trackPrefScore += (Integer.valueOf(participant.getfPFO1()) == flyOnPrefGender) ? 1 : 0;
                trackPrefScore += (Integer.valueOf(participant.getfPM1()) == myOnePrefGender) ? 1 : 0;
                trackPrefScore += (Integer.valueOf(participant.getfPMOE1()) == mOEPrefGender) ? 1 : 0;
            } else {
                System.out.println("Group error");
            }

            holdingTotal = clearly + mOE + fine + flyOn + myOne + dW + rising + triggered;

            double difference = holdingTotal > ratingPayTotal ? holdingTotal - ratingPayTotal : ratingPayTotal - holdingTotal;

            if (difference <= currentDifference){
                currentDifference = difference;

                fourthClosestID = thirdClosestID;
                fourthClosestTotal = thirdClosestTotal;
                fourthClosestTrackScore = thirdClosestTrackScore;

                thirdClosestID = secondClosestID;
                thirdClosestTotal = secondClosestTotal;
                thirdClosestTrackScore = secondClosestTrackScore;

                secondClosestID = participantID;
                secondClosestTotal = participantTotalWinner;
                secondClosestTrackScore = trackWinnerScore;

                participantID = participant.getResponseId();
                participantTotalWinner = holdingTotal;
                trackWinnerScore = trackPrefScore;
            }
        }
        System.out.println("Participants rating and pay total: " + ratingPayTotal);
        System.out.println("Closest total: " + participantTotalWinner);
        System.out.println("Closest ID: " + participantID);
        System.out.println("Tracks correctly guessed: " + trackWinnerScore + "/5");

        System.out.println("");

        System.out.println("Second closest total: " + secondClosestTotal);
        System.out.println("Second closest ID: " + secondClosestID);
        System.out.println("Tracks correctly guessed: " + secondClosestTrackScore + "/5");
        System.out.println("");
        System.out.println("Third closest total: " + thirdClosestTotal);
        System.out.println("Third closest ID: " + thirdClosestID);
        System.out.println("Tracks correctly guessed: " + thirdClosestTrackScore + "/5");
        System.out.println("");

        System.out.println("fourth closest total: " + fourthClosestTotal);
        System.out.println("fourth closest ID: " + fourthClosestID);
        System.out.println("Tracks correctly guessed: " + fourthClosestTrackScore + "/5");

        // System.out.println("Clearly - Male: " + clearlyMalePref + " Female: " + clearlyFemalePref);
        // System.out.println("Fine - Male: " + fineMalePref + " Female: " + fineFemalePref);
        // System.out.println("Fly On - Male: " + flyOnMalePref + " Female: " + flyOnFemalePref);
        // System.out.println("My One - Male: " + myOneMalePref + " Female: " + myOneFemalePref);
        // System.out.println("MOE - Male: " + mOEMalePref + " Female: " + mOEFemalePref);
    }
}
