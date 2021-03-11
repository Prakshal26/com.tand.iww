package com.tandf.iww.model;

import javax.persistence.*;

@Entity
@Table(name = "ww_people")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String xmlId;

    private String indexedName;
    private String nobility;
    private String titles;
    private String givenName;
    private String pseudonym;

    private String portraitImage;
    private String qualifications;
    private String nationality;

    private String profession;

    private String presentPosition;
    private String nameAtBirth;
    private String dateOfBirth;
    private String placeOfBirth;
    private String dateOfDeath;
    private String parentage;
    private String family;
    private String education;
    private String careerPara;
    private String honoursAwards;

    private String films;
    private String plays;
    private String tv;
    private String music;
    private String dance;
    private String artExhibition;
    private String radio;
    private String achievements;
    private String publications;
    private String leisureInterests;
    private String contactDetails;
    private String managementAddress;

    private int dead;
    private String gender;
    private String region;
    private String subRegion;

    private String reference_id;
    private String reference_name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getXmlId() {
        return xmlId;
    }

    public void setXmlId(String xmlId) {
        this.xmlId = xmlId;
    }

    public String getIndexedName() {
        return indexedName;
    }

    public void setIndexedName(String indexedName) {
        this.indexedName = indexedName;
    }

    public String getNobility() {
        return nobility;
    }

    public void setNobility(String nobility) {
        this.nobility = nobility;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public String getPortraitImage() {
        return portraitImage;
    }

    public void setPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getPresentPosition() {
        return presentPosition;
    }

    public void setPresentPosition(String presentPosition) {
        this.presentPosition = presentPosition;
    }

    public String getNameAtBirth() {
        return nameAtBirth;
    }

    public void setNameAtBirth(String nameAtBirth) {
        this.nameAtBirth = nameAtBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getParentage() {
        return parentage;
    }

    public void setParentage(String parentage) {
        this.parentage = parentage;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCareerPara() {
        return careerPara;
    }

    public void setCareerPara(String careerPara) {
        this.careerPara = careerPara;
    }

    public String getHonoursAwards() {
        return honoursAwards;
    }

    public void setHonoursAwards(String honoursAwards) {
        this.honoursAwards = honoursAwards;
    }

    public String getFilms() {
        return films;
    }

    public void setFilms(String films) {
        this.films = films;
    }

    public String getPlays() {
        return plays;
    }

    public void setPlays(String plays) {
        this.plays = plays;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getDance() {
        return dance;
    }

    public void setDance(String dance) {
        this.dance = dance;
    }

    public String getArtExhibition() {
        return artExhibition;
    }

    public void setArtExhibition(String artExhibition) {
        this.artExhibition = artExhibition;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    public String getPublications() {
        return publications;
    }

    public void setPublications(String publications) {
        this.publications = publications;
    }

    public String getLeisureInterests() {
        return leisureInterests;
    }

    public void setLeisureInterests(String leisureInterests) {
        this.leisureInterests = leisureInterests;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getManagementAddress() {
        return managementAddress;
    }

    public void setManagementAddress(String managementAddress) {
        this.managementAddress = managementAddress;
    }

    public int getDead() {
        return dead;
    }

    public void setDead(int dead) {
        this.dead = dead;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubRegion() {
        return subRegion;
    }

    public void setSubRegion(String subRegion) {
        this.subRegion = subRegion;
    }

    public String getReference_id() {
        return reference_id;
    }

    public void setReference_id(String reference_id) {
        this.reference_id = reference_id;
    }

    public String getReference_name() {
        return reference_name;
    }

    public void setReference_name(String reference_name) {
        this.reference_name = reference_name;
    }
}
