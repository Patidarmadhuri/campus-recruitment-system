package com.example.campus.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Represents an interview scheduled for an application.
 */
@Entity
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "application_id")
    private Application application;

    private LocalDateTime scheduledAt;
    private String location;

    public Interview() {}

    public Interview(Application application, LocalDateTime scheduledAt, String location) {
        this.application = application;
        this.scheduledAt = scheduledAt;
        this.location = location;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Application getApplication() { return application; }
    public void setApplication(Application application) { this.application = application; }
    public LocalDateTime getScheduledAt() { return scheduledAt; }
    public void setScheduledAt(LocalDateTime scheduledAt) { this.scheduledAt = scheduledAt; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}