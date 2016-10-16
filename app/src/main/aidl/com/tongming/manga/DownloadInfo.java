package com.tongming.manga;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Author: Tongming
 * Date: 2016/9/7
 */

public class DownloadInfo implements Parcelable {
    private int _id;
    private int comic_id;
    private String comic_name;
    private String comic_url;
    private String chapter_name;
    private String chapter_url;
    private String cover;
    private String comic_source;
    private int status;
    private int position;
    private int total;
    private int create_time;

    public void setComic_source(String comic_source) {
        this.comic_source = comic_source;
    }

    public String getComic_source() {

        return comic_source;
    }

    public void setComic_id(int comic_id) {
        this.comic_id = comic_id;
    }

    public int getComic_id() {

        return comic_id;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCover() {

        return cover;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void setComic_name(String comic_name) {
        this.comic_name = comic_name;
    }

    public void setComic_url(String comic_url) {
        this.comic_url = comic_url;
    }

    public void setChapter_name(String chapter_name) {
        this.chapter_name = chapter_name;
    }

    public void setChapter_url(String chapter_url) {
        this.chapter_url = chapter_url;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setCreate_time(int create_time) {
        this.create_time = create_time;
    }

    public int get_id() {

        return _id;
    }

    public String getComic_name() {
        return comic_name;
    }

    public String getComic_url() {
        return comic_url;
    }

    public String getChapter_name() {
        return chapter_name;
    }

    public String getChapter_url() {
        return chapter_url;
    }

    public int getStatus() {
        return status;
    }

    public int getPosition() {
        return position;
    }

    public int getTotal() {
        return total;
    }

    public int getCreate_time() {
        return create_time;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this._id);
        dest.writeInt(this.comic_id);
        dest.writeString(this.comic_name);
        dest.writeString(this.comic_url);
        dest.writeString(this.chapter_name);
        dest.writeString(this.chapter_url);
        dest.writeString(this.cover);
        dest.writeInt(this.status);
        dest.writeInt(this.position);
        dest.writeInt(this.total);
        dest.writeInt(this.create_time);
    }

    public DownloadInfo() {
    }

    protected DownloadInfo(Parcel in) {
        this._id = in.readInt();
        this.comic_id = in.readInt();
        this.comic_name = in.readString();
        this.comic_url = in.readString();
        this.chapter_name = in.readString();
        this.chapter_url = in.readString();
        this.cover = in.readString();
        this.status = in.readInt();
        this.position = in.readInt();
        this.total = in.readInt();
        this.create_time = in.readInt();
    }

    public static final Creator<DownloadInfo> CREATOR = new Creator<DownloadInfo>() {
        @Override
        public DownloadInfo createFromParcel(Parcel source) {
            return new DownloadInfo(source);
        }

        @Override
        public DownloadInfo[] newArray(int size) {
            return new DownloadInfo[size];
        }
    };
}