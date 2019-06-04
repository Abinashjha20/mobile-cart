package com.chetan.cshoppingcart;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by CHETAN on 6/6/2018.
 */

public class MyDemoBean implements Parcelable{

    String name;

    public MyDemoBean() {
    }

    protected MyDemoBean(Parcel in) {
        name = in.readString();
        address = in.readString();
    }

    public static final Creator<MyDemoBean> CREATOR = new Creator<MyDemoBean>() {
        @Override
        public MyDemoBean createFromParcel(Parcel in) {
            return new MyDemoBean(in);
        }

        @Override
        public MyDemoBean[] newArray(int size) {
            return new MyDemoBean[size];
        }
    };

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

    String address;


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(address);
    }
}
