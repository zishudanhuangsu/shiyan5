package com.example.shiyan5;
import android.os.Bundle;
import android.preference.PreferenceFragment;
/**
 * Created by 紫薯 on 2018/4/28.
 */

public class FragmentPreferences extends PreferenceFragment {
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }

}