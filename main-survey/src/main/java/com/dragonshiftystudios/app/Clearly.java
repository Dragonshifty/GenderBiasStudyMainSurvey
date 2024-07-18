package com.dragonshiftystudios.app;

public class Clearly extends TrackStats {
    @Override
    protected void getStats(){
        for (Participant participant : participants){
            int groupCode = Integer.parseInt(participant.getGroup());
            
            if (groupCode == 1){
                maleLedTotal++;
                venueSizeTotalML += Integer.parseInt(participant.getmC0());
                festivalTotalML += Integer.parseInt(participant.getmC1());
                ratingTotalML += Integer.parseInt(participant.getmC2());
                otherPayTotalML += Integer.parseInt(participant.getmC3());
                payTotalML += Integer.parseInt(participant.getmC4());
                otherPayTotalML += Integer.parseInt(participant.getmC5());
            } else if (groupCode == 2){
                femaleLedTotal++;
                venueSizeTotalFL += Integer.parseInt(participant.getfC0());
                festivalTotalML += Integer.parseInt(participant.getfC1());
                ratingTotalFL += Integer.parseInt(participant.getfC2());
                otherRatingTotalFL += Integer.parseInt(participant.getfC3());
                payTotalFL += Integer.parseInt(participant.getfC4());
                otherPayTotalFL += Integer.parseInt(participant.getfC5());
            } else {
                System.out.println("Not in group: " + participant.getResponseId());
            }
        }
    }
}
