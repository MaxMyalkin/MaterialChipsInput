package com.pchmn.materialchips.model;


import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

public interface ChipInterface {

    Object getId();
    Uri getAvatarUri();
    Drawable getAvatarDrawable();
    boolean setImageTo(ImageView imageView);
    String getLabel();
    String getInfo();
}
