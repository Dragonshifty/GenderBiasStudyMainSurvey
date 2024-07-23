package com.dragonshiftystudios.app;

public class Clearly extends TrackStats {
    

    @Override
    protected void getStats(){
        trackName = "Clearly";

        for (Participant participant : participants){
            int groupCode = Integer.parseInt(participant.getGroup());
            int genderCode = Integer.parseInt(participant.getGender());
            
            if (groupCode == 1){
                maleLedTotal++;
                venueSizeTotalML += Integer.parseInt(participant.getmC0());
                festivalTotalML += Integer.parseInt(participant.getmC1());
                ratingTotalML += Integer.parseInt(participant.getmC2());
                otherRatingTotalML += Integer.parseInt(participant.getmC3());
                payTotalML += Integer.parseInt(participant.getmC4());
                otherPayTotalML += Integer.parseInt(participant.getmC5());

                malePreferred += (participant.getmPC0().equals("1")) ? 1 : 0;
                femalePreferred += (participant.getmPC0().equals("0")) ? 1 : 0;
                maleOtherPreferred += (participant.getmPC1().equals("1")) ? 1 :0;
                femaleOtherPreferred += (participant.getmPC1().equals("0")) ? 1 :0;

                malePreferredML += (participant.getmPC0().equals("1")) ? 1 : 0;
                femalePreferredML += (participant.getmPC0().equals("0")) ? 1 : 0;
                maleOtherPreferredML += (participant.getmPC1().equals("1")) ? 1 :0;
                femaleOtherPreferredML += (participant.getmPC1().equals("0")) ? 1 :0;

                if (genderCode == 0){
                    femaleParticipantTotal++;
                    venueSizeTotalFP += Integer.parseInt(participant.getmC0());
                    festivalTotalFP += Integer.parseInt(participant.getmC1());
                    ratingTotalFP += Integer.parseInt(participant.getmC2());
                    otherRatingTotalFP += Integer.parseInt(participant.getmC3());
                    payTotalFP += Integer.parseInt(participant.getmC4());
                    otherPayTotalFP += Integer.parseInt(participant.getmC5());

                    malePreferredFP += (participant.getmPC0().equals("1")) ? 1 : 0;
                    femalePreferredFP += (participant.getmPC0().equals("0")) ? 1 : 0;
                    maleOtherPreferredFP += (participant.getmPC1().equals("1")) ? 1 :0;
                    femaleOtherPreferredFP += (participant.getmPC1().equals("0")) ? 1 :0;
                } else if (genderCode == 1){
                    malePartipantTotal++;
                    venueSizeTotalMP += Integer.parseInt(participant.getmC0());
                    festivalTotalMP += Integer.parseInt(participant.getmC1());
                    ratingTotalMP += Integer.parseInt(participant.getmC2());
                    otherRatingTotalMP += Integer.parseInt(participant.getmC3());
                    payTotalMP += Integer.parseInt(participant.getmC4());
                    otherPayTotalMP += Integer.parseInt(participant.getmC5());

                    malePreferredMP += (participant.getmPC0().equals("1")) ? 1 : 0;
                    femalePreferredMP += (participant.getmPC0().equals("0")) ? 1 : 0;
                    maleOtherPreferredMP += (participant.getmPC1().equals("1")) ? 1 :0;
                    femaleOtherPreferredMP += (participant.getmPC1().equals("0")) ? 1 :0;
                } else if (genderCode == 2){
                    nBParticipantTotal++;
                    venueSizeTotalNBP += Integer.parseInt(participant.getmC0());
                    festivalTotalNBP += Integer.parseInt(participant.getmC1());
                    ratingTotalNBP += Integer.parseInt(participant.getmC2());
                    otherRatingTotalNBP += Integer.parseInt(participant.getmC3());
                    payTotalNBP += Integer.parseInt(participant.getmC4());
                    otherPayTotalNBP += Integer.parseInt(participant.getmC5());

                    malePreferredNBP += (participant.getmPC0().equals("1")) ? 1 : 0;
                    femalePreferredNBP += (participant.getmPC0().equals("0")) ? 1 : 0;
                    maleOtherPreferredNBP += (participant.getmPC1().equals("1")) ? 1 :0;
                    femaleOtherPreferredNBP += (participant.getmPC1().equals("0")) ? 1 :0;
                } else if (genderCode == 3){
                    uParticipantTotal++;
                    venueSizeTotalUP += Integer.parseInt(participant.getmC0());
                    festivalTotalUP += Integer.parseInt(participant.getmC1());
                    ratingTotalUP += Integer.parseInt(participant.getmC2());
                    otherRatingTotalUP += Integer.parseInt(participant.getmC3());
                    payTotalUP += Integer.parseInt(participant.getmC4());
                    otherPayTotalUP += Integer.parseInt(participant.getmC5());

                    malePreferredUP += (participant.getmPC0().equals("1")) ? 1 : 0;
                    femalePreferredUP += (participant.getmPC0().equals("0")) ? 1 : 0;
                    maleOtherPreferredUP += (participant.getmPC1().equals("1")) ? 1 :0;
                    femaleOtherPreferredUP += (participant.getmPC1().equals("0")) ? 1 :0;
                }
            } else if (groupCode == 2){
                femaleLedTotal++;
                venueSizeTotalFL += Integer.parseInt(participant.getfC0());
                festivalTotalFL += Integer.parseInt(participant.getfC1());
                ratingTotalFL += Integer.parseInt(participant.getfC2());
                otherRatingTotalFL += Integer.parseInt(participant.getfC3());
                payTotalFL += Integer.parseInt(participant.getfC4());
                otherPayTotalFL += Integer.parseInt(participant.getfC5());

                malePreferred += (participant.getfPC0().equals("1")) ? 1 : 0;
                femalePreferred += (participant.getfPC0().equals("0")) ? 1 : 0;
                maleOtherPreferred += (participant.getfPC1().equals("1")) ? 1 :0;
                femaleOtherPreferred += (participant.getfPC1().equals("0")) ? 1 :0;

                malePreferredFL += (participant.getfPC0().equals("1")) ? 1 : 0;
                femalePreferredFL += (participant.getfPC0().equals("0")) ? 1 : 0;
                maleOtherPreferredFL += (participant.getfPC1().equals("1")) ? 1 :0;
                femaleOtherPreferredFL += (participant.getfPC1().equals("0")) ? 1 :0;

                if (genderCode == 0){
                    femaleParticipantTotal++;
                    venueSizeTotalFP += Integer.parseInt(participant.getfC0());
                    festivalTotalFP += Integer.parseInt(participant.getfC1());
                    ratingTotalFP += Integer.parseInt(participant.getfC2());
                    otherRatingTotalFP += Integer.parseInt(participant.getfC3());
                    payTotalFP += Integer.parseInt(participant.getfC4());
                    otherPayTotalFP += Integer.parseInt(participant.getfC5());

                    malePreferredFP += (participant.getfPC0().equals("1")) ? 1 : 0;
                    femalePreferredFP += (participant.getfPC0().equals("0")) ? 1 : 0;
                    maleOtherPreferredFP += (participant.getfPC1().equals("1")) ? 1 :0;
                    femaleOtherPreferredFP += (participant.getfPC1().equals("0")) ? 1 :0;
                } else if (genderCode == 1){
                    malePartipantTotal++;
                    venueSizeTotalMP += Integer.parseInt(participant.getfC0());
                    festivalTotalMP += Integer.parseInt(participant.getfC1());
                    ratingTotalMP += Integer.parseInt(participant.getfC2());
                    otherRatingTotalMP += Integer.parseInt(participant.getfC3());
                    payTotalMP += Integer.parseInt(participant.getfC4());
                    otherPayTotalMP += Integer.parseInt(participant.getfC5());

                    malePreferredMP += (participant.getfPC0().equals("1")) ? 1 : 0;
                    femalePreferredMP += (participant.getfPC0().equals("0")) ? 1 : 0;
                    maleOtherPreferredMP += (participant.getfPC1().equals("1")) ? 1 :0;
                    femaleOtherPreferredMP += (participant.getfPC1().equals("0")) ? 1 :0;
                }   else if (genderCode == 2){
                    nBParticipantTotal++;
                    venueSizeTotalNBP += Integer.parseInt(participant.getfC0());
                    festivalTotalNBP += Integer.parseInt(participant.getfC1());
                    ratingTotalNBP += Integer.parseInt(participant.getfC2());
                    otherRatingTotalNBP += Integer.parseInt(participant.getfC3());
                    payTotalNBP += Integer.parseInt(participant.getfC4());
                    otherPayTotalNBP += Integer.parseInt(participant.getfC5());

                    malePreferredNBP += (participant.getfPC0().equals("1")) ? 1 : 0;
                    femalePreferredNBP += (participant.getfPC0().equals("0")) ? 1 : 0;
                    maleOtherPreferredNBP += (participant.getfPC1().equals("1")) ? 1 :0;
                    femaleOtherPreferredNBP += (participant.getfPC1().equals("0")) ? 1 :0;
                } else if (genderCode == 3){
                    uParticipantTotal++;
                    venueSizeTotalUP += Integer.parseInt(participant.getfC0());
                    festivalTotalUP += Integer.parseInt(participant.getfC1());
                    ratingTotalUP += Integer.parseInt(participant.getfC2());
                    otherRatingTotalUP += Integer.parseInt(participant.getfC3());
                    payTotalUP += Integer.parseInt(participant.getfC4());
                    otherPayTotalUP += Integer.parseInt(participant.getfC5());

                    malePreferredUP += (participant.getfPC0().equals("1")) ? 1 : 0;
                    femalePreferredUP += (participant.getfPC0().equals("0")) ? 1 : 0;
                    maleOtherPreferredUP += (participant.getfPC1().equals("1")) ? 1 :0;
                    femaleOtherPreferredUP += (participant.getfPC1().equals("0")) ? 1 :0;
                }
            } else {
                System.out.println("Not in group: " + participant.getResponseId());
            }
        }
    }
}
