package com.websarva.wings.android.shoppinglist;

public class MyData {
    private String textName = "";
    private Boolean checkdata = false;
    private String unit = "";

    public void setTextName(String str){
        textName = str;
    }
    public String getTextName(){
        return textName;
    }
    public void setChecked(boolean bool){
        checkdata = bool;
    }
    public boolean isChecked(){
        return checkdata;
    }
    public void setUnit(String unt) {
        unit = unt;
    }
    public String getUnit(){
        return unit;
    }
}