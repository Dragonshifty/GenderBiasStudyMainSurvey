package com.dragonshiftystudios.app;

public class FlyOn extends TrackStats {
    @Override
    protected void getStats(){
        trackName = "Fly On";

        for (Participant participant : participants){
            int groupCode = Integer.parseInt(participant.getGroup());
            
            if (groupCode == 1){
                maleLedTotal++;
                venueSizeTotalML += Integer.parseInt(participant.getmFO0());
                festivalTotalML += Integer.parseInt(participant.getmFO1());
                ratingTotalML += Integer.parseInt(participant.getmFO2());
                otherRatingTotalML += Integer.parseInt(participant.getmFO3());
                payTotalML += Integer.parseInt(participant.getmFO4());
                otherPayTotalML += Integer.parseInt(participant.getmFO5());

                malePreferred += (participant.getmPFO0().equals("1")) ? 1 : 0;
                femalePreferred += (participant.getmPFO0().equals("0")) ? 1 : 0;
                maleOtherPreferred += (participant.getmPFO1().equals("1")) ? 1 :0;
                femaleOtherPreferred += (participant.getmPFO1().equals("0")) ? 1 :0;
            } else if (groupCode == 2){
                femaleLedTotal++;
                venueSizeTotalFL += Integer.parseInt(participant.getfFO0());
                festivalTotalFL += Integer.parseInt(participant.getfFO1());
                ratingTotalFL += Integer.parseInt(participant.getfFO2());
                otherRatingTotalFL += Integer.parseInt(participant.getfFO3());
                payTotalFL += Integer.parseInt(participant.getfFO4());
                otherPayTotalFL += Integer.parseInt(participant.getfFO5());

                malePreferred += (participant.getfPFO0().equals("1")) ? 1 : 0;
                femalePreferred += (participant.getfPFO0().equals("0")) ? 1 : 0;
                maleOtherPreferred += (participant.getfPFO1().equals("1")) ? 1 :0;
                femaleOtherPreferred += (participant.getfPFO1().equals("0")) ? 1 :0;
            } else {
                System.out.println("Not in group: " + participant.getResponseId());
            }
        }
    }
}
