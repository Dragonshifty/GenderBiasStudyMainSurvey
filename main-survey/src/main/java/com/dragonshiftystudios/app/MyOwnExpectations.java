package com.dragonshiftystudios.app;

public class MyOwnExpectations extends TrackStats {
    @Override
    protected void getStats(){
        trackName = "My Own Expectations";
        
        for (Participant participant : participants){
            int groupCode = Integer.parseInt(participant.getGroup());
            int genderCode = Integer.parseInt(participant.getGender());
            
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

                malePreferredML += (participant.getmPMOE0().equals("1")) ? 1 : 0;
                femalePreferredML += (participant.getmPMOE0().equals("0")) ? 1 : 0;
                maleOtherPreferredML += (participant.getmPMOE1().equals("1")) ? 1 :0;
                femaleOtherPreferredML += (participant.getmPMOE1().equals("0")) ? 1 :0;

                if (genderCode == 0){
                    femaleParticipantTotal++;
                    venueSizeTotalFP += Integer.parseInt(participant.getmMOE0());
                    festivalTotalFP += Integer.parseInt(participant.getmMOE1());
                    ratingTotalFP += Integer.parseInt(participant.getmMOE2());
                    otherRatingTotalFP += Integer.parseInt(participant.getmMOE3());
                    payTotalFP += Integer.parseInt(participant.getmMOE4());
                    otherPayTotalFP += Integer.parseInt(participant.getmMOE5());

                    malePreferredFP += (participant.getmPMOE0().equals("1")) ? 1 : 0;
                    femalePreferredFP += (participant.getmPMOE0().equals("0")) ? 1 : 0;
                    maleOtherPreferredFP += (participant.getmPMOE1().equals("1")) ? 1 :0;
                    femaleOtherPreferredFP += (participant.getmPMOE1().equals("0")) ? 1 :0;
                } else if (genderCode == 1){
                    malePartipantTotal++;
                    venueSizeTotalMP += Integer.parseInt(participant.getmMOE0());
                    festivalTotalMP += Integer.parseInt(participant.getmMOE1());
                    ratingTotalMP += Integer.parseInt(participant.getmMOE2());
                    otherRatingTotalMP += Integer.parseInt(participant.getmMOE3());
                    payTotalMP += Integer.parseInt(participant.getmMOE4());
                    otherPayTotalMP += Integer.parseInt(participant.getmMOE5());

                    malePreferredMP += (participant.getmPMOE0().equals("1")) ? 1 : 0;
                    femalePreferredMP += (participant.getmPMOE0().equals("0")) ? 1 : 0;
                    maleOtherPreferredMP += (participant.getmPMOE1().equals("1")) ? 1 :0;
                    femaleOtherPreferredMP += (participant.getmPMOE1().equals("0")) ? 1 :0;
                } else if (genderCode == 2){
                    nBParticipantTotal++;
                    venueSizeTotalNBP += Integer.parseInt(participant.getmMOE0());
                    festivalTotalNBP += Integer.parseInt(participant.getmMOE1());
                    ratingTotalNBP += Integer.parseInt(participant.getmMOE2());
                    otherRatingTotalNBP += Integer.parseInt(participant.getmMOE3());
                    payTotalNBP += Integer.parseInt(participant.getmMOE4());
                    otherPayTotalNBP += Integer.parseInt(participant.getmMOE5());

                    malePreferredNBP += (participant.getmPMOE0().equals("1")) ? 1 : 0;
                    femalePreferredNBP += (participant.getmPMOE0().equals("0")) ? 1 : 0;
                    maleOtherPreferredNBP += (participant.getmPMOE1().equals("1")) ? 1 :0;
                    femaleOtherPreferredNBP += (participant.getmPMOE1().equals("0")) ? 1 :0;
                } else if (genderCode == 3){
                    uParticipantTotal++;
                    venueSizeTotalUP += Integer.parseInt(participant.getmMOE0());
                    festivalTotalUP += Integer.parseInt(participant.getmMOE1());
                    ratingTotalUP += Integer.parseInt(participant.getmMOE2());
                    otherRatingTotalUP += Integer.parseInt(participant.getmMOE3());
                    payTotalUP += Integer.parseInt(participant.getmMOE4());
                    otherPayTotalUP += Integer.parseInt(participant.getmMOE5());

                    malePreferredUP += (participant.getmPMOE0().equals("1")) ? 1 : 0;
                    femalePreferredUP += (participant.getmPMOE0().equals("0")) ? 1 : 0;
                    maleOtherPreferredUP += (participant.getmPMOE1().equals("1")) ? 1 :0;
                    femaleOtherPreferredUP += (participant.getmPMOE1().equals("0")) ? 1 :0;
                }
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
                maleOtherPreferred += (participant.getfPMOE1().equals("1")) ? 1 : 0;
                femaleOtherPreferred += (participant.getfPMOE1().equals("0")) ? 1 : 0;

                malePreferredFL += (participant.getfPMOE0().equals("1")) ? 1 : 0;
                femalePreferredFL += (participant.getfPMOE0().equals("0")) ? 1 : 0;
                maleOtherPreferredFL += (participant.getfPMOE1().equals("1")) ? 1 :0;
                femaleOtherPreferredFL += (participant.getfPMOE1().equals("0")) ? 1 :0;

                if (genderCode == 0){
                    femaleParticipantTotal++;
                    venueSizeTotalFP += Integer.parseInt(participant.getfMOE0());
                    festivalTotalFP += Integer.parseInt(participant.getfMOE1());
                    ratingTotalFP += Integer.parseInt(participant.getfMOE2());
                    otherRatingTotalFP += Integer.parseInt(participant.getfMOE3());
                    payTotalFP += Integer.parseInt(participant.getfMOE4());
                    otherPayTotalFP += Integer.parseInt(participant.getfMOE5());

                    malePreferredFP += (participant.getfPMOE0().equals("1")) ? 1 : 0;
                    femalePreferredFP += (participant.getfPMOE0().equals("0")) ? 1 : 0;
                    maleOtherPreferredFP += (participant.getfPMOE1().equals("1")) ? 1 :0;
                    femaleOtherPreferredFP += (participant.getfPMOE1().equals("0")) ? 1 :0;
                } else if (genderCode == 1){
                    malePartipantTotal++;
                    venueSizeTotalMP += Integer.parseInt(participant.getfMOE0());
                    festivalTotalMP += Integer.parseInt(participant.getfMOE1());
                    ratingTotalMP += Integer.parseInt(participant.getfMOE2());
                    otherRatingTotalMP += Integer.parseInt(participant.getfMOE3());
                    payTotalMP += Integer.parseInt(participant.getfMOE4());
                    otherPayTotalMP += Integer.parseInt(participant.getfMOE5());

                    malePreferredMP += (participant.getfPMOE0().equals("1")) ? 1 : 0;
                    femalePreferredMP += (participant.getfPMOE0().equals("0")) ? 1 : 0;
                    maleOtherPreferredMP += (participant.getfPMOE1().equals("1")) ? 1 :0;
                    femaleOtherPreferredMP += (participant.getfPMOE1().equals("0")) ? 1 :0;
                } else if (genderCode == 2){
                    nBParticipantTotal++;
                    venueSizeTotalNBP += Integer.parseInt(participant.getfMOE0());
                    festivalTotalNBP += Integer.parseInt(participant.getfMOE1());
                    ratingTotalNBP += Integer.parseInt(participant.getfMOE2());
                    otherRatingTotalNBP += Integer.parseInt(participant.getfMOE3());
                    payTotalNBP += Integer.parseInt(participant.getfMOE4());
                    otherPayTotalNBP += Integer.parseInt(participant.getfMOE5());

                    malePreferredNBP += (participant.getfPMOE0().equals("1")) ? 1 : 0;
                    femalePreferredNBP += (participant.getfPMOE0().equals("0")) ? 1 : 0;
                    maleOtherPreferredNBP += (participant.getfPMOE1().equals("1")) ? 1 :0;
                    femaleOtherPreferredNBP += (participant.getfPMOE1().equals("0")) ? 1 :0;
                } else if (genderCode == 3){
                    uParticipantTotal++;
                    venueSizeTotalUP += Integer.parseInt(participant.getfMOE0());
                    festivalTotalUP += Integer.parseInt(participant.getfMOE1());
                    ratingTotalUP += Integer.parseInt(participant.getfMOE2());
                    otherRatingTotalUP += Integer.parseInt(participant.getfMOE3());
                    payTotalUP += Integer.parseInt(participant.getfMOE4());
                    otherPayTotalUP += Integer.parseInt(participant.getfMOE5());

                    malePreferredUP += (participant.getfPMOE0().equals("1")) ? 1 : 0;
                    femalePreferredUP += (participant.getfPMOE0().equals("0")) ? 1 : 0;
                    maleOtherPreferredUP += (participant.getfPMOE1().equals("1")) ? 1 :0;
                    femaleOtherPreferredUP += (participant.getfPMOE1().equals("0")) ? 1 :0;
                }
            } else {
                System.out.println("Not in group: " + participant.getResponseId());
            }
        }
    }   
}
