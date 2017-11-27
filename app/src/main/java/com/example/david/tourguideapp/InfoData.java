package com.example.david.tourguideapp;

import java.util.ArrayList;

// ideally this data would come from a local database or the internet
// all text and images are taken from the listed websites & TripAdvisor & http://www.phuket.com/
public class InfoData {

    public static final int NO_PRICE_INFORMATION = 0;
    public static final int LOW_PRICED_FOOD = -1;
    public static final int MEDIUM_PRICED_FOOD = -2;
    public static final int HIGH_PRICED_FOOD = -3;
    public static final int VERY_HIGH_PRICED_FOOD = -4;


    public static ArrayList<Info> GetInfos(int page) {
        if (page == 1)
            return GetTodoInfo();
        if (page == 2)
            return GetFoodInfo();
        if (page == 3)
            return GetTravelInfo();
        return GetHotelInfo();
    }


    public static ArrayList<Info> GetTodoInfo() {
        ArrayList<Info> infos = new ArrayList<Info>();

        infos.add(new Info(
                "Phuket Sail Tours",
                "Come aboard with us and see the best scenery in the world. Beautiful limestone formations rising straight up out of the sea... and better still, going ashore to explore the hidden lagoons (hongs), caves, and the haunted pirate lair (true, Captain Mark has seen and heard the ghost, but is waiting on directions to the treasure).",
                "http://www.phuketsailtours.com/tour_koh_panak.htm",
                4100,
                0,
                R.drawable.koh_pahank_sail_boat,
                R.drawable.koh_pahank_sail_boat)
        );


        infos.add(new Info(
                "Phuket Snorkelling by Offspray Leisure",
                "Phi Phi Daytrips: Spectacular limestone cliffs, emerald tinted lagoons, secluded coves and Phi Phi’s vast array of coral reefs and marine life await our Guests..... We are looking forward to having you aboard!",
                "http://www.phuket-snorkeling.com/",
                3500,
                0,
                R.drawable.offspray_leisure,
                R.drawable.offspray_leisure)
        );

        infos.add(new Info(
                "Sildaon Spa Phuket",
                "Siladon Spa Phuket is a beautiful hillside resort style villa, with a nice garden and pool, and beautiful views of Patong Bay. You can indulge yourself and forget the world for a few hours with a relaxing luxury spa experience.. Price is for Sildaon Bliss + 4 Hands massage",
                "http://www.siladonspaphuket.com",
                8000,
                0,
                R.drawable.siladon,
                R.drawable.siladon)
        );

        infos.add(new Info(
                "Healthland Massage Patong",
                "Specialising in traditional Thai massage, we offer all types massages as well as manicure, pedicure, foot and body scrubs, waxing and other health and beauty services.",
                "http://www.healthlandmassage.com/",
                200,
                0,
                R.drawable.healthland,
                R.drawable.healthland)
        );

        infos.add(new Info(
                "So Thai Spa",
                "You are invited to enjoy indulgent pampering, combined with relaxation for your body and your mind, and served to you in our tastefully decorated day spa in Phuket (Patong). Price is for 2 hour 4 hands massage",
                "http://www.sothaispaphuket.com/",
                2450,
                0,
                R.drawable.sothai,
                R.drawable.sothai)
        );

        infos.add(new Info(
                "Phuket Trickeye Museum",
                "Trickeye museum is an interactive museum with a concept that simulates your creativity and imagination by TROMPEL'OEIL technique through your vision. The time has come when you can enter the picture, which you used to only watch and become a part of the picture yourself!",
                "http://www.phukettrickeyemuseum.com/",
                450,
                0,
                R.drawable.phuket_trickeye_museum,
                R.drawable.phuket_trickeye_museum)
        );

        infos.add(new Info(
                "Kata Thai Cooking Class",
                "Thai cooking school at Kata Beach in Phuket. Daily classes with 3 different dishes incl. a market tour.",
                "https://katathaicooking.com/",
                2200,
                0,
                R.drawable.kata,
                R.drawable.kata)
        );

        infos.add(new Info(
                "Phuket Thai Cookery School",
                "Phuket Thai Cookery School is definitely the one and only place in phuket island that offers you a haven of peace and serenity away from hustle of the city. Nestled in a prestine beach paradise on Siray beach, Phuket Thai Cookery School allows you comfort and serenity while cooking favorite Thai dishes and enjoying your home made delicious meal.",
                "http://www.phuketthaicookery.com/locations/",
                2900,
                0,
                R.drawable.phuket_thai_cookery,
                R.drawable.phuket_thai_cookery)
        );


        infos.add(new Info(
                "Sunday Walking Street Market (Lard Yai)",
                "The selection of high quality merchandise at an absolute bargain made this a treasure trove of its own. Don’t make the same mistake we did thinking we find these items elsewhere...",
                "http://www.google.com/",
                0,
                0,
                R.drawable.lard_yai,
                R.drawable.lard_yai)
        );

        return infos;
    }

