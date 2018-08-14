package com.demo.domain;

import javax.persistence.*;

@Entity
@Table(name = "gsc")
public class GscEntity {
    private String id;
    private String gsnode;
    private String csadress;
    private String gsnodepoint;
    private String facebook;
    private String twitter;
    private String reddit;
    private String telegram;
    private String officalnetwork;
    private String budget;
    private String serverposition;
    private String servertype;
    private String serverconfig;
    private String dilationplan;
    private String companyinfo;
    private String communityplan;
    private String livespread;
    private String meetupspread;
    private String communityspread;
    private Byte isDeleted;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "gsnode")
    public String getGsnode() {
        return gsnode;
    }

    public void setGsnode(String gsnode) {
        this.gsnode = gsnode;
    }

    @Basic
    @Column(name = "csadress")
    public String getCsadress() {
        return csadress;
    }

    public void setCsadress(String csadress) {
        this.csadress = csadress;
    }

    @Basic
    @Column(name = "gsnodepoint")
    public String getGsnodepoint() {
        return gsnodepoint;
    }

    public void setGsnodepoint(String gsnodepoint) {
        this.gsnodepoint = gsnodepoint;
    }

    @Basic
    @Column(name = "facebook")
    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    @Basic
    @Column(name = "twitter")
    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    @Basic
    @Column(name = "reddit")
    public String getReddit() {
        return reddit;
    }

    public void setReddit(String reddit) {
        this.reddit = reddit;
    }

    @Basic
    @Column(name = "telegram")
    public String getTelegram() {
        return telegram;
    }

    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }

    @Basic
    @Column(name = "officalnetwork")
    public String getOfficalnetwork() {
        return officalnetwork;
    }

    public void setOfficalnetwork(String officalnetwork) {
        this.officalnetwork = officalnetwork;
    }

    @Basic
    @Column(name = "budget")
    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    @Basic
    @Column(name = "serverposition")
    public String getServerposition() {
        return serverposition;
    }

    public void setServerposition(String serverposition) {
        this.serverposition = serverposition;
    }

    @Basic
    @Column(name = "servertype")
    public String getServertype() {
        return servertype;
    }

    public void setServertype(String servertype) {
        this.servertype = servertype;
    }

    @Basic
    @Column(name = "serverconfig")
    public String getServerconfig() {
        return serverconfig;
    }

    public void setServerconfig(String serverconfig) {
        this.serverconfig = serverconfig;
    }

    @Basic
    @Column(name = "dilationplan")
    public String getDilationplan() {
        return dilationplan;
    }

    public void setDilationplan(String dilationplan) {
        this.dilationplan = dilationplan;
    }

    @Basic
    @Column(name = "companyinfo")
    public String getCompanyinfo() {
        return companyinfo;
    }

    public void setCompanyinfo(String companyinfo) {
        this.companyinfo = companyinfo;
    }

    @Basic
    @Column(name = "communityplan")
    public String getCommunityplan() {
        return communityplan;
    }

    public void setCommunityplan(String communityplan) {
        this.communityplan = communityplan;
    }

    @Basic
    @Column(name = "livespread")
    public String getLivespread() {
        return livespread;
    }

    public void setLivespread(String livespread) {
        this.livespread = livespread;
    }

    @Basic
    @Column(name = "meetupspread")
    public String getMeetupspread() {
        return meetupspread;
    }

    public void setMeetupspread(String meetupspread) {
        this.meetupspread = meetupspread;
    }

    @Basic
    @Column(name = "communityspread")
    public String getCommunityspread() {
        return communityspread;
    }

    public void setCommunityspread(String communityspread) {
        this.communityspread = communityspread;
    }

    @Basic
    @Column(name = "is_deleted")
    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "GscEntity{" +
                "id='" + id + '\'' +
                ", gsnode='" + gsnode + '\'' +
                ", csadress='" + csadress + '\'' +
                ", gsnodepoint='" + gsnodepoint + '\'' +
                ", facebook='" + facebook + '\'' +
                ", twitter='" + twitter + '\'' +
                ", reddit='" + reddit + '\'' +
                ", telegram='" + telegram + '\'' +
                ", officalnetwork='" + officalnetwork + '\'' +
                ", budget='" + budget + '\'' +
                ", serverposition='" + serverposition + '\'' +
                ", servertype='" + servertype + '\'' +
                ", serverconfig='" + serverconfig + '\'' +
                ", dilationplan='" + dilationplan + '\'' +
                ", companyinfo='" + companyinfo + '\'' +
                ", communityplan='" + communityplan + '\'' +
                ", livespread='" + livespread + '\'' +
                ", meetupspread='" + meetupspread + '\'' +
                ", communityspread='" + communityspread + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
