package com.dragonshiftystudios.app;

public class MyOwnExpectations extends TrackStats {
    @Override
    protected void getStats(){
        for (Participant participant : participants){
            int groupCode = Integer.parseInt(participant.getGroup());
            
            if (groupCode == 1){
                maleLedTotal++;
                venueSizeTotalML += Integer.parseInt(participant.getmMOE0());
                festivalTotalML += Integer.parseInt(participant.getmMOE1());
                ratingTotalML += Integer.parseInt(participant.getmMOE2());
                otherPayTotalML += Integer.parseInt(participant.getmMOE3());
                payTotalML += Integer.parseInt(participant.getmMOE4());
                otherPayTotalML += Integer.parseInt(participant.getmMOE5());
            } else if (groupCode == 2){
                femaleLedTotal++;
                venueSizeTotalFL += Integer.parseInt(participant.getfMOE0());
                festivalTotalML += Integer.parseInt(participant.getfMOE1());
                ratingTotalFL += Integer.parseInt(participant.getfMOE2());
                otherRatingTotalFL += Integer.parseInt(participant.getfMOE3());
                payTotalFL += Integer.parseInt(participant.getfMOE4());
                otherPayTotalFL += Integer.parseInt(participant.getfMOE5());
            } else {
                System.out.println("Not in group: " + participant.getResponseId());
            }
        }
    }    
}
