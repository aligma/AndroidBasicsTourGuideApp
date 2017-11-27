package com.example.david.tourguideapp;

public class Info {

    private final double EXCHANGE_RATE = 25.29; // ideally this would come from a feed

    private String mTitle;
    private String mDescription;
    private String mUrl;
    private int mBaht;
    private int mDollars;
    private int mHeroImage;
    private int mThumbnail;

    public Info(String title, String description, String url, int baht, int dollars, int heroImage, int thumbnail) {
        mTitle = title;
        mDescription = description;
        mUrl = url;
        mBaht = baht;
        mDollars = dollars;
        mHeroImage = heroImage;
        mThumbnail = thumbnail;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    // Where Baht < 0 is a special case, but we can just return that value and let InfoAdapter handle the display
    // Where Baht == 0, but Dollars has a value, that's a special case too - we convert Dollars to Baht.
    public int getBaht() {
        return (mBaht != 0)
                ? mBaht
                : (int) (mDollars * EXCHANGE_RATE);
    }


    public void setDollars(int dollars) {
        mDollars = dollars;
    }


    // Where Dollars < 0 is a special case, but we can just return that value and let InfoAdapter handle the display
    // Where Dollars == 0, but Baht has a value, that's a special case too - we convert Baht to Dollars.
    public int getDollars() {
        return (mDollars != 0)
                ? mDollars
                : (int) (mBaht / EXCHANGE_RATE);
    }

    public void setBaht(int baht) {
        mBaht = baht;
    }

    public int getHeroImage() {
        return mHeroImage;
    }

    public void setHeroImage(int heroImage) {
        mHeroImage = heroImage;
    }

    public int getThumbnail() {
        return mThumbnail;
    }

    public void setThumbnail(int thumbnail) {
        mThumbnail = thumbnail;
    }
}
