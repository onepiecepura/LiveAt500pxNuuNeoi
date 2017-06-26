package com.onepiecepura.liveat500px.datatype;

import android.os.Bundle;

/**
 * Created by attawat on 6/12/17.
 */

public class MutableInteger {
    private int value;

    public MutableInteger(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Bundle onSaveInstanceState(){
        Bundle bundle = new Bundle();
        bundle.putInt("value", value);
        return bundle;
    }

    public void onRestoreInstanceState(Bundle savedInstanceState){
        value = savedInstanceState.getInt("value");
    }
}
