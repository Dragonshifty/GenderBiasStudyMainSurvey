package com.dragonshiftystudios.app;

public class MyOwnExpectations extends TrackStats {
    @Override
    protected void getStats(){
        trackName = "My Own Expectations";
        
        for (Participant participant : participants){
            int groupCode = Integer.parseInt(participant.getGroup());
            
            if (groupCode == 1){
                maleLedTotal++;
                venueSizeTotalML += Integer.parseInt(participant.getmMOE0());
                festivalTotalML += Integer.parseInt(participant.getmMOE1());
                ratingTotalML += Integer.parseInt(participant.getmMOE2());
                otherRatingTotalML += Integer.parseInt(participant.getmMOE3());
                payTotalML += Integer.parseInt(participant.getmMOE4());
                otherPayTotalML += Integer.parseInt(participant.getmMOE5());

                malePreferred += (participant.getmPMOE0().equals("1")) ? 1 : 0;
                femalePreferred += (participant.getmPMOE0().equals("0")) ? 1 : 0;
                maleOtherPreferred += (participant.getmPMOE1().equals("1")) ? 1 :0;
                femaleOtherPreferred += (participant.getmPMOE1().equals("0")) ? 1 :0;
            } else if (groupCode == 2){
                femaleLedTotal++;
                venueSizeTotalFL += Integer.parseInt(participant.getfMOE0());
                festivalTotalFL += Integer.parseInt(participant.getfMOE1());
                ratingTotalFL += Integer.parseInt(participant.getfMOE2());
                otherRatingTotalFL += Integer.parseInt(participant.getfMOE3());
                payTotalFL += Integer.parseInt(participant.getfMOE4());
                otherPayTotalFL += Integer.parseInt(participant.getfMOE5());

                malePreferred += (participant.getfPMOE0().equals("1")) ? 1 : 0;
                femalePreferred += (participant.getfPMOE0().equals("0")) ? 1 : 0;
                maleOtherPreferred += (participant.getfPMOE1().equals("1")) ? 1 :0;
                femaleOtherPreferred += (participant.getfPMOE1().equals("0")) ? 1 :0;
            } else {
                System.out.println("Not in group: " + participant.getResponseId());
            }
        }
    }   
}
