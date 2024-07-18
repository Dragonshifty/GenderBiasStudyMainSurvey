package com.dragonshiftystudios.app;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;

public class CSVConverter {
    public LinkedList<Participant> populateParticipantList(){
        LinkedList<Participant> participants = new LinkedList<>();

        String fileName = "Main Survey Pruned2.csv";

        try (CSVReader csvReader = new CSVReader(new FileReader(fileName))) {
            String[] headers = csvReader.readNext();
            String[] line;
            while ((line = csvReader.readNext()) != null){
                Participant participant = new Participant();
                for (int i = 0; i < headers.length; i++){
                    setField(participant, headers[i], line[i]);
                }
                participants.add(participant);
            } 
        } catch (IOException | CsvValidationException | ReflectiveOperationException e) {
            e.printStackTrace();
        } 

        return participants;
    }

    private void setField(Participant participant, String fieldName, String value) throws ReflectiveOperationException {
        if (value == null || value.trim().isEmpty()) return;

        Field field;

        try {
            field = Participant.class.getDeclaredField(toCamelCase(fieldName));
            field.setAccessible(true);
            field.set(participant, value);
        } catch (NoSuchFieldException e){
            System.err.println("No such field: " + toCamelCase(fieldName));
            // e.printStackTrace();
        }
    }

    private String toCamelCase (String name){
        StringBuilder stringBuilder = new StringBuilder();

        char[] charArray = name.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);

        for (int i = 0; i < charArray.length; i++){
            stringBuilder.append(charArray[i]);
        }
        return stringBuilder.toString();
    }
}
