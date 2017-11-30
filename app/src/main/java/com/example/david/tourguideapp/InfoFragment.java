package com.example.david.tourguideapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

// based on https://guides.codepath.com/android/google-play-style-tabs-using-tablayout#sliding-tabs-layout
public class InfoFragment extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";
    public static final int NO_PRICE_INFORMATION = 0;
    public static final int LOW_PRICED_FOOD = -1;
    public static final int MEDIUM_PRICED_FOOD = -2;
    public static final int HIGH_PRICED_FOOD = -3;
    public static final int VERY_HIGH_PRICED_FOOD = -4;

    private int mPage;

    public static InfoFragment newInstance(int page) {
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
        InfoAdapter infoAdapter = new InfoAdapter(getActivity(), GetInfos(mPage));
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(infoAdapter);
        return view;
    }


    public ArrayList<Info> GetInfos(int page) {
        if (page == 1)
            return GetTodoInfo();
        if (page == 2)
            return GetFoodInfo();
        if (page == 3)
            return GetTravelInfo();
        return GetHotelInfo();
    }

    /* ideally this data would come from a local database or the internet
        all text and images are taken from the listed websites & TripAdvisor & http://www.phuket.com/ */


    public ArrayList<Info> GetTodoInfo() {
        ArrayList<Info> infos = new ArrayList<Info>();

        infos.add(new Info(
                getString(R.string.todo1_name),
                getString(R.string.todo1_desc),
                getString(R.string.todo1_url),
                4100,
                0,
                R.drawable.koh_pahank_sail_boat,
                R.drawable.koh_pahank_sail_boat)
        );


        infos.add(new Info(
                getString(R.string.todo2_name),
                getString(R.string.todo2_desc),
                getString(R.string.todo2_url),
                3500,
                0,
                R.drawable.offspray_leisure,
                R.drawable.offspray_leisure)
        );

        infos.add(new Info(
                getString(R.string.todo3_name),
                getString(R.string.todo3_desc),
                getString(R.string.todo3_url),
                8000,
                0,
                R.drawable.siladon,
                R.drawable.siladon)
        );

        infos.add(new Info(
                getString(R.string.todo4_name),
                getString(R.string.todo4_desc),
                getString(R.string.todo_url),
                200,
                0,
                R.drawable.healthland,
                R.drawable.healthland)
        );

        infos.add(new Info(
                getString(R.string.todo5_name),
                getString(R.string.todo5_desc),
                getString(R.string.todo5_url),
                2450,
                0,
                R.drawable.sothai,
                R.drawable.sothai)
        );

        infos.add(new Info(
                getString(R.string.todo6_name),
                getString(R.string.todo6_desc),
                getString(R.string.todo6_url),
                450,
                0,
                R.drawable.phuket_trickeye_museum,
                R.drawable.phuket_trickeye_museum)
        );

        infos.add(new Info(
                getString(R.string.todo7_name),
                getString(R.string.todo7_desc),
                getString(R.string.todo7_url),
                2200,
                0,
                R.drawable.kata,
                R.drawable.kata)
        );

        infos.add(new Info(
                getString(R.string.todo8_name),
                getString(R.string.todo8_desc),
                getString(R.string.todo8_url),
                2900,
                0,
                R.drawable.phuket_thai_cookery,
                R.drawable.phuket_thai_cookery)
        );


        infos.add(new Info(
                getString(R.string.todo9_name),
                getString(R.string.todo9_desc),
                getString(R.string.todo9_url),
                0,
                0,
                R.drawable.lard_yai,
                R.drawable.lard_yai)
        );

        return infos;
    }

    public ArrayList<Info> GetFoodInfo() {
        ArrayList<Info> infos = new ArrayList<Info>();

        infos.add(new Info(
                getString(R.string.food1_name),
                getString(R.string.food1_desc),
                getString(R.string.food1_url),
                MEDIUM_PRICED_FOOD,
                MEDIUM_PRICED_FOOD,
                R.drawable.la_dolce,
                R.drawable.la_dolce)
        );

        infos.add(new Info(
                getString(R.string.food2_name),
                getString(R.string.food2_desc),
                getString(R.string.food2_url),
                VERY_HIGH_PRICED_FOOD,
                VERY_HIGH_PRICED_FOOD,
                R.drawable.sams,
                R.drawable.sams)
        );

        infos.add(new Info(
                getString(R.string.food3_name),
                getString(R.string.food3_desc),
                getString(R.string.food3_url),
                MEDIUM_PRICED_FOOD,
                MEDIUM_PRICED_FOOD,
                R.drawable.icc,
                R.drawable.icc)
        );

        infos.add(new Info(
                getString(R.string.food4_name),
                getString(R.string.food4_desc),
                getString(R.string.food4_url),
                MEDIUM_PRICED_FOOD,
                MEDIUM_PRICED_FOOD,
                R.drawable.vista,
                R.drawable.vista)
        );

        infos.add(new Info(
                getString(R.string.food5_name),
                getString(R.string.food5_desc),
                getString(R.string.food5_url),
                LOW_PRICED_FOOD,
                LOW_PRICED_FOOD,
                R.drawable.ikroon,
                R.drawable.ikroon)
        );

        infos.add(new Info(
                getString(R.string.food6_name),
                getString(R.string.food6_desc),
                getString(R.string.food6_url),
                VERY_HIGH_PRICED_FOOD,
                VERY_HIGH_PRICED_FOOD,
                R.drawable.gritta,
                R.drawable.gritta)
        );

        infos.add(new Info(
                getString(R.string.food7_name),
                getString(R.string.food7_desc),
                getString(R.string.food7_url),
                LOW_PRICED_FOOD,
                LOW_PRICED_FOOD,
                R.drawable.halfway,
                R.drawable.halfway)
        );


        infos.add(new Info(
                getString(R.string.food8_name),
                getString(R.string.food8_desc),
                getString(R.string.food8_url),
                MEDIUM_PRICED_FOOD,
                MEDIUM_PRICED_FOOD,
                R.drawable.maru,
                R.drawable.maru)
        );

        return infos;
    }


    public ArrayList<Info> GetTravelInfo() {
        ArrayList<Info> infos = new ArrayList<Info>();

        infos.add(new Info(
                getString(R.string.trav1_name),
                getString(R.string.trav1_desc),
                getString(R.string.trav1_url),
                NO_PRICE_INFORMATION,
                NO_PRICE_INFORMATION,
                R.drawable.airport,
                R.drawable.airport)
        );


        infos.add(new Info(
                getString(R.string.trav2_name),
                getString(R.string.trav2_desc),
                getString(R.string.trav2_url),
                NO_PRICE_INFORMATION,
                NO_PRICE_INFORMATION,
                R.drawable.tuktuk,
                R.drawable.tuktuk)
        );


        infos.add(new Info(
                getString(R.string.trav3_name),
                getString(R.string.trav3_desc),
                getString(R.string.trav3_url),
                NO_PRICE_INFORMATION,
                NO_PRICE_INFORMATION,
                R.drawable.taxi,
                R.drawable.taxi)
        );


        infos.add(new Info(
                getString(R.string.trav4_name),
                getString(R.string.trav4_desc),
                getString(R.string.trav4_url),
                NO_PRICE_INFORMATION,
                NO_PRICE_INFORMATION,
                R.drawable.songtaew,
                R.drawable.songtaew)
        );

        return infos;
    }


    public ArrayList<Info> GetHotelInfo() {
        ArrayList<Info> infos = new ArrayList<Info>();

        infos.add(new Info(
                getString(R.string.hotel1_name),
                getString(R.string.hotel1_desc),
                getString(R.string.hotel1_url),
                0,
                266,
                R.drawable.amari,
                R.drawable.amari)
        );


        infos.add(new Info(
                getString(R.string.hotel2_name),
                getString(R.string.hotel2_desc),
                getString(R.string.hotel2_url),
                0,
                87,
                R.drawable.patong_mansion_hotel,
                R.drawable.patong_mansion_hotel)
        );


        infos.add(new Info(
                getString(R.string.hotel3_name),
                getString(R.string.hotel3_desc),
                getString(R.string.hotel3_url),
                0,
                260,
                R.drawable.holiday_inn,
                R.drawable.holiday_inn)
        );


        infos.add(new Info(
                getString(R.string.hotel4_name),
                getString(R.string.hotel4_desc),
                getString(R.string.hotel4_url),
                0,
                218,
                R.drawable.burasari,
                R.drawable.burasari)
        );


        infos.add(new Info(
                getString(R.string.hotel5_name),
                getString(R.string.hotel5_desc),
                getString(R.string.hotel5_url),
                0,
                187,
                R.drawable.grand_mercure,
                R.drawable.grand_mercure)
        );


        infos.add(new Info(
                getString(R.string.hotel6_name),
                getString(R.string.hotel6_desc),
                getString(R.string.hotel6_url),
                0,
                283,
                R.drawable.avista_hideaway,
                R.drawable.avista_hideaway)
        );


        infos.add(new Info(
                getString(R.string.hotel7_name),
                getString(R.string.hotel7_desc),
                getString(R.string.hotel7_url),
                0,
                161,
                R.drawable.seaview_patong,
                R.drawable.seaview_patong)
        );


        infos.add(new Info(
                getString(R.string.hotel8_name),
                getString(R.string.hotel8_desc),
                getString(R.string.hotel8_url),
                0,
                197,
                R.drawable.novotel_phuket,
                R.drawable.novotel_phuket)
        );

        return infos;
    }
}