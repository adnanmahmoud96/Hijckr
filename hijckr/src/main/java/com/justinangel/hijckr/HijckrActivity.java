package com.justinangel.hijckr;

import android.app.Activity;

public class HijckrActivity extends Activity {
    private ClassLoader cachedClassLoaderWrapper;

    @Override
    public ClassLoader getClassLoader() {
        if (cachedClassLoaderWrapper == null) {
            cachedClassLoaderWrapper = new HijckrClassLoader(super.getClassLoader());
        }

        return cachedClassLoaderWrapper;
    }
}
