package com.example.david.tourguideapp;

import android.content.Context;
import android.graphics.Paint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter<Info> {

    public InfoAdapter(Context context, ArrayList<Info> infos) {
        super(context, 0, infos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.info_item, parent, false);
        }

        Info currentInfo = getItem(position);

        LinearLayout summary = (LinearLayout) listItemView.findViewById(R.id.summary);
        summary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LinearLayout extended = (LinearLayout) ((LinearLayout) view.getParent()).findViewById(R.id.extended);
                if (extended.getVisibility() == View.GONE) {
                    extended.setVisibility(View.VISIBLE);
                    setImageViewImageResource(view, R.id.arrow, R.drawable.ic_arrow_drop_up_white_36dp);
                    int position = ((ListView) view.getParent().getParent()).getPositionForView(view);
                    ((ListView) view.getParent().getParent()).setSelection(position);
                } else {
                    extended.setVisibility(View.GONE);
                    setImageViewImageResource(view, R.id.arrow, R.drawable.ic_arrow_drop_down_white_36dp);
                }
            }
        });

        setImageViewImageResource(listItemView, R.id.thumbnail, currentInfo.getThumbnail());
        setImageViewImageResource(listItemView, R.id.hero_image, currentInfo.getHeroImage());
        setTextViewText(listItemView, R.id.title, currentInfo.getTitle());
        setTextViewText(listItemView, R.id.description, currentInfo.getDescription());
        displayPricing(listItemView, currentInfo.getBaht(), currentInfo.getDollars());

        TextView urlTextView = (TextView) listItemView.findViewById(R.id.url);
        urlTextView.setPaintFlags(urlTextView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        urlTextView.setOnClickListener(new UrlOnClickListener(currentInfo.getUrl()));

        return listItemView;
    }

    private void setImageViewImageResource(View view, int imageViewId, int imageId) {
        ImageView imageView = (ImageView) view.findViewById(imageViewId);
        if (imageView != null)
            imageView.setImageResource(imageId);
    }

    private void setTextViewText(View view, int textViewId, String value) {
        TextView textView = (TextView) view.findViewById(textViewId);
        textView.setVisibility(View.VISIBLE);
        if (textView != null)
            textView.setText(value);
    }

    private void hideTextView(View view, int textViewId) {
        TextView textView = (TextView) view.findViewById(textViewId);
        textView.setVisibility(View.GONE);
    }

    private void displayPricing(View listItemView, int baht, int dollars) {
        if (baht == InfoData.NO_PRICE_INFORMATION && dollars == InfoData.NO_PRICE_INFORMATION) {
            hideTextView(listItemView, R.id.baht);
            hideTextView(listItemView, R.id.dollars);
        } else if (baht < 0) {
            Log.v("Info Adapter", "Baht " + baht);
            if (baht == InfoData.LOW_PRICED_FOOD) {
                setTextViewText(listItemView, R.id.baht, "฿ - ฿฿");
            } else if (baht == InfoData.MEDIUM_PRICED_FOOD) {
                setTextViewText(listItemView, R.id.baht, "฿฿ - ฿฿฿");
            } else if (baht == InfoData.HIGH_PRICED_FOOD) {
                setTextViewText(listItemView, R.id.baht, "฿฿฿ - ฿฿฿฿");
            } else if (baht == InfoData.VERY_HIGH_PRICED_FOOD) {
                setTextViewText(listItemView, R.id.baht, "฿฿฿฿");
            } else {
                setTextViewText(listItemView, R.id.baht, "?");
            }
        } else {
            setTextViewText(listItemView, R.id.baht, "฿" + Integer.toString(baht));
            setTextViewText(listItemView, R.id.dollars, "$" + Integer.toString(dollars));
        }
    }
}
