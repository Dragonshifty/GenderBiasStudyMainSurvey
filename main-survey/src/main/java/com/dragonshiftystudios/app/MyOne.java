package com.dragonshiftystudios.app;

public class MyOne extends TrackStats {
    @Override
    protected void getStats(){
        for (Participant participant : participants){
            int groupCode = Integer.parseInt(participant.getGroup());
            
            if (groupCode == 1){
                maleLedTotal++;
                venueSizeTotalML += Integer.parseInt(participant.getmM0());
                festivalTotalML += Integer.parseInt(participant.getmM1());
                ratingTotalML += Integer.parseInt(participant.getmM2());
                otherRatingTotalML += Integer.parseInt(participant.getmM3());
                payTotalML += Integer.parseInt(participant.getmM4());
                otherPayTotalML += Integer.parseInt(participant.getmM5());
            } else if (groupCode == 2){
                femaleLedTotal++;
                venueSizeTotalFL += Integer.parseInt(participant.getfM0());
                festivalTotalFL += Integer.parseInt(participant.getfM1());
                ratingTotalFL += Integer.parseInt(participant.getfM2());
                otherRatingTotalFL += Integer.parseInt(participant.getfM3());
                payTotalFL += Integer.parseInt(participant.getfM4());
                otherPayTotalFL += Integer.parseInt(participant.getfM5());
            } else {
                System.out.println("Not in group: " + participant.getResponseId());
            }
        }
    }
}
