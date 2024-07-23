package com.dragonshiftystudios.app;

public class MyOne extends TrackStats {
    @Override
    protected void getStats(){
        trackName = "My One";

        for (Participant participant : participants){
            int groupCode = Integer.parseInt(participant.getGroup());
            int genderCode = Integer.parseInt(participant.getGender());
            
            if (groupCode == 1){
                maleLedTotal++;
                venueSizeTotalML += Integer.parseInt(participant.getmM0());
                festivalTotalML += Integer.parseInt(participant.getmM1());
                ratingTotalML += Integer.parseInt(participant.getmM2());
                otherRatingTotalML += Integer.parseInt(participant.getmM3());
                payTotalML += Integer.parseInt(participant.getmM4());
                otherPayTotalML += Integer.parseInt(participant.getmM5());

                malePreferred += (participant.getmPM0().equals("1")) ? 1 : 0;
                femalePreferred += (participant.getmPM0().equals("0")) ? 1 : 0;
                maleOtherPreferred += (participant.getmPM1().equals("1")) ? 1 :0;
                femaleOtherPreferred += (participant.getmPM1().equals("0")) ? 1 :0;

                malePreferredML += (participant.getmPM0().equals("1")) ? 1 : 0;
                femalePreferredML += (participant.getmPM0().equals("0")) ? 1 : 0;
                maleOtherPreferredML += (participant.getmPM1().equals("1")) ? 1 :0;
                femaleOtherPreferredML += (participant.getmPM1().equals("0")) ? 1 :0;

                if (genderCode == 0){
                    femaleParticipantTotal++;
                    venueSizeTotalFP += Integer.parseInt(participant.getmM0());
                    festivalTotalFP += Integer.parseInt(participant.getmM1());
                    ratingTotalFP += Integer.parseInt(participant.getmM2());
                    otherRatingTotalFP += Integer.parseInt(participant.getmM3());
                    payTotalFP += Integer.parseInt(participant.getmM4());
                    otherPayTotalFP += Integer.parseInt(participant.getmM5());

                    malePreferredFP += (participant.getmPM0().equals("1")) ? 1 : 0;
                    femalePreferredFP += (participant.getmPM0().equals("0")) ? 1 : 0;
                    maleOtherPreferredFP += (participant.getmPM1().equals("1")) ? 1 :0;
                    femaleOtherPreferredFP += (participant.getmPM1().equals("0")) ? 1 :0;
                } else if (genderCode == 1){
                    malePartipantTotal++;
                    venueSizeTotalMP += Integer.parseInt(participant.getmM0());
                    festivalTotalMP += Integer.parseInt(participant.getmM1());
                    ratingTotalMP += Integer.parseInt(participant.getmM2());
                    otherRatingTotalMP += Integer.parseInt(participant.getmM3());
                    payTotalMP += Integer.parseInt(participant.getmM4());
                    otherPayTotalMP += Integer.parseInt(participant.getmM5());

                    malePreferredMP += (participant.getmPM0().equals("1")) ? 1 : 0;
                    femalePreferredMP += (participant.getmPM0().equals("0")) ? 1 : 0;
                    maleOtherPreferredMP += (participant.getmPM1().equals("1")) ? 1 :0;
                    femaleOtherPreferredMP += (participant.getmPM1().equals("0")) ? 1 :0;
                } else if (genderCode == 2){
                    nBParticipantTotal++;
                    venueSizeTotalNBP += Integer.parseInt(participant.getmM0());
                    festivalTotalNBP += Integer.parseInt(participant.getmM1());
                    ratingTotalNBP += Integer.parseInt(participant.getmM2());
                    otherRatingTotalNBP += Integer.parseInt(participant.getmM3());
                    payTotalNBP += Integer.parseInt(participant.getmM4());
                    otherPayTotalNBP += Integer.parseInt(participant.getmM5());

                    malePreferredNBP += (participant.getmPM0().equals("1")) ? 1 : 0;
                    femalePreferredNBP += (participant.getmPM0().equals("0")) ? 1 : 0;
                    maleOtherPreferredNBP += (participant.getmPM1().equals("1")) ? 1 :0;
                    femaleOtherPreferredNBP += (participant.getmPM1().equals("0")) ? 1 :0;
                } else if (genderCode == 3){
                    uParticipantTotal++;
                    venueSizeTotalUP += Integer.parseInt(participant.getmM0());
                    festivalTotalUP += Integer.parseInt(participant.getmM1());
                    ratingTotalUP += Integer.parseInt(participant.getmM2());
                    otherRatingTotalUP += Integer.parseInt(participant.getmM3());
                    payTotalUP += Integer.parseInt(participant.getmM4());
                    otherPayTotalUP += Integer.parseInt(participant.getmM5());

                    malePreferredUP += (participant.getmPM0().equals("1")) ? 1 : 0;
                    femalePreferredUP += (participant.getmPM0().equals("0")) ? 1 : 0;
                    maleOtherPreferredUP += (participant.getmPM1().equals("1")) ? 1 :0;
                    femaleOtherPreferredUP += (participant.getmPM1().equals("0")) ? 1 :0;
                }
            } else if (groupCode == 2){
                femaleLedTotal++;
                venueSizeTotalFL += Integer.parseInt(participant.getfM0());
                festivalTotalFL += Integer.parseInt(participant.getfM1());
                ratingTotalFL += Integer.parseInt(participant.getfM2());
                otherRatingTotalFL += Integer.parseInt(participant.getfM3());
                payTotalFL += Integer.parseInt(participant.getfM4());
                otherPayTotalFL += Integer.parseInt(participant.getfM5());

                malePreferred += (participant.getfPM0().equals("1")) ? 1 : 0;
                femalePreferred += (participant.getfPM0().equals("0")) ? 1 : 0;
                maleOtherPreferred += (participant.getfPM1().equals("1")) ? 1 :0;
                femaleOtherPreferred += (participant.getfPM1().equals("0")) ? 1 :0;

                malePreferredFL += (participant.getfPM0().equals("1")) ? 1 : 0;
                femalePreferredFL += (participant.getfPM0().equals("0")) ? 1 : 0;
                maleOtherPreferredFL += (participant.getfPM1().equals("1")) ? 1 :0;
                femaleOtherPreferredFL += (participant.getfPM1().equals("0")) ? 1 :0;

                if (genderCode == 0){
                    femaleParticipantTotal++;
                    venueSizeTotalFP += Integer.parseInt(participant.getfM0());
                    festivalTotalFP += Integer.parseInt(participant.getfM1());
                    ratingTotalFP += Integer.parseInt(participant.getfM2());
                    otherRatingTotalFP += Integer.parseInt(participant.getfM3());
                    payTotalFP += Integer.parseInt(participant.getfM4());
                    otherPayTotalFP += Integer.parseInt(participant.getfM5());

                    malePreferredFP += (participant.getfPM0().equals("1")) ? 1 : 0;
                    femalePreferredFP += (participant.getfPM0().equals("0")) ? 1 : 0;
                    maleOtherPreferredFP += (participant.getfPM1().equals("1")) ? 1 :0;
                    femaleOtherPreferredFP += (participant.getfPM1().equals("0")) ? 1 :0;
                } else if (genderCode == 1){
                    malePartipantTotal++;
                    venueSizeTotalMP += Integer.parseInt(participant.getfM0());
                    festivalTotalMP += Integer.parseInt(participant.getfM1());
                    ratingTotalMP += Integer.parseInt(participant.getfM2());
                    otherRatingTotalMP += Integer.parseInt(participant.getfM3());
                    payTotalMP += Integer.parseInt(participant.getfM4());
                    otherPayTotalMP += Integer.parseInt(participant.getfM5());

                    malePreferredMP += (participant.getfPM0().equals("1")) ? 1 : 0;
                    femalePreferredMP += (participant.getfPM0().equals("0")) ? 1 : 0;
                    maleOtherPreferredMP += (participant.getfPM1().equals("1")) ? 1 :0;
                    femaleOtherPreferredMP += (participant.getfPM1().equals("0")) ? 1 :0;
                } else if (genderCode == 2){
                    nBParticipantTotal++;
                    venueSizeTotalNBP += Integer.parseInt(participant.getfM0());
                    festivalTotalNBP += Integer.parseInt(participant.getfM1());
                    ratingTotalNBP += Integer.parseInt(participant.getfM2());
                    otherRatingTotalNBP += Integer.parseInt(participant.getfM3());
                    payTotalNBP += Integer.parseInt(participant.getfM4());
                    otherPayTotalNBP += Integer.parseInt(participant.getfM5());

                    malePreferredNBP += (participant.getfPM0().equals("1")) ? 1 : 0;
                    femalePreferredNBP += (participant.getfPM0().equals("0")) ? 1 : 0;
                    maleOtherPreferredNBP += (participant.getfPM1().equals("1")) ? 1 :0;
                    femaleOtherPreferredNBP += (participant.getfPM1().equals("0")) ? 1 :0;
                } else if (genderCode == 3){
                    uParticipantTotal++;
                    venueSizeTotalUP+= Integer.parseInt(participant.getfM0());
                    festivalTotalUP+= Integer.parseInt(participant.getfM1());
                    ratingTotalUP+= Integer.parseInt(participant.getfM2());
                    otherRatingTotalUP+= Integer.parseInt(participant.getfM3());
                    payTotalUP+= Integer.parseInt(participant.getfM4());
                    otherPayTotalUP+= Integer.parseInt(participant.getfM5());

                    malePreferredUP+= (participant.getfPM0().equals("1")) ? 1 : 0;
                    femalePreferredUP+= (participant.getfPM0().equals("0")) ? 1 : 0;
                    maleOtherPreferredUP+= (participant.getfPM1().equals("1")) ? 1 :0;
                    femaleOtherPreferredUP+= (participant.getfPM1().equals("0")) ? 1 :0;
                }
            } else {
                System.out.println("Not in group: " + participant.getResponseId());
            }
        }
    }
}
