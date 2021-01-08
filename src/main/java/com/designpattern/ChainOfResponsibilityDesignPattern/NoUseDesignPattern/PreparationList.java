package com.designpattern.ChainOfResponsibilityDesignPattern.NoUseDesignPattern;

/**
 * @Author: lxq
 * @Date: 2021/1/7 16:59
 */
public class PreparationList {
private boolean washFace;
private boolean washHair;
private boolean haveBreakfast;

    public boolean isWashFace() {
        return washFace;
    }

    public void setWashFace(boolean washFace) {
        this.washFace = washFace;
    }

    public boolean isWashHair() {
        return washHair;
    }

    public void setWashHair(boolean washHair) {
        this.washHair = washHair;
    }

    public boolean isHaveBreakfast() {
        return haveBreakfast;
    }

    public void setHaveBreakfast(boolean haveBreakfast) {
        this.haveBreakfast = haveBreakfast;
    }

    @Override
    public String toString() {
        return "PreparationList{" +
                "washFace=" + washFace +
                ", washHair=" + washHair +
                ", haveBreakfast=" + haveBreakfast +
                '}';
    }
}
