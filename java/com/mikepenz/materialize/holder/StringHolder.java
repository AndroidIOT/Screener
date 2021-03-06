package com.mikepenz.materialize.holder;

import android.content.Context;
import android.support.annotation.StringRes;
import android.widget.TextView;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public class StringHolder {
    private String mText;
    private int mTextRes = -1;

    public StringHolder(String text) {
        this.mText = text;
    }

    public StringHolder(@StringRes int textRes) {
        this.mTextRes = textRes;
    }

    public String getText() {
        return this.mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public int getTextRes() {
        return this.mTextRes;
    }

    public void setTextRes(int mTextRes) {
        this.mTextRes = mTextRes;
    }

    public void applyTo(TextView textView) {
        if (this.mText != null) {
            textView.setText(this.mText);
        } else if (this.mTextRes != -1) {
            textView.setText(this.mTextRes);
        } else {
            textView.setText(BuildConfig.FLAVOR);
        }
    }

    public boolean applyToOrHide(TextView textView) {
        if (this.mText != null) {
            textView.setText(this.mText);
            textView.setVisibility(0);
            return true;
        } else if (this.mTextRes != -1) {
            textView.setText(this.mTextRes);
            textView.setVisibility(0);
            return true;
        } else {
            textView.setVisibility(8);
            return false;
        }
    }

    public String getText(Context ctx) {
        if (this.mText != null) {
            return this.mText;
        }
        if (this.mTextRes != -1) {
            return ctx.getString(this.mTextRes);
        }
        return null;
    }

    public static void applyTo(StringHolder text, TextView textView) {
        if (text != null && textView != null) {
            text.applyTo(textView);
        }
    }

    public static boolean applyToOrHide(StringHolder text, TextView textView) {
        if (text != null && textView != null) {
            return text.applyToOrHide(textView);
        }
        if (textView == null) {
            return false;
        }
        textView.setVisibility(8);
        return false;
    }

    public String toString() {
        return this.mText;
    }
}
