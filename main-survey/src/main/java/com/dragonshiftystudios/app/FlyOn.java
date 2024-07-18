package com.dragonshiftystudios.app;

public class FlyOn extends TrackStats {
    @Override
    protected void getStats(){
        for (Participant participant : participants){
            int groupCode = Integer.parseInt(participant.getGroup());
            
            if (groupCode == 1){
                maleLedTotal++;
                venueSizeTotalML += Integer.parseInt(participant.getmFO0());
                festivalTotalML += Integer.parseInt(participant.getmFO1());
                ratingTotalML += Integer.parseInt(participant.getmFO2());
                otherPayTotalML += Integer.parseInt(participant.getmFO3());
                payTotalML += Integer.parseInt(participant.getmFO4());
                otherPayTotalML += Integer.parseInt(participant.getmFO5());
            } else if (groupCode == 2){
                femaleLedTotal++;
                venueSizeTotalFL += Integer.parseInt(participant.getfFO0());
                festivalTotalML += Integer.parseInt(participant.getfFO1());
                ratingTotalFL += Integer.parseInt(participant.getfFO2());
                otherRatingTotalFL += Integer.parseInt(participant.getfFO3());
                payTotalFL += Integer.parseInt(participant.getfFO4());
                otherPayTotalFL += Integer.parseInt(participant.getfFO5());
            } else {
                System.out.println("Not in group: " + participant.getResponseId());
            }
        }
    }
}
