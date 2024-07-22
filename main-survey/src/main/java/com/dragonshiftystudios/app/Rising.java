package com.dragonshiftystudios.app;

public class Rising extends TrackStats{
    @Override
    protected void getStats(){
        trackName = "Rising";
        
        for (Participant participant : participants){
            int groupCode = Integer.parseInt(participant.getGroup());
            
            if (groupCode == 1){
                maleLedTotal++;
                venueSizeTotalML += Integer.parseInt(participant.getmR0());
                festivalTotalML += Integer.parseInt(participant.getmR1());
                ratingTotalML += Integer.parseInt(participant.getmR2());
                otherRatingTotalML += Integer.parseInt(participant.getmR3());
                payTotalML += Integer.parseInt(participant.getmR4());
                otherPayTotalML += Integer.parseInt(participant.getmR5());
            } else if (groupCode == 2){
                femaleLedTotal++;
                venueSizeTotalFL += Integer.parseInt(participant.getfR0());
                festivalTotalFL += Integer.parseInt(participant.getfR1());
                ratingTotalFL += Integer.parseInt(participant.getfR2());
                otherRatingTotalFL += Integer.parseInt(participant.getfR3());
                payTotalFL += Integer.parseInt(participant.getfR4());
                otherPayTotalFL += Integer.parseInt(participant.getfR5());
            } else {
                System.out.println("Not in group: " + participant.getResponseId());
            }
        }
    }
}
