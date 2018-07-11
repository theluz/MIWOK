package com.example.android.miwok;

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Vector;

import static android.R.attr.tag;

/**
 * Created by Luz on 22/03/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorId;


    public WordAdapter(Activity context, ArrayList<Word> word, int activityColor) {
        super(context, 0, word);
        mColorId = activityColor;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentPosition = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_textview);
        miwokTextView.setText(currentPosition.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.english_textview);
        defaultTextView.setText(currentPosition.getDefaultText());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentPosition.hasImage()){
            imageView.setImageResource(currentPosition.getImageResourceId());
        }
        else{
            imageView.setVisibility(View.GONE);
        }

        View textConteiner = listItemView.findViewById(R.id.text_conteiner);
        int color = ContextCompat.getColor(getContext(), mColorId);
        textConteiner.setBackgroundColor(color);


        return (listItemView);
    }
}



