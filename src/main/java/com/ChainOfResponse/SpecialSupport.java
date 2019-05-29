package com.ChainOfResponse;

public class SpecialSupport extends Support {

private int specialNum;
    public SpecialSupport(String name,int specialNum) {
        super(name);
        this.specialNum =specialNum;
    }
    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber()==specialNum;
    }
}
