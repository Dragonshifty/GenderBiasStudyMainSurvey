package com.dragonshiftystudios.app;

public class Triggered extends TrackStats {
    protected void getStats(){
        for (Participant participant : participants){
            int groupCode = Integer.parseInt(participant.getGroup());
            
            if (groupCode == 1){
                maleLedTotal++;
                venueSizeTotalML += Integer.parseInt(participant.getmT0());
                festivalTotalML += Integer.parseInt(participant.getmT1());
                ratingTotalML += Integer.parseInt(participant.getmT2());
                otherRatingTotalML += Integer.parseInt(participant.getmT3());
                payTotalML += Integer.parseInt(participant.getmT4());
                otherPayTotalML += Integer.parseInt(participant.getmT5());
            } else if (groupCode == 2){
                femaleLedTotal++;
                venueSizeTotalFL += Integer.parseInt(participant.getfT0());
                festivalTotalFL += Integer.parseInt(participant.getfT1());
                ratingTotalFL += Integer.parseInt(participant.getfT2());
                otherRatingTotalFL += Integer.parseInt(participant.getfT3());
                payTotalFL += Integer.parseInt(participant.getfT4());
                otherPayTotalFL += Integer.parseInt(participant.getfT5());
            } else {
                System.out.println("Not in group: " + participant.getResponseId());
            }
        }
    }
}
