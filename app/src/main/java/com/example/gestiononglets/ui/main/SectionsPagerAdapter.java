package com.example.gestiononglets.ui.main;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.gestiononglets.R;

import java.util.Locale;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        switch (position) {
            case 0:
                return SeasonFragment.newInstance(0, mContext.getString(R.string.titre_spring), R.drawable.spring);
            case 1:
                return SeasonFragment.newInstance(1, mContext.getString(R.string.titre_summer), R.drawable.summer);
            case 2:
                return SeasonFragment.newInstance(2, mContext.getString(R.string.titre_autumn), R.drawable.autumn);
            case 3:
                return SeasonFragment.newInstance(2, mContext.getString(R.string.titre_winter), R.drawable.winter);
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return mContext.getString(R.string.titre_spring).toUpperCase(l);
            case 1:
                return mContext.getString(R.string.titre_summer).toUpperCase(l);
            case 2:
                return mContext.getString(R.string.titre_autumn).toUpperCase(l);
            case 3:
                return mContext.getString(R.string.titre_winter).toUpperCase(l);
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }
}