package com.dragonshiftystudios.app;

public class FlyOn extends TrackStats {
    @Override
    protected void getStats(){
        trackName = "Fly On";

        for (Participant participant : participants){
            int groupCode = Integer.parseInt(participant.getGroup());
            int genderCode = Integer.parseInt(participant.getGender());
            
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

                malePreferredML += (participant.getmPFO0().equals("1")) ? 1 : 0;
                femalePreferredML += (participant.getmPFO0().equals("0")) ? 1 : 0;
                maleOtherPreferredML += (participant.getmPFO1().equals("1")) ? 1 :0;
                femaleOtherPreferredML += (participant.getmPFO1().equals("0")) ? 1 :0;

                if (genderCode == 0){
                    femaleParticipantTotal++;
                    venueSizeTotalFP += Integer.parseInt(participant.getmFO0());
                    festivalTotalFP += Integer.parseInt(participant.getmFO1());
                    ratingTotalFP += Integer.parseInt(participant.getmFO2());
                    otherRatingTotalFP += Integer.parseInt(participant.getmFO3());
                    payTotalFP += Integer.parseInt(participant.getmFO4());
                    otherPayTotalFP += Integer.parseInt(participant.getmFO5());

                    malePreferredFP += (participant.getmPFO0().equals("1")) ? 1 : 0;
                    femalePreferredFP += (participant.getmPFO0().equals("0")) ? 1 : 0;
                    maleOtherPreferredFP += (participant.getmPFO1().equals("1")) ? 1 :0;
                    femaleOtherPreferredFP += (participant.getmPFO1().equals("0")) ? 1 :0;
                } else if (genderCode == 1){
                    malePartipantTotal++;
                    venueSizeTotalMP += Integer.parseInt(participant.getmFO0());
                    festivalTotalMP += Integer.parseInt(participant.getmFO1());
                    ratingTotalMP += Integer.parseInt(participant.getmFO2());
                    otherRatingTotalMP += Integer.parseInt(participant.getmFO3());
                    payTotalMP += Integer.parseInt(participant.getmFO4());
                    otherPayTotalMP += Integer.parseInt(participant.getmFO5());

                    malePreferredMP += (participant.getmPFO0().equals("1")) ? 1 : 0;
                    femalePreferredMP += (participant.getmPFO0().equals("0")) ? 1 : 0;
                    maleOtherPreferredMP += (participant.getmPFO1().equals("1")) ? 1 :0;
                    femaleOtherPreferredMP += (participant.getmPFO1().equals("0")) ? 1 :0;
                } else if (genderCode == 2){
                    nBParticipantTotal++;
                    venueSizeTotalNBP += Integer.parseInt(participant.getmFO0());
                    festivalTotalNBP += Integer.parseInt(participant.getmFO1());
                    ratingTotalNBP += Integer.parseInt(participant.getmFO2());
                    otherRatingTotalNBP += Integer.parseInt(participant.getmFO3());
                    payTotalNBP += Integer.parseInt(participant.getmFO4());
                    otherPayTotalNBP += Integer.parseInt(participant.getmFO5());

                    malePreferredNBP += (participant.getmPFO0().equals("1")) ? 1 : 0;
                    femalePreferredNBP += (participant.getmPFO0().equals("0")) ? 1 : 0;
                    maleOtherPreferredNBP += (participant.getmPFO1().equals("1")) ? 1 :0;
                    femaleOtherPreferredNBP += (participant.getmPFO1().equals("0")) ? 1 :0;
                } else if (genderCode == 3){
                    uParticipantTotal++;
                    venueSizeTotalUP += Integer.parseInt(participant.getmFO0());
                    festivalTotalUP += Integer.parseInt(participant.getmFO1());
                    ratingTotalUP += Integer.parseInt(participant.getmFO2());
                    otherRatingTotalUP += Integer.parseInt(participant.getmFO3());
                    payTotalUP += Integer.parseInt(participant.getmFO4());
                    otherPayTotalUP += Integer.parseInt(participant.getmFO5());

                    malePreferredUP += (participant.getmPFO0().equals("1")) ? 1 : 0;
                    femalePreferredUP += (participant.getmPFO0().equals("0")) ? 1 : 0;
                    maleOtherPreferredUP += (participant.getmPFO1().equals("1")) ? 1 :0;
                    femaleOtherPreferredUP += (participant.getmPFO1().equals("0")) ? 1 :0;
                }
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

                malePreferredFL += (participant.getfPFO0().equals("1")) ? 1 : 0;
                femalePreferredFL += (participant.getfPFO0().equals("0")) ? 1 : 0;
                maleOtherPreferredFL += (participant.getfPFO1().equals("1")) ? 1 :0;
                femaleOtherPreferredFL += (participant.getfPFO1().equals("0")) ? 1 :0;

                if (genderCode == 0){
                    femaleParticipantTotal++;
                    venueSizeTotalFP += Integer.parseInt(participant.getfFO0());
                    festivalTotalFP += Integer.parseInt(participant.getfFO1());
                    ratingTotalFP += Integer.parseInt(participant.getfFO2());
                    otherRatingTotalFP += Integer.parseInt(participant.getfFO3());
                    payTotalFP += Integer.parseInt(participant.getfFO4());
                    otherPayTotalFP += Integer.parseInt(participant.getfFO5());

                    malePreferredFP += (participant.getfPFO0().equals("1")) ? 1 : 0;
                    femalePreferredFP += (participant.getfPFO0().equals("0")) ? 1 : 0;
                    maleOtherPreferredFP += (participant.getfPFO1().equals("1")) ? 1 :0;
                    femaleOtherPreferredFP += (participant.getfPFO1().equals("0")) ? 1 :0;
                } else if (genderCode == 1){
                    malePartipantTotal++;
                    venueSizeTotalMP += Integer.parseInt(participant.getfFO0());
                    festivalTotalMP += Integer.parseInt(participant.getfFO1());
                    ratingTotalMP += Integer.parseInt(participant.getfFO2());
                    otherRatingTotalMP += Integer.parseInt(participant.getfFO3());
                    payTotalMP += Integer.parseInt(participant.getfFO4());
                    otherPayTotalMP += Integer.parseInt(participant.getfFO5());

                    malePreferredMP += (participant.getfPFO0().equals("1")) ? 1 : 0;
                    femalePreferredMP += (participant.getfPFO0().equals("0")) ? 1 : 0;
                    maleOtherPreferredMP += (participant.getfPFO1().equals("1")) ? 1 :0;
                    femaleOtherPreferredMP += (participant.getfPFO1().equals("0")) ? 1 :0;
                } else if (genderCode == 2){
                    nBParticipantTotal++;
                    venueSizeTotalNBP += Integer.parseInt(participant.getfFO0());
                    festivalTotalNBP += Integer.parseInt(participant.getfFO1());
                    ratingTotalNBP += Integer.parseInt(participant.getfFO2());
                    otherRatingTotalNBP += Integer.parseInt(participant.getfFO3());
                    payTotalNBP += Integer.parseInt(participant.getfFO4());
                    otherPayTotalNBP += Integer.parseInt(participant.getfFO5());

                    malePreferredNBP += (participant.getfPFO0().equals("1")) ? 1 : 0;
                    femalePreferredNBP += (participant.getfPFO0().equals("0")) ? 1 : 0;
                    maleOtherPreferredNBP += (participant.getfPFO1().equals("1")) ? 1 :0;
                    femaleOtherPreferredNBP += (participant.getfPFO1().equals("0")) ? 1 :0;
                } else if (genderCode == 3){
                    uParticipantTotal++;
                    venueSizeTotalUP += Integer.parseInt(participant.getfFO0());
                    festivalTotalUP += Integer.parseInt(participant.getfFO1());
                    ratingTotalUP += Integer.parseInt(participant.getfFO2());
                    otherRatingTotalUP += Integer.parseInt(participant.getfFO3());
                    payTotalUP += Integer.parseInt(participant.getfFO4());
                    otherPayTotalUP += Integer.parseInt(participant.getfFO5());

                    malePreferredUP += (participant.getfPFO0().equals("1")) ? 1 : 0;
                    femalePreferredUP += (participant.getfPFO0().equals("0")) ? 1 : 0;
                    maleOtherPreferredUP += (participant.getfPFO1().equals("1")) ? 1 :0;
                    femaleOtherPreferredUP += (participant.getfPFO1().equals("0")) ? 1 :0;
                }
            } else {
                System.out.println("Not in group: " + participant.getResponseId());
            }
        }
    }
}
