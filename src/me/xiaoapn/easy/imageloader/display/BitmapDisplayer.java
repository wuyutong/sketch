package me.xiaoapn.easy.imageloader.display;

import me.xiaoapn.easy.imageloader.execute.LoadedFrom;
import android.graphics.Bitmap;
import android.widget.ImageView;

/**
 * 位图显示器
 */
public interface BitmapDisplayer {
	public void display(ImageView imageView, Bitmap bitmap, LoadedFrom loadedFrom);
}