package no.example;

import java.time.LocalDateTime;

public record RecordDemo(LocalDateTime createdOn, String createdBy, LocalDateTime updatedOn, String updatedBy) {
    @Override
    public String toString() {
        return "RecordDemo{\n" +
                "createdOn=" + createdOn +
                ", createdBy='" + createdBy + '\'' +
                ", updatedOn=" + updatedOn +
                ", updatedBy='" + updatedBy + '\'' +
                '}' +"\n";
    }
}

