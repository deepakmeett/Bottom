package com.example.bottom;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Viewpageadopter extends FragmentPagerAdapter {

    public Viewpageadopter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new Home();

            case 1:
                return new Trending();

            case 2:
                return new Subscriptions();

            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return 3;
    }
}