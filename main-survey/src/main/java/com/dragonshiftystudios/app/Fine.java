package com.dragonshiftystudios.app;

public class Fine extends TrackStats {
    @Override
    protected void getStats(){
        trackName = "Fine";
        
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

                malePreferred += (participant.getmPF0().equals("1")) ? 1 : 0;
                femalePreferred += (participant.getmPF0().equals("0")) ? 1 : 0;
                maleOtherPreferred += (participant.getmPF1().equals("1")) ? 1 :0;
                femaleOtherPreferred += (participant.getmPF1().equals("0")) ? 1 :0;

                malePreferredML += (participant.getmPF0().equals("1")) ? 1 : 0;
                femalePreferredML += (participant.getmPF0().equals("0")) ? 1 : 0;
                maleOtherPreferredML += (participant.getmPF1().equals("1")) ? 1 :0;
                femaleOtherPreferredML += (participant.getmPF1().equals("0")) ? 1 :0;

                if (genderCode == 0){
                    femaleParticipantTotal++;
                    venueSizeTotalFP += Integer.parseInt(participant.getmF0());
                    festivalTotalFP += Integer.parseInt(participant.getmF1());
                    ratingTotalFP += Integer.parseInt(participant.getmF2());
                    otherRatingTotalFP += Integer.parseInt(participant.getmF3());
                    payTotalFP += Integer.parseInt(participant.getmF4());
                    otherPayTotalFP += Integer.parseInt(participant.getmF5());

                    malePreferredFP += (participant.getmPF0().equals("1")) ? 1 : 0;
                    femalePreferredFP += (participant.getmPF0().equals("0")) ? 1 : 0;
                    maleOtherPreferredFP += (participant.getmPF1().equals("1")) ? 1 :0;
                    femaleOtherPreferredFP += (participant.getmPF1().equals("0")) ? 1 :0;
                } else if (genderCode == 1){
                    malePartipantTotal++;
                    venueSizeTotalMP += Integer.parseInt(participant.getmF0());
                    festivalTotalMP += Integer.parseInt(participant.getmF1());
                    ratingTotalMP += Integer.parseInt(participant.getmF2());
                    otherRatingTotalMP += Integer.parseInt(participant.getmF3());
                    payTotalMP += Integer.parseInt(participant.getmF4());
                    otherPayTotalMP += Integer.parseInt(participant.getmF5());

                    malePreferredMP += (participant.getmPF0().equals("1")) ? 1 : 0;
                    femalePreferredMP += (participant.getmPF0().equals("0")) ? 1 : 0;
                    maleOtherPreferredMP += (participant.getmPF1().equals("1")) ? 1 :0;
                    femaleOtherPreferredMP += (participant.getmPF1().equals("0")) ? 1 :0;
                } else if (genderCode == 2){
                    nBParticipantTotal++;
                    venueSizeTotalNBP += Integer.parseInt(participant.getmF0());
                    festivalTotalNBP += Integer.parseInt(participant.getmF1());
                    ratingTotalNBP += Integer.parseInt(participant.getmF2());
                    otherRatingTotalNBP += Integer.parseInt(participant.getmF3());
                    payTotalNBP += Integer.parseInt(participant.getmF4());
                    otherPayTotalNBP += Integer.parseInt(participant.getmF5());

                    malePreferredNBP += (participant.getmPF0().equals("1")) ? 1 : 0;
                    femalePreferredNBP += (participant.getmPF0().equals("0")) ? 1 : 0;
                    maleOtherPreferredNBP += (participant.getmPF1().equals("1")) ? 1 :0;
                    femaleOtherPreferredNBP += (participant.getmPF1().equals("0")) ? 1 :0;
                } else if (genderCode == 3){
                    uParticipantTotal++;
                    venueSizeTotalUP += Integer.parseInt(participant.getmF0());
                    festivalTotalUP += Integer.parseInt(participant.getmF1());
                    ratingTotalUP += Integer.parseInt(participant.getmF2());
                    otherRatingTotalUP += Integer.parseInt(participant.getmF3());
                    payTotalUP += Integer.parseInt(participant.getmF4());
                    otherPayTotalUP += Integer.parseInt(participant.getmF5());

                    malePreferredUP += (participant.getmPF0().equals("1")) ? 1 : 0;
                    femalePreferredUP += (participant.getmPF0().equals("0")) ? 1 : 0;
                    maleOtherPreferredUP += (participant.getmPF1().equals("1")) ? 1 :0;
                    femaleOtherPreferredUP += (participant.getmPF1().equals("0")) ? 1 :0;
                }
            } else if (groupCode == 2){
                femaleLedTotal++;
                venueSizeTotalFL += Integer.parseInt(participant.getfF0());
                festivalTotalFL += Integer.parseInt(participant.getfF1());
                ratingTotalFL += Integer.parseInt(participant.getfF2());
                otherRatingTotalFL += Integer.parseInt(participant.getfF3());
                payTotalFL += Integer.parseInt(participant.getfF4());
                otherPayTotalFL += Integer.parseInt(participant.getfF5());

                malePreferred += (participant.getfPF0().equals("1")) ? 1 : 0;
                femalePreferred += (participant.getfPF0().equals("0")) ? 1 : 0;
                maleOtherPreferred += (participant.getfPF1().equals("1")) ? 1 :0;
                femaleOtherPreferred += (participant.getfPF1().equals("0")) ? 1 :0;

                malePreferredFL += (participant.getfPF0().equals("1")) ? 1 : 0;
                femalePreferredFL += (participant.getfPF0().equals("0")) ? 1 : 0;
                maleOtherPreferredFL += (participant.getfPF1().equals("1")) ? 1 :0;
                femaleOtherPreferredFL += (participant.getfPF1().equals("0")) ? 1 :0;

                if (genderCode == 0){
                    femaleParticipantTotal++;
                    venueSizeTotalFP += Integer.parseInt(participant.getfF0());
                    festivalTotalFP += Integer.parseInt(participant.getfF1());
                    ratingTotalFP += Integer.parseInt(participant.getfF2());
                    otherRatingTotalFP += Integer.parseInt(participant.getfF3());
                    payTotalFP += Integer.parseInt(participant.getfF4());
                    otherPayTotalFP += Integer.parseInt(participant.getfF5());

                    malePreferredFP += (participant.getfPF0().equals("1")) ? 1 : 0;
                    femalePreferredFP += (participant.getfPF0().equals("0")) ? 1 : 0;
                    maleOtherPreferredFP += (participant.getfPF1().equals("1")) ? 1 :0;
                    femaleOtherPreferredFP += (participant.getfPF1().equals("0")) ? 1 :0;
                } else if (genderCode == 1){
                    malePartipantTotal++;
                    venueSizeTotalMP += Integer.parseInt(participant.getfF0());
                    festivalTotalMP += Integer.parseInt(participant.getfF1());
                    ratingTotalMP += Integer.parseInt(participant.getfF2());
                    otherRatingTotalMP += Integer.parseInt(participant.getfF3());
                    payTotalMP += Integer.parseInt(participant.getfF4());
                    otherPayTotalMP += Integer.parseInt(participant.getfF5());

                    malePreferredMP += (participant.getfPF0().equals("1")) ? 1 : 0;
                    femalePreferredMP += (participant.getfPF0().equals("0")) ? 1 : 0;
                    maleOtherPreferredMP += (participant.getfPF1().equals("1")) ? 1 :0;
                    femaleOtherPreferredMP += (participant.getfPF1().equals("0")) ? 1 :0;
                } else if (genderCode == 2){
                    nBParticipantTotal++;
                    venueSizeTotalNBP += Integer.parseInt(participant.getfF0());
                    festivalTotalNBP += Integer.parseInt(participant.getfF1());
                    ratingTotalNBP += Integer.parseInt(participant.getfF2());
                    otherRatingTotalNBP += Integer.parseInt(participant.getfF3());
                    payTotalNBP += Integer.parseInt(participant.getfF4());
                    otherPayTotalNBP += Integer.parseInt(participant.getfF5());

                    malePreferredNBP += (participant.getfPF0().equals("1")) ? 1 : 0;
                    femalePreferredNBP += (participant.getfPF0().equals("0")) ? 1 : 0;
                    maleOtherPreferredNBP += (participant.getfPF1().equals("1")) ? 1 :0;
                    femaleOtherPreferredNBP += (participant.getfPF1().equals("0")) ? 1 :0;
                } else if (genderCode == 3){
                    uParticipantTotal++;
                    venueSizeTotalUP += Integer.parseInt(participant.getfF0());
                    festivalTotalUP += Integer.parseInt(participant.getfF1());
                    ratingTotalUP += Integer.parseInt(participant.getfF2());
                    otherRatingTotalUP += Integer.parseInt(participant.getfF3());
                    payTotalUP += Integer.parseInt(participant.getfF4());
                    otherPayTotalUP += Integer.parseInt(participant.getfF5());

                    malePreferredUP += (participant.getfPF0().equals("1")) ? 1 : 0;
                    femalePreferredUP += (participant.getfPF0().equals("0")) ? 1 : 0;
                    maleOtherPreferredUP += (participant.getfPF1().equals("1")) ? 1 :0;
                    femaleOtherPreferredUP += (participant.getfPF1().equals("0")) ? 1 :0;
                }
            } else {
                System.out.println("Not in group: " + participant.getResponseId());
            }
        }
    }
}