    public static ArrayList<Info> GetFoodInfo() {
        ArrayList<Info> infos = new ArrayList<Info>();

        infos.add(new Info(
                "La Dolce Vita",
                "Went here last night after reading the reviews ordered spag bol (my fave) the pasta was amazing so fresh and not over cooked service was brilliant so gutted I didn't get the lamb chops somebody next to me did and they looked amazing!!",
                "https://www.nirvanaphuket.com/",
                MEDIUM_PRICED_FOOD,
                MEDIUM_PRICED_FOOD,
                R.drawable.la_dolce,
                R.drawable.la_dolce)
        );

        infos.add(new Info(
                "Sam's Steaks and Grill",
                "I must say the restaurant has a good atmosphere, and a good variety of wines. Bread and avocado crab salad were fresh and tasty. Lobster soup was salty but still edible.",
                "http://www.phuket.holiday-inn.com/sams-steakhouse.htm",
                VERY_HIGH_PRICED_FOOD,
                VERY_HIGH_PRICED_FOOD,
                R.drawable.sams,
                R.drawable.sams)
        );

        infos.add(new Info(
                "ICC Indian Curry Club",
                "A must visit in Patong. Centrally located near the Bangla road. The food was delicious, one of the best Indian meals I have ever had. The customer service, presentation and attention to detail was spot on. Would definitely return to this restaurant.",
                "http://www.indiancurryclubphuket.com/",
                MEDIUM_PRICED_FOOD,
                MEDIUM_PRICED_FOOD,
                R.drawable.icc,
                R.drawable.icc)
        );

        infos.add(new Info(
                "Vista",
                "Take a detour through Italy for pizza and pasta, or try Vista’s version of an all-time favorite, fish and chips, on a stopover in the UK. You can also share a fondue with family and friends – choose between the rich, cheesy French version or its lighter Asian counterpart.",
                "http://www.avista-hideaway-phuket-patong.com/restaurants-bars/vista/",
                MEDIUM_PRICED_FOOD,
                MEDIUM_PRICED_FOOD,
                R.drawable.vista,
                R.drawable.vista)
        );

        infos.add(new Info(
                "i-Kroon Cafe",
                "Cozy, organised, clean and amazingly fresh and tasty food... Highly recommended if you are looking for good food with affordable price!. If you are a bit tired of traditional Thai taste during your trip and you are looking for a rest... you must visit this...",
                "http://ikrooncafe.restaurantwebexperts.com/",
                LOW_PRICED_FOOD,
                LOW_PRICED_FOOD,
                R.drawable.ikroon,
                R.drawable.ikroon)
        );

        infos.add(new Info(
                "La Gritta",
                "La Gritta features an elegant design and furnishings, as well as a sumptuous contemporary menu. La Gritta at Amari Phuket offers two distinct sections La Gritta Restaurant and La Gritta Bar, with both indoor and outdoor areas, for a combined seating capacity of 100.",
                "http://www.lagritta.com/",
                VERY_HIGH_PRICED_FOOD,
                VERY_HIGH_PRICED_FOOD,
                R.drawable.gritta,
                R.drawable.gritta)
        );

        infos.add(new Info(
                "Halfway Inn",
                "The Halfway Inn is a great place to eat or to just have a drink. Dave, Nan and all the staff are so hospitable and make you feel so welcome.The food prepared by Nan is sensational and it was a pleasure to have a great meal and a few drinks on numerous occasions.",
                "http://halfwayinn.restaurantwebexperts.com/",
                LOW_PRICED_FOOD,
                LOW_PRICED_FOOD,
                R.drawable.halfway,
                R.drawable.halfway)
        );


        infos.add(new Info(
                "Maru Korean Restaurant",
                "The ox noodle soup was average, chewy meat, no flavor to the soup. They serve 5 side dishes including kimchi and a salad which had a few grains of rice in it that didn’t belong there!",
                "https://www.tripadvisor.com.au/Restaurant_Review-g297930-d6479045-Reviews-Maru_Korean_Restaurant-Patong_Kathu_Phuket.html",
                MEDIUM_PRICED_FOOD,
                MEDIUM_PRICED_FOOD,
                R.drawable.maru,
                R.drawable.maru)
        );

        return infos;
    }


