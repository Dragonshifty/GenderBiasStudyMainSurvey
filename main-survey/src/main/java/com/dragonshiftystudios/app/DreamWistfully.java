package com.dragonshiftystudios.app;

public class DreamWistfully extends TrackStats {
    @Override
    protected void getStats(){
        for (Participant participant : participants){
            int groupCode = Integer.parseInt(participant.getGroup());
            
            if (groupCode == 1){
                maleLedTotal++;
                venueSizeTotalML += Integer.parseInt(participant.getmDW0());
                festivalTotalML += Integer.parseInt(participant.getmDW1());
                ratingTotalML += Integer.parseInt(participant.getmDW2());
                otherPayTotalML += Integer.parseInt(participant.getmDW3());
                payTotalML += Integer.parseInt(participant.getmDW4());
                otherPayTotalML += Integer.parseInt(participant.getmDW5());
            } else if (groupCode == 2){
                femaleLedTotal++;
                venueSizeTotalFL += Integer.parseInt(participant.getfT0());
                festivalTotalML += Integer.parseInt(participant.getfT1());
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
