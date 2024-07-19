package com.dragonshiftystudios.app;
import java.util.LinkedList;;

public class CompetitionWinner {
    public void getCompetitionWinner(LinkedList<Participant> participants, LinkedList<TrackStats> tracks){
        double participantTotalWinner = 0;
        String participantID = "";

        double currentDifference = Double.MAX_VALUE;
        
        double ratingTotal = 0;
        double payTotal = 0;
        
        for (TrackStats track : tracks){
            ratingTotal += track.rating;
            payTotal += track.pay;
        }

        double ratingPayTotal = ratingTotal + payTotal;

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

            int malePrefScore = 0;
            int femalePrefScore = 0;

            if (participant.getGroup().equals("1")){
                clearly += (Integer.valueOf(participant.getmC2())) + (Integer.valueOf(participant.getmC4()));
                mOE += (Integer.valueOf(participant.getmMOE2())) + (Integer.valueOf(participant.getmMOE4()));
                fine += (Integer.valueOf(participant.getmF2())) + (Integer.valueOf(participant.getmF4()));
                flyOn += (Integer.valueOf(participant.getmFO2())) + (Integer.valueOf(participant.getmFO4()));
                myOne += (Integer.valueOf(participant.getmM2())) + (Integer.valueOf(participant.getmM4()));
                dW += (Integer.valueOf(participant.getmDW2())) + (Integer.valueOf(participant.getmDW4()));
                rising += (Integer.valueOf(participant.getmR2())) + (Integer.valueOf(participant.getmR4()));
                triggered += (Integer.valueOf(participant.getmT2())) + (Integer.valueOf(participant.getmT4()));
            } else if (participant.getGroup().equals("2")){
                clearly += (Integer.valueOf(participant.getfC2())) + (Integer.valueOf(participant.getfC4()));
                mOE += (Integer.valueOf(participant.getfMOE2())) + (Integer.valueOf(participant.getfMOE4()));
                fine += (Integer.valueOf(participant.getfF2())) + (Integer.valueOf(participant.getfF4()));
                flyOn += (Integer.valueOf(participant.getfFO2())) + (Integer.valueOf(participant.getfFO4()));
                myOne += (Integer.valueOf(participant.getfM2())) + (Integer.valueOf(participant.getfM4()));
                dW += (Integer.valueOf(participant.getfDW2())) + (Integer.valueOf(participant.getfDW4()));
                rising += (Integer.valueOf(participant.getfR2())) + (Integer.valueOf(participant.getfR4()));
                triggered += (Integer.valueOf(participant.getfT2())) + (Integer.valueOf(participant.getfT4()));
            } else {
                System.out.println("Group error");
            }

            holdingTotal = clearly + mOE + fine + flyOn + myOne + dW + rising + triggered;

            double difference = holdingTotal > ratingPayTotal ? holdingTotal - ratingPayTotal : ratingPayTotal - holdingTotal;

            if (difference <= currentDifference){
                currentDifference = difference;
                participantID = participant.getResponseId();
                participantTotalWinner = holdingTotal;
            }
        }
        System.out.println("Participants rating and pay total: " + ratingPayTotal);
        System.out.println("Winner total: " + participantTotalWinner);
        System.out.println("Winer ID: " + participantID);
    }
}
