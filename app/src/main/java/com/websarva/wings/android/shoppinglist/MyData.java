package com.websarva.wings.android.shoppinglist;

public class MyData {
    private String _textName = "";
    private Boolean _checkData = false;
    private String _unit = "";

    public void set_textName(String str){
        _textName = str;
    }
    public String get_textName(){
        return _textName;
    }
    public void setChecked(boolean bool){
        _checkData = bool;
    }
    public boolean isChecked(){
        return _checkData;
    }
    public void set_unit(String unit) {
        _unit = unit;
    }
    public String get_unit(){
        return _unit;
    }
}