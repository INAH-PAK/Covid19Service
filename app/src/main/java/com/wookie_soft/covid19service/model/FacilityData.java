package com.wookie_soft.covid19service.model;

public class FacilityData {

    public String address ;         // 주소
    public String centerName ; // 시설 타입
    public String facilityName ;  // 시설 이름
    public String phoneNumber ; //폰번호
    public String updatedAt ; // 업데이트 날짜
    public String lat ;     // 위도
    public String lng ;     // 경도

    public FacilityData(String address, String centerName, String facilityName, String phoneNumber, String updatedAt, String lat, String lng) {
        this.address = address;
        this.centerName = centerName;
        this.facilityName = facilityName;
        this.phoneNumber = phoneNumber;
        this.updatedAt = updatedAt;
        this.lat = lat;
        this.lng = lng;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    //                      "address": "서울특별시 중구 을지로 39길 29",
//                      "centerName": "코로나19 중앙 예방접종센터",
//                      "centerType": "중앙/권역",
//                      "createdAt": "2021-03-03 07:00:52",
//                      "facilityName": "국립중앙의료원 D동",
//                      "id": 1,
//                      "lat": "37.567817",
//                      "lng": "127.004501",
//                      "org": "국립중앙의료원",
//                      "phoneNumber": "02-2260-7114",
//                      "sido": "서울특별시",
//                      "sigungu": "중구",
//                      "updatedAt": "2021-07-16 04:55:08",
//                      "zipCode": "04562"


}
