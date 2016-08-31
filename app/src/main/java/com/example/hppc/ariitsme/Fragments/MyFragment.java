package com.example.hppc.ariitsme.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hppc.ariitsme.R;

/**
 * Created by HP PC on 8/31/2016.
 */
public class MyFragment extends Fragment {
    public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";
    public static final MyFragment newInstance(String message)
    {
        MyFragment f = new MyFragment();
        Bundle bdl = new Bundle(1);
        bdl.putString(EXTRA_MESSAGE, message);
        f.setArguments(bdl);
        return f;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String message = getArguments().getString(EXTRA_MESSAGE);
        View v = inflater.inflate(R.layout.myfragment_layout, container, false);
        TextView messageTextView = (TextView) v.findViewById(R.id.tv1);
        //TextView messageTextView2 = (TextView) v.findViewById(R.id.tv2);
        messageTextView.setText(message);
//        TextView tvTitle = (TextView) v.findViewById(R.id.tvTitle);
//        tvTitle.setText("Fragment #" + mPage);
        return v;
    }
}
