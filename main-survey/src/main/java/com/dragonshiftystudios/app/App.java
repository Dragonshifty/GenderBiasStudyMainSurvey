package com.dragonshiftystudios.app;
import java.util.LinkedList;

public class App 
{
    public static void main( String[] args )
    {
        LinkedList<Participant> particpants = new LinkedList<>();

        CSVConverter csvConverter = new CSVConverter();

        particpants = csvConverter.populateParticipantList();

        int total = particpants.size();

        System.out.println(particpants.getLast().getResponseId());
        System.out.println("Total " + total);
    }
}
