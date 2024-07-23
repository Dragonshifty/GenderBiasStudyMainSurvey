package com.dragonshiftystudios.app;

public class Triggered extends TrackStats {
    protected void getStats(){
        trackName = "Triggered";

        for (Participant participant : participants){
            int groupCode = Integer.parseInt(participant.getGroup());
            int genderCode = Integer.parseInt(participant.getGender());
            
            if (groupCode == 1){
                maleLedTotal++;
                venueSizeTotalML += Integer.parseInt(participant.getmT0());
                festivalTotalML += Integer.parseInt(participant.getmT1());
                ratingTotalML += Integer.parseInt(participant.getmT2());
                otherRatingTotalML += Integer.parseInt(participant.getmT3());
                payTotalML += Integer.parseInt(participant.getmT4());
                otherPayTotalML += Integer.parseInt(participant.getmT5());

                if (genderCode == 0){
                    femaleParticipantTotal++;
                    venueSizeTotalFP += Integer.parseInt(participant.getmT0());
                    festivalTotalFP += Integer.parseInt(participant.getmT1());
                    ratingTotalFP += Integer.parseInt(participant.getmT2());
                    otherRatingTotalFP += Integer.parseInt(participant.getmT3());
                    payTotalFP += Integer.parseInt(participant.getmT4());
                    otherPayTotalFP += Integer.parseInt(participant.getmT5());
                } else if (genderCode == 1){
                    malePartipantTotal++;
                    venueSizeTotalMP += Integer.parseInt(participant.getmT0());
                    festivalTotalMP += Integer.parseInt(participant.getmT1());
                    ratingTotalMP += Integer.parseInt(participant.getmT2());
                    otherRatingTotalMP += Integer.parseInt(participant.getmT3());
                    payTotalMP += Integer.parseInt(participant.getmT4());
                    otherPayTotalMP += Integer.parseInt(participant.getmT5());
                } else if (genderCode == 2){
                    nBParticipantTotal++;
                    venueSizeTotalNBP += Integer.parseInt(participant.getmT0());
                    festivalTotalNBP += Integer.parseInt(participant.getmT1());
                    ratingTotalNBP += Integer.parseInt(participant.getmT2());
                    otherRatingTotalNBP += Integer.parseInt(participant.getmT3());
                    payTotalNBP += Integer.parseInt(participant.getmT4());
                    otherPayTotalNBP += Integer.parseInt(participant.getmT5());
                } else if (genderCode == 3){
                    uParticipantTotal++;
                    venueSizeTotalUP += Integer.parseInt(participant.getmT0());
                    festivalTotalUP += Integer.parseInt(participant.getmT1());
                    ratingTotalUP += Integer.parseInt(participant.getmT2());
                    otherRatingTotalUP += Integer.parseInt(participant.getmT3());
                    payTotalUP += Integer.parseInt(participant.getmT4());
                    otherPayTotalUP += Integer.parseInt(participant.getmT5());
                }
            } else if (groupCode == 2){
                femaleLedTotal++;
                venueSizeTotalFL += Integer.parseInt(participant.getfT0());
                festivalTotalFL += Integer.parseInt(participant.getfT1());
                ratingTotalFL += Integer.parseInt(participant.getfT2());
                otherRatingTotalFL += Integer.parseInt(participant.getfT3());
                payTotalFL += Integer.parseInt(participant.getfT4());
                otherPayTotalFL += Integer.parseInt(participant.getfT5());

                if (genderCode == 0){
                    femaleParticipantTotal++;
                    venueSizeTotalFP += Integer.parseInt(participant.getfT0());
                    festivalTotalFP += Integer.parseInt(participant.getfT1());
                    ratingTotalFP += Integer.parseInt(participant.getfT2());
                    otherRatingTotalFP += Integer.parseInt(participant.getfT3());
                    payTotalFP += Integer.parseInt(participant.getfT4());
                    otherPayTotalFP += Integer.parseInt(participant.getfT5());
                } else if (genderCode == 1){
                    malePartipantTotal++;
                    venueSizeTotalMP += Integer.parseInt(participant.getfT0());
                    festivalTotalMP += Integer.parseInt(participant.getfT1());
                    ratingTotalMP += Integer.parseInt(participant.getfT2());
                    otherRatingTotalMP += Integer.parseInt(participant.getfT3());
                    payTotalMP += Integer.parseInt(participant.getfT4());
                    otherPayTotalMP += Integer.parseInt(participant.getfT5());
                } else if (genderCode == 2){
                    nBParticipantTotal++;
                    venueSizeTotalNBP += Integer.parseInt(participant.getfT0());
                    festivalTotalNBP += Integer.parseInt(participant.getfT1());
                    ratingTotalNBP += Integer.parseInt(participant.getfT2());
                    otherRatingTotalNBP += Integer.parseInt(participant.getfT3());
                    payTotalNBP += Integer.parseInt(participant.getfT4());
                    otherPayTotalNBP += Integer.parseInt(participant.getfT5());
                } else if (genderCode == 3){
                    uParticipantTotal++;
                    venueSizeTotalUP += Integer.parseInt(participant.getfT0());
                    festivalTotalUP += Integer.parseInt(participant.getfT1());
                    ratingTotalUP += Integer.parseInt(participant.getfT2());
                    otherRatingTotalUP += Integer.parseInt(participant.getfT3());
                    payTotalUP += Integer.parseInt(participant.getfT4());
                    otherPayTotalUP += Integer.parseInt(participant.getfT5());
                }
            } else {
                System.out.println("Not in group: " + participant.getResponseId());
            }
        }
    }  
}
