package com.sjy.nerdlauncher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class NerdLauncerActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return NerdLauncherFragment.newInstance();
    }
}
