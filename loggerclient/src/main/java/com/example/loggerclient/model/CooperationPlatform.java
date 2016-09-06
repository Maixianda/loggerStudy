package com.example.loggerclient.model;

/**
 * Created by Administrator on 2016/9/6.
 * 说明:           合作平台信息
 * 创建人:         maixianda
 * 创建时间:       2016/9/6 10:03
 */
public class CooperationPlatform {

    public CooperationPlatform(String bigTitle, String smallTitle, String imgUrl) {
        this.bigTitle = bigTitle;
        this.smallTitle = smallTitle;
        this.imgUrl = imgUrl;
    }

    public CooperationPlatform() {
    }

    /**
     * bigTitle : 奕丰金融
     * smallTitle : 慧识金融
     * imgUrl :
     */

    private String bigTitle;
    private String smallTitle;
    private String imgUrl;

    public String getBigTitle() {
        return bigTitle;
    }

    public void setBigTitle(String bigTitle) {
        this.bigTitle = bigTitle;
    }

    public String getSmallTitle() {
        return smallTitle;
    }

    public void setSmallTitle(String smallTitle) {
        this.smallTitle = smallTitle;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
