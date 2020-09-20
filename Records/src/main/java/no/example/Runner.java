package no.example;

import java.time.LocalDateTime;

public class Runner {
    public static void main(String[] args) {
        RecordDemo recordDemo = new RecordDemo(LocalDateTime.now(),"demouser",LocalDateTime.now(),"Other");
        System.out.println("recordDemo = " + recordDemo);

    }
}
