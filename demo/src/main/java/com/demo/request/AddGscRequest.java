package com.demo.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Setter
@Getter
public class AddGscRequest {
    @NotEmpty(message = "光速节点名称不能为空")
    @NotNull(message = "光速节点名称不能为空")
    private String gsnode;
    @NotEmpty(message = "仓所地址不能为空")
    @NotNull(message = "仓所地址")
    private String csadress;
    @NotEmpty(message = "光速节点描述不能为空")
    @NotNull(message = "光速节点描述")
    private String gsnodepoint;
    @NotEmpty(message = "FACEBOOK不能为空")
    @NotNull(message = "FACEBOOK")
    private String facebook;
    @NotEmpty(message = "TWITTER不能为空")
    @NotNull(message = "TWITTER")
    private String twitter;
    @NotEmpty(message = "reddit不能为空")
    @NotNull(message = "reddit")
    private String reddit;
    @NotEmpty(message = "TELEgram不能为空")
    @NotNull(message = "TELEgram")
    private String telegram;
    @NotEmpty(message = "官网不能为空")
    @NotNull(message = "官网")
    private String officalnetwork;
    @NotEmpty(message = "预算不能为空")
    @NotNull(message = "预算")
    private String budget;
    @NotEmpty(message = "服务器位置不能为空")
    @NotNull(message = "服务器位置")
    private String serverposition;
    @NotEmpty(message = "服务器类型不能为空")
    @NotNull(message = "服务器类型")
    private String servertype;
    @NotEmpty(message = "服务器配置不能为空")
    @NotNull(message = "服务器配置")
    private String serverconfig;
    @NotEmpty(message = "扩容计划不能为空")
    @NotNull(message = "扩容计划")
    private String dilationplan;
    @NotEmpty(message = "公司信息不能为空")
    @NotNull(message = "公司信息")
    private String companyinfo;
    @NotEmpty(message = "社区计划不能为空")
    @NotNull(message = "社区计划")
    private String communityplan;
    @NotEmpty(message = "直播宣传不能为空")
    @NotNull(message = "直播宣传")
    private String livespread;
    @NotEmpty(message = "meetup宣传不能为空")
    @NotNull(message = "meetup宣传")
    private String meetupspread;
    @NotEmpty(message = "社群宣传不能为空")
    @NotNull(message = "社群宣传")
    private String communityspread;

    @Override
    public String toString() {
        return "AddGscRequest{" +
                "gsnode='" + gsnode + '\'' +
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
                '}';
    }
}
