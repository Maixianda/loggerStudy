package com.example.loggerclient.ui.custom;

import android.databinding.BindingAdapter;
import android.text.Html;
import android.view.View;
import android.widget.TextView;


/**
 *
 */
public class CustomBindingAdapter {


    @BindingAdapter("bind:onClick")
    public static void onClick(View view, View.OnClickListener listener) {
        view.setOnClickListener(listener);
    }

    @BindingAdapter("bind:selected")
    public static void selected(View view, int id) {
        view.setSelected(view.getId() == id);
    }


    @BindingAdapter("bind:drawableLeft")
    public static void drawableLeft(TextView view, int id) {
        view.setCompoundDrawablesWithIntrinsicBounds(id, 0, 0, 0);

    }

    @BindingAdapter("bind:html")
    public static void fromHtml(TextView view, String text) {
        view.setText(Html.fromHtml(text));

    }

    @BindingAdapter("android:background")
    public static void background(View view, int color) {
        view.setBackgroundResource(color);
    }

    @android.databinding.BindingAdapter("android:visibility")
    public static void visibility(View view, int visibility) {
        switch (visibility) {
            case 0:
                view.setVisibility(View.VISIBLE);
                break;
            case 4:
                view.setVisibility(View.INVISIBLE);
                break;
            case 8:
                view.setVisibility(View.GONE);
                break;
        }
    }

    @android.databinding.BindingAdapter("android:visibility")
    public static void visibility(View view, boolean visibility) {
        if (visibility) {
            view.setVisibility(View.VISIBLE);
        } else {
            view.setVisibility(View.GONE);
        }
    }

    @BindingAdapter("android:text")
    public static void text(TextView view, long text) {
        view.setText(String.valueOf(text));
    }

    @BindingAdapter("android:text")
    public static void text(TextView view, double text) {
        view.setText(String.valueOf(text));
    }
}
