package com.portal.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String indexNumber;
    private String fullName;
    private String email;
    private String currentLocation;
    private String highestLevelOfEducation;
    private String dutyStation;
    private String availabilityForRemoteWork;
    private String softwareExpertise;
    private String softwareExpertiseLevel;
    private String language;
    private String levelOfResponsibility;
}
