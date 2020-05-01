package com.project.as2_contactlist;

public class Contact {

    int id;
    String name, number, email, organization, relationship;

    public Contact() {

    }

    public Contact(int id, String name, String number, String email, String organization, String relationship) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.email = email;
        this.organization = organization;
        this.relationship = relationship;
    }

    public Contact(String name, String number, String email, String organization, String relationship) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.organization = organization;
        this.relationship = relationship;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
}
