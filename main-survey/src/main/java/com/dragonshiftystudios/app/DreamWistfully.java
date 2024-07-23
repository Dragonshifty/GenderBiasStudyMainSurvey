package com.dragonshiftystudios.app;

public class DreamWistfully extends TrackStats {
    @Override
    protected void getStats(){
        trackName = "Dream Wistfully";

        for (Participant participant : participants){
            int groupCode = Integer.parseInt(participant.getGroup());
            int genderCode = Integer.parseInt(participant.getGender());
            
            if (groupCode == 1){
                maleLedTotal++;
                venueSizeTotalML += Integer.parseInt(participant.getmDW0());
                festivalTotalML += Integer.parseInt(participant.getmDW1());
                ratingTotalML += Integer.parseInt(participant.getmDW2());
                otherRatingTotalML += Integer.parseInt(participant.getmDW3());
                payTotalML += Integer.parseInt(participant.getmDW4());
                otherPayTotalML += Integer.parseInt(participant.getmDW5());

                if (genderCode == 0){
                    femaleParticipantTotal++;
                    venueSizeTotalFP += Integer.parseInt(participant.getmDW0());
                    festivalTotalFP += Integer.parseInt(participant.getmDW1());
                    ratingTotalFP += Integer.parseInt(participant.getmDW2());
                    otherRatingTotalFP += Integer.parseInt(participant.getmDW3());
                    payTotalFP += Integer.parseInt(participant.getmDW4());
                    otherPayTotalFP += Integer.parseInt(participant.getmDW5());
                } else if (genderCode == 1){
                    malePartipantTotal++;
                    venueSizeTotalMP += Integer.parseInt(participant.getmDW0());
                    festivalTotalMP += Integer.parseInt(participant.getmDW1());
                    ratingTotalMP += Integer.parseInt(participant.getmDW2());
                    otherRatingTotalMP += Integer.parseInt(participant.getmDW3());
                    payTotalMP += Integer.parseInt(participant.getmDW4());
                    otherPayTotalMP += Integer.parseInt(participant.getmDW5());
                } else if (genderCode == 2){
                    nBParticipantTotal++;
                    venueSizeTotalNBP += Integer.parseInt(participant.getmDW0());
                    festivalTotalNBP += Integer.parseInt(participant.getmDW1());
                    ratingTotalNBP += Integer.parseInt(participant.getmDW2());
                    otherRatingTotalNBP += Integer.parseInt(participant.getmDW3());
                    payTotalNBP += Integer.parseInt(participant.getmDW4());
                    otherPayTotalNBP += Integer.parseInt(participant.getmDW5());
                } else if (genderCode == 3){
                    uParticipantTotal++;
                    venueSizeTotalUP += Integer.parseInt(participant.getmDW0());
                    festivalTotalUP += Integer.parseInt(participant.getmDW1());
                    ratingTotalUP += Integer.parseInt(participant.getmDW2());
                    otherRatingTotalUP += Integer.parseInt(participant.getmDW3());
                    payTotalUP += Integer.parseInt(participant.getmDW4());
                    otherPayTotalUP += Integer.parseInt(participant.getmDW5());
                }
            } else if (groupCode == 2){
                femaleLedTotal++;
                venueSizeTotalFL += Integer.parseInt(participant.getfDW0());
                festivalTotalFL += Integer.parseInt(participant.getfDW1());
                ratingTotalFL += Integer.parseInt(participant.getfDW2());
                otherRatingTotalFL += Integer.parseInt(participant.getfDW3());
                payTotalFL += Integer.parseInt(participant.getfDW4());
                otherPayTotalFL += Integer.parseInt(participant.getfDW5());

                if (genderCode == 0){
                    femaleParticipantTotal++;
                    venueSizeTotalFP += Integer.parseInt(participant.getfDW0());
                    festivalTotalFP += Integer.parseInt(participant.getfDW1());
                    ratingTotalFP += Integer.parseInt(participant.getfDW2());
                    otherRatingTotalFP += Integer.parseInt(participant.getfDW3());
                    payTotalFP += Integer.parseInt(participant.getfDW4());
                    otherPayTotalFP += Integer.parseInt(participant.getfDW5());
                } else if (genderCode == 1){
                    malePartipantTotal++;
                    venueSizeTotalMP += Integer.parseInt(participant.getfDW0());
                    festivalTotalMP += Integer.parseInt(participant.getfDW1());
                    ratingTotalMP += Integer.parseInt(participant.getfDW2());
                    otherRatingTotalMP += Integer.parseInt(participant.getfDW3());
                    payTotalMP += Integer.parseInt(participant.getfDW4());
                    otherPayTotalMP += Integer.parseInt(participant.getfDW5());
                } else if (genderCode == 2){
                    nBParticipantTotal++;
                    venueSizeTotalNBP += Integer.parseInt(participant.getfDW0());
                    festivalTotalNBP += Integer.parseInt(participant.getfDW1());
                    ratingTotalNBP += Integer.parseInt(participant.getfDW2());
                    otherRatingTotalNBP += Integer.parseInt(participant.getfDW3());
                    payTotalNBP += Integer.parseInt(participant.getfDW4());
                    otherPayTotalNBP += Integer.parseInt(participant.getfDW5());
                } else if (genderCode == 3){
                    uParticipantTotal++;
                    venueSizeTotalUP += Integer.parseInt(participant.getfDW0());
                    festivalTotalUP += Integer.parseInt(participant.getfDW1());
                    ratingTotalUP += Integer.parseInt(participant.getfDW2());
                    otherRatingTotalUP += Integer.parseInt(participant.getfDW3());
                    payTotalUP += Integer.parseInt(participant.getfDW4());
                    otherPayTotalUP += Integer.parseInt(participant.getfDW5());
                }
            } else {
                System.out.println("Not in group: " + participant.getResponseId());
            }
        }
    }
}
