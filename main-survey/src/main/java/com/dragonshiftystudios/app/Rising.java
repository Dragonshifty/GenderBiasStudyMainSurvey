package com.dragonshiftystudios.app;

public class Rising extends TrackStats{
    @Override
    protected void getStats(){
        trackName = "Rising";
        
        for (Participant participant : participants){
            int groupCode = Integer.parseInt(participant.getGroup());
            int genderCode = Integer.parseInt(participant.getGender());
            
            if (groupCode == 1){
                maleLedTotal++;
                venueSizeTotalML += Integer.parseInt(participant.getmR0());
                festivalTotalML += Integer.parseInt(participant.getmR1());
                ratingTotalML += Integer.parseInt(participant.getmR2());
                otherRatingTotalML += Integer.parseInt(participant.getmR3());
                payTotalML += Integer.parseInt(participant.getmR4());
                otherPayTotalML += Integer.parseInt(participant.getmR5());

                if (genderCode == 0){
                    femaleParticipantTotal++;
                    venueSizeTotalFP += Integer.parseInt(participant.getmR0());
                    festivalTotalFP += Integer.parseInt(participant.getmR1());
                    ratingTotalFP += Integer.parseInt(participant.getmR2());
                    otherRatingTotalFP += Integer.parseInt(participant.getmR3());
                    payTotalFP += Integer.parseInt(participant.getmR4());
                    otherPayTotalFP += Integer.parseInt(participant.getmR5());
                } else if (genderCode == 1){
                    malePartipantTotal++;
                    venueSizeTotalMP += Integer.parseInt(participant.getmR0());
                    festivalTotalMP += Integer.parseInt(participant.getmR1());
                    ratingTotalMP += Integer.parseInt(participant.getmR2());
                    otherRatingTotalMP += Integer.parseInt(participant.getmR3());
                    payTotalMP += Integer.parseInt(participant.getmR4());
                    otherPayTotalMP += Integer.parseInt(participant.getmR5());
                } else if (genderCode == 2){
                    nBParticipantTotal++;
                    venueSizeTotalNBP += Integer.parseInt(participant.getmR0());
                    festivalTotalNBP += Integer.parseInt(participant.getmR1());
                    ratingTotalNBP += Integer.parseInt(participant.getmR2());
                    otherRatingTotalNBP += Integer.parseInt(participant.getmR3());
                    payTotalNBP += Integer.parseInt(participant.getmR4());
                    otherPayTotalNBP += Integer.parseInt(participant.getmR5());
                } else if (genderCode == 3){
                    uParticipantTotal++;
                    venueSizeTotalUP += Integer.parseInt(participant.getmR0());
                    festivalTotalUP += Integer.parseInt(participant.getmR1());
                    ratingTotalUP += Integer.parseInt(participant.getmR2());
                    otherRatingTotalUP += Integer.parseInt(participant.getmR3());
                    payTotalUP += Integer.parseInt(participant.getmR4());
                    otherPayTotalUP += Integer.parseInt(participant.getmR5());
                }
            } else if (groupCode == 2){
                femaleLedTotal++;
                venueSizeTotalFL += Integer.parseInt(participant.getfR0());
                festivalTotalFL += Integer.parseInt(participant.getfR1());
                ratingTotalFL += Integer.parseInt(participant.getfR2());
                otherRatingTotalFL += Integer.parseInt(participant.getfR3());
                payTotalFL += Integer.parseInt(participant.getfR4());
                otherPayTotalFL += Integer.parseInt(participant.getfR5());

                if (genderCode == 0){
                    femaleParticipantTotal++;
                    venueSizeTotalFP += Integer.parseInt(participant.getfR0());
                    festivalTotalFP += Integer.parseInt(participant.getfR1());
                    ratingTotalFP += Integer.parseInt(participant.getfR2());
                    otherRatingTotalFP += Integer.parseInt(participant.getfR3());
                    payTotalFP += Integer.parseInt(participant.getfR4());
                    otherPayTotalFP += Integer.parseInt(participant.getfR5());
                } else if (genderCode == 1){
                    malePartipantTotal++;
                    venueSizeTotalMP += Integer.parseInt(participant.getfR0());
                    festivalTotalMP += Integer.parseInt(participant.getfR1());
                    ratingTotalMP += Integer.parseInt(participant.getfR2());
                    otherRatingTotalMP += Integer.parseInt(participant.getfR3());
                    payTotalMP += Integer.parseInt(participant.getfR4());
                    otherPayTotalMP += Integer.parseInt(participant.getfR5());
                } else if (genderCode == 2){
                    nBParticipantTotal++;
                    venueSizeTotalNBP += Integer.parseInt(participant.getfR0());
                    festivalTotalNBP += Integer.parseInt(participant.getfR1());
                    ratingTotalNBP += Integer.parseInt(participant.getfR2());
                    otherRatingTotalNBP += Integer.parseInt(participant.getfR3());
                    payTotalNBP += Integer.parseInt(participant.getfR4());
                    otherPayTotalNBP += Integer.parseInt(participant.getfR5());
                } else if (genderCode == 3){
                    uParticipantTotal++;
                    venueSizeTotalUP += Integer.parseInt(participant.getfR0());
                    festivalTotalUP += Integer.parseInt(participant.getfR1());
                    ratingTotalUP += Integer.parseInt(participant.getfR2());
                    otherRatingTotalUP += Integer.parseInt(participant.getfR3());
                    payTotalUP += Integer.parseInt(participant.getfR4());
                    otherPayTotalUP += Integer.parseInt(participant.getfR5());
                }
            } else {
                System.out.println("Not in group: " + participant.getResponseId());
            }
        }
    }
}
