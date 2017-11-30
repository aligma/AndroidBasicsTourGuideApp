package com.example.david.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class UrlOnClickListener implements View.OnClickListener {

    private String mUrl;

    public UrlOnClickListener(String url) {
        mUrl = url;
    }

    @Override
    public void onClick(View v) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(mUrl));
        v.getContext().startActivity(browserIntent);
    }
}
