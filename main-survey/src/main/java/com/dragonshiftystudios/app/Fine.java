package com.dragonshiftystudios.app;

public class Fine extends TrackStats {
    @Override
    protected void getStats(){
        for (Participant participant : participants){
            int groupCode = Integer.parseInt(participant.getGroup());
            int genderCode = Integer.parseInt(participant.getGender());
            
            if (groupCode == 1){
                maleLedTotal++;
                venueSizeTotalML += Integer.parseInt(participant.getmF0());
                festivalTotalML += Integer.parseInt(participant.getmF1());
                ratingTotalML += Integer.parseInt(participant.getmF2());
                otherRatingTotalML += Integer.parseInt(participant.getmF3());
                payTotalML += Integer.parseInt(participant.getmF4());
                otherPayTotalML += Integer.parseInt(participant.getmF5());

                if (genderCode == 1){
                    
                }
            } else if (groupCode == 2){
                femaleLedTotal++;
                venueSizeTotalFL += Integer.parseInt(participant.getfF0());
                festivalTotalFL += Integer.parseInt(participant.getfF1());
                ratingTotalFL += Integer.parseInt(participant.getfF2());
                otherRatingTotalFL += Integer.parseInt(participant.getfF3());
                payTotalFL += Integer.parseInt(participant.getfF4());
                otherPayTotalFL += Integer.parseInt(participant.getfF5().trim());
            } else {
                System.out.println("Not in group: " + participant.getResponseId());
            }
        }
    }
}
