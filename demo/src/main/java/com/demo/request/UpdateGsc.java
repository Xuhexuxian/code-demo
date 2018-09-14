package com.demo.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Setter
@Getter

public class UpdateGsc {

    private String id;
    private int isdelete;
    @NotEmpty(message = "光速节点名称不能为空")
    @NotNull(message = "光速节点名称不能为空")
    private String gsnode;

    @NotNull(message = "仓所地址")
    private String csadress;

    @NotNull(message = "光速节点描述")
    private String gsnodepoint;

    @NotNull(message = "FACEBOOK")
    private String facebook;

    @NotNull(message = "TWITTER")
    private String twitter;

    @NotNull(message = "reddit")
    private String reddit;

    @NotNull(message = "TELEgram")
    private String telegram;

    @NotNull(message = "官网")
    private String officalnetwork;

    @NotNull(message = "预算")
    private String budget;

    @NotNull(message = "服务器位置")
    private String serverposition;

    @NotNull(message = "服务器类型")
    private String servertype;

    @NotNull(message = "服务器配置")
    private String serverconfig;

    @NotNull(message = "扩容计划")
    private String dilationplan;

    @NotNull(message = "公司信息")
    private String companyinfo;

    @NotNull(message = "社区计划")
    private String communityplan;

    @NotNull(message = "直播宣传")
    private String livespread;

    @NotNull(message = "meetup宣传")
    private String meetupspread;

    @NotNull(message = "社群宣传")
    private String communityspread;

    @NotNull(message = "团队介绍")
    private String teaminfo;

    @NotNull(message = "公司名称")
    private String companyname;

    @Override
    public String toString() {
        return "UpdateGsc{" +
                ", id='" + id + '\'' +
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
                ", teaminfo='" + teaminfo + '\'' +
                ", companyname='" + companyname + '\'' +
                ", isdelete='" + "0 "+ '\'' +
                '}';
    }
}
