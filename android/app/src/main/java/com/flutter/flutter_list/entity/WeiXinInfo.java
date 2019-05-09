package com.flutter.flutter_list.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeiXinInfo {

    private String openid;
    private String nickname;
    private int sex;
    private String province;
    private String city;
    private String country;
    private String headimgurl;
    private List<String> privilege;
    private String unionid;


    public void setOpenid(String openid) {
        this.openid = openid;
    }
    public String getOpenid() {
        return openid;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getNickname() {
        return nickname;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
    public int getSex() {
        return sex;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    public String getProvince() {
        return province;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }
    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setPrivilege(List<String> privilege) {
        this.privilege = privilege;
    }
    public List<String> getPrivilege() {
        return privilege;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }
    public String getUnionid() {
        return unionid;
    }


    @Override
    public String toString() {
        return "WeiXinInfo{" +
                "openid='" + openid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex=" + sex +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", headimgurl='" + headimgurl + '\'' +
                ", privilege=" + privilege +
                ", unionid='" + unionid + '\'' +
                '}';
    }

    public Map<String,String> toMap(){
        Map<String,String> userInfo =new HashMap<>();
        userInfo.put("openid",openid);
        userInfo.put("nickname",nickname);
        userInfo.put("sex",sex+"");
        userInfo.put("province",province);
        userInfo.put("city",city);
        userInfo.put("country",headimgurl);
        userInfo.put("unionid",unionid);
        return  userInfo;
    }

}
