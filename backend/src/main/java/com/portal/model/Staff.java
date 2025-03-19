package com.portal.model;

import jakarta.persistence.*;

@Entity
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

    public Staff() {}

    public Staff(Long id, String indexNumber, String fullName, String email, String currentLocation, 
                 String highestLevelOfEducation, String dutyStation, String availabilityForRemoteWork, 
                 String softwareExpertise, String softwareExpertiseLevel, String language, 
                 String levelOfResponsibility) {
        this.id = id;
        this.indexNumber = indexNumber;
        this.fullName = fullName;
        this.email = email;
        this.currentLocation = currentLocation;
        this.highestLevelOfEducation = highestLevelOfEducation;
        this.dutyStation = dutyStation;
        this.availabilityForRemoteWork = availabilityForRemoteWork;
        this.softwareExpertise = softwareExpertise;
        this.softwareExpertiseLevel = softwareExpertiseLevel;
        this.language = language;
        this.levelOfResponsibility = levelOfResponsibility;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getHighestLevelOfEducation() {
        return highestLevelOfEducation;
    }

    public void setHighestLevelOfEducation(String highestLevelOfEducation) {
        this.highestLevelOfEducation = highestLevelOfEducation;
    }

    public String getDutyStation() {
        return dutyStation;
    }

    public void setDutyStation(String dutyStation) {
        this.dutyStation = dutyStation;
    }

    public String getAvailabilityForRemoteWork() {
        return availabilityForRemoteWork;
    }

    public void setAvailabilityForRemoteWork(String availabilityForRemoteWork) {
        this.availabilityForRemoteWork = availabilityForRemoteWork;
    }

    public String getSoftwareExpertise() {
        return softwareExpertise;
    }

    public void setSoftwareExpertise(String softwareExpertise) {
        this.softwareExpertise = softwareExpertise;
    }

    public String getSoftwareExpertiseLevel() {
        return softwareExpertiseLevel;
    }

    public void setSoftwareExpertiseLevel(String softwareExpertiseLevel) {
        this.softwareExpertiseLevel = softwareExpertiseLevel;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLevelOfResponsibility() {
        return levelOfResponsibility;
    }

    public void setLevelOfResponsibility(String levelOfResponsibility) {
        this.levelOfResponsibility = levelOfResponsibility;
    }
}
