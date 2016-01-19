package com.example.ramya;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.MyMusicPlayer.R;
import com.example.ramya.model.Song;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by ramyashenoy on 1/18/16.
 */
public class SongAdapter extends BaseAdapter {

    private ArrayList<Song> songs;
    private LayoutInflater songInf;

    public SongAdapter(Context c, ArrayList<Song> songs) {
        this.songs = songs;
        this.songInf = LayoutInflater.from(c);
    }

    @Override
    public int getCount() {
        return songs.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout songLay = (LinearLayout) songInf.inflate(R.layout.song, parent, false);
        TextView songView = (TextView)songLay.findViewById(R.id.song_title);
        TextView artistView = (TextView) songLay.findViewById(R.id.song_artist);
        Song currSong = songs.get(position);
        songView.setText(currSong.getTitle());
        artistView.setText(currSong.getArtist());
        songLay.setTag(position);
        return songLay;
    }
}
