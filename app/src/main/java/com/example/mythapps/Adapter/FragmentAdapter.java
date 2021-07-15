package com.example.mythapps.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.mythapps.Fragments.calls;
import com.example.mythapps.Fragments.chat;
import com.example.mythapps.Fragments.status;

public class FragmentAdapter extends FragmentPagerAdapter {

    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new chat();
            case 1: return new status();
            case 2: return new calls();
            default: return new chat();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    //@org.jetbrains.annotations.Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if(position == 0){
            title = "CHATS";
        }
        if(position == 1){
            title = "STATUS";
        }
        if(position == 2){
            title = "CALLS";
        }
        return title;
    }
}
