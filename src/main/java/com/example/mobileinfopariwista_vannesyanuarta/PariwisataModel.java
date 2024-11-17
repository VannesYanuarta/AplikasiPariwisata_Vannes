package com.example.mobileinfopariwista_vannesyanuarta;

public class PariwisataModel {
    private int image;
    private String title;
    private String location;
    private String description;
    private String openingHours;
    private String openingDays;
    private String additionalText;

    // Constructor
    public PariwisataModel(int image, String title, String location, String description,
                           String openingHours, String openingDays, String additionalText) {
        this.image = image;
        this.title = title;
        this.location = location;
        this.description = description;
        this.openingHours = openingHours;
        this.openingDays = openingDays;
        this.additionalText = additionalText;
    }

    // Getter methods
    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public String getOpeningDays() {
        return openingDays;
    }

    public String getAdditionalText() {
        return additionalText;
    }

    // Setter methods
    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public void setOpeningDays(String openingDays) {
        this.openingDays = openingDays;
    }

    public void setAdditionalText(String additionalText) {
        this.additionalText = additionalText;
    }
}
