package com.example.david.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

// based on https://guides.codepath.com/android/google-play-style-tabs-using-tablayout#sliding-tabs-layout
public class InfoFragment extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static InfoFragment newInstance(int page) {
        Log.v("InfoFragment", "page is " + page);
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        InfoFragment fragment = new InfoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);
        InfoAdapter infoAdapter = new InfoAdapter(getActivity(), InfoData.GetInfos(mPage));
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(infoAdapter);
        return view;
    }
}