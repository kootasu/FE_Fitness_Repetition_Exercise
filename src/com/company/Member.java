package com.company;

public class Member extends Person {

    private boolean isBasic;

    public Member(String name, String cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
    }

    public String getMemberType(){
        if (isBasic) return "Basic";
        else return "Full";
    }

    public int monthlyFee(){
        if (isBasic) return 199;
        else return 299;
    }
}
