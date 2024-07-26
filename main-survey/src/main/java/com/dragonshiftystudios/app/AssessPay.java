package com.dragonshiftystudios.app;
import java.util.LinkedList;

public class AssessPay {
    public void getGenderedPay(LinkedList<Participant> participants){
        int femalePay = 0;
        int femaleSuggestedPay = 0;
        int malePay = 0;
        int maleSuggestedPay = 0;
        int flCounter = 0;
        int mlCounter = 0;

        double femalePayMean = 0;
        double femaleSuggestedPayMean = 0;
        double malePayMean = 0;
        double maleSuggestedPayMean  = 0;

        for (Participant participant : participants){
            if (participant.getGroup().equals("1")){
                mlCounter++;
                malePay += Integer.parseInt(participant.getmC4());
                malePay += Integer.parseInt(participant.getmF4());
                malePay += Integer.parseInt(participant.getmMOE4());
                malePay += Integer.parseInt(participant.getmFO4());
                malePay += Integer.parseInt(participant.getmM4());
                malePay += Integer.parseInt(participant.getmDW4());
                malePay += Integer.parseInt(participant.getmR4());
                malePay += Integer.parseInt(participant.getmT4());

                maleSuggestedPay += Integer.parseInt(participant.getmC5());
                maleSuggestedPay += Integer.parseInt(participant.getmF5());
                maleSuggestedPay += Integer.parseInt(participant.getmMOE5());
                maleSuggestedPay += Integer.parseInt(participant.getmFO5());
                maleSuggestedPay += Integer.parseInt(participant.getmM5());
                maleSuggestedPay += Integer.parseInt(participant.getmDW5());
                maleSuggestedPay += Integer.parseInt(participant.getmR5());
                maleSuggestedPay += Integer.parseInt(participant.getmT5());
            } else if (participant.getGroup().equals("2")){
                flCounter++;

                femalePay += Integer.parseInt(participant.getfC4());
                femalePay += Integer.parseInt(participant.getfF4());
                femalePay += Integer.parseInt(participant.getfMOE4());
                femalePay += Integer.parseInt(participant.getfFO4());
                femalePay += Integer.parseInt(participant.getfM4());
                femalePay += Integer.parseInt(participant.getfDW4());
                femalePay += Integer.parseInt(participant.getfR4());
                femalePay += Integer.parseInt(participant.getfT4());

                femaleSuggestedPay += Integer.parseInt(participant.getfC5());
                femaleSuggestedPay += Integer.parseInt(participant.getfF5());
                femaleSuggestedPay += Integer.parseInt(participant.getfMOE5());
                femaleSuggestedPay += Integer.parseInt(participant.getfFO5());
                femaleSuggestedPay += Integer.parseInt(participant.getfM5());
                femaleSuggestedPay += Integer.parseInt(participant.getfDW5());
                femaleSuggestedPay += Integer.parseInt(participant.getfR5());
                femaleSuggestedPay += Integer.parseInt(participant.getfT5());
            } else {
                System.out.println("Group Error");
            }
        }

        malePayMean  = ((double) malePay / mlCounter) / 8;
        maleSuggestedPayMean  = ((double) maleSuggestedPay / mlCounter) / 8;
        femalePayMean = ((double) femalePay / flCounter) / 8;
        femaleSuggestedPayMean = ((double) femaleSuggestedPay / flCounter) / 8;

        String mpMeanText = String.format("%.2f", malePayMean);
        String mspMeanText = String.format("%.2f", maleSuggestedPayMean);
        String fpMeanText = String.format("%.2f", femalePayMean);
        String fspMeanText = String.format("%.2f", femaleSuggestedPayMean);

        System.out.println("Male Led - " + mlCounter + " Pay: " + mpMeanText + " Total: " + malePay);
        System.out.println("Female Led - " + flCounter + " Pay: " + fpMeanText + " Total: " + femalePay);

        System.out.println("Male Suggested - " + mlCounter + " Pay: " + mspMeanText + " Total: " + maleSuggestedPay);
        System.out.println("Female Suggested - " + flCounter + " Pay: " + fspMeanText + " Total: " + femaleSuggestedPay);
    }
}
