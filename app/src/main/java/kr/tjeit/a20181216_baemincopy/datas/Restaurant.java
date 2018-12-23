package kr.tjeit.a20181216_baemincopy.datas;

public class Restaurant {


    private String name;
    private  String address;
    private String openTime;
    private  String logoUrl;

    public Restaurant(String name, String address, String openTime, String logoUrl) {
        this.name = name;
        this.address = address;
        this.openTime = openTime;
        this.logoUrl = logoUrl;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }
}