    public static ArrayList<Info> GetTravelInfo() {
        ArrayList<Info> infos = new ArrayList<Info>();

        infos.add(new Info(
                "Phuket International Airport (HKT)",
                "Phuket International Airport is the second busiest airport in Thailand. Millions of passengers each year visit Phuket to enjoy a wide range of tourist services, natural beauty of the world famous Phuket beaches and fascinating tourist attractions.",
                "https://www.phuketairportonline.com/",
                NO_PRICE_INFORMATION,
                NO_PRICE_INFORMATION,
                R.drawable.airport,
                R.drawable.airport)
        );


        infos.add(new Info(
                "Tuk Tuks",
                "Taxis and Tuk Tuks in Phuket are one of the more convenient methods of getting around the island, giving you private transport directly to your destination. While they are more expensive than buses and motorbike taxis, they are much faster than the former and much more comfortable than the latter.",
                "http://www.phuket.com/phuket-magazine/taxis-and-tuk-tuks.htm",
                NO_PRICE_INFORMATION,
                NO_PRICE_INFORMATION,
                R.drawable.tuktuk,
                R.drawable.tuktuk)
        );


        infos.add(new Info(
                "Taxis and GrabTaxi App",
                "For transfer from the airport, there's only one authorized \"limousine\" service that has fixed fares. Expect to pay 100-200 Baht for a shared minibus or up to 500 baht for a private taxi, depending on your destination.",
                "http://www.phuket.com/phuket-magazine/taxis-and-tuk-tuks.htm",
                NO_PRICE_INFORMATION,
                NO_PRICE_INFORMATION,
                R.drawable.taxi,
                R.drawable.taxi)
        );


        infos.add(new Info(
                "Song Taew",
                "Phuket Local Beach Bus offers you many different routes to take you wherever you need to go, whether it’s Patong, Kata, Karon or Rawai. It is far from the fastest or most luxurious way to travel, but it’s the cheapest method of getting from Phuket Town to all the beaches.",
                "http://www.phuket.com/phuket-magazine/phuket-local-bus.htm",
                NO_PRICE_INFORMATION,
                NO_PRICE_INFORMATION,
                R.drawable.songtaew,
                R.drawable.songtaew)
        );

        return infos;
    }


    public static ArrayList<Info> GetHotelInfo() {
        ArrayList<Info> infos = new ArrayList<Info>();

        infos.add(new Info(
                "Amari Phuket",
                "Tripadvisor reviews placed Amari Phuket as one of the highest rated in Patong and i was keen to see why. I was not disappointed!",
                "https://www.amari.com/phuket/",
                0,
                266,
                R.drawable.amari,
                R.drawable.amari)
        );


        infos.add(new Info(
                "Patong Mansion Hotel",
                "The room are clean and the bed are just right to have a good night sleep .Morning breakfast includes egg , breads, juices, and cakes. Once you walk down the street on corner of the hotel, there is a 7 Eleven at the corner just 50 m is a BBQ buffet.",
                "http://patong-mansion-hotel.business.site/",
                0,
                87,
                R.drawable.patong_mansion_hotel,
                R.drawable.patong_mansion_hotel)
        );


        infos.add(new Info(
                "Holiday Inn Resort Phuket",
                "Holiday Inn Resort Phuket is an oasis in the middle of Patong and is within walking distance to shopping, restaurants and night life and just steps away from the beach. 10 minutes away from Jungeceylon shopping center, Soi Bangla Nightlife, and Patong beach is just across the road....",
                "https://www.ihg.com/holidayinnresorts/hotels/us/en/phuket/phuth/hoteldetail",
                0,
                260,
                R.drawable.holiday_inn,
                R.drawable.holiday_inn)
        );


        infos.add(new Info(
                "Burasari Resort",
                "Boutique hotel in the heart of Patong",
                "http://burasari-patong.business.site/",
                0,
                218,
                R.drawable.burasari,
                R.drawable.burasari)
        );


        infos.add(new Info(
                "Grand Mercure Phuket Patong",
                "The location is very close to a lot of great things to do within walking distance. The rooms are nice and bed was comfy. The service was outstanding! They went above and beyond!",
                "http://www.grandmercurephuketpatong.com/",
                0,
                187,
                R.drawable.grand_mercure,
                R.drawable.grand_mercure)
        );


        infos.add(new Info(
                "Avista Hideaway Phuket Patong",
                "High on a lush Patong hilltop in southwestern Phuket, overlooking two magnificent bays, sits Avista Hideaway MGallery. This 5-star boutique hotel, reminiscent of a traditional Thai village, flows like water over different levels of the hillside. ",
                "http://www.avista-hideaway-phuket-patong.com/",
                0,
                283,
                R.drawable.avista_hideaway,
                R.drawable.avista_hideaway)
        );


        infos.add(new Info(
                "Seaview Patong Hotel",
                "The glistening Andaman Sea and sandy shores of Patong Beach are just 5 meters away from our family resort in Phuket. Experience one of the most vibrant holiday destinations in Asia staying at Seaview Patong Hotel, perched at the edge of town where the beach is uncrowded and the ambiance is chilled.",
                "http://www.seaviewphuket.com/",
                0,
                161,
                R.drawable.seaview_patong,
                R.drawable.seaview_patong)
        );


        infos.add(new Info(
                "Novotel Phuket Resort",
                "Stayed here for a weekend in November. Got an upgrade the a deluxe Sea view. The room was pretty good, with a balcony and the view was out fo the world. The staff was warm and friendly. Although, one thing which I didn't like was the breakfast. We being veg had very limited options which is understandable.",
                "https://www.novotelphuket.com/",
                0,
                197,
                R.drawable.novotel_phuket,
                R.drawable.novotel_phuket)
        );

        return infos;
    }
}
