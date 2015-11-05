package com.deliCoin2.demo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by RUTH on 15/10/30.
 */
public class Util {

    public static Drawable getDrawableImage(String url)
    {
        Drawable response = null;

        Bitmap bitmap = Util.downloadFile(url);



        return response;
    }

    public static Bitmap downloadFile(String imageHttpAddress) {

        Bitmap loadedImage = null;
        URL imageUrl = null;
        try {
            imageUrl = new URL(imageHttpAddress);
            HttpURLConnection conn = (HttpURLConnection) imageUrl.openConnection();
            conn.connect();
            loadedImage = BitmapFactory.decodeStream(conn.getInputStream());
            //imageView.setImageBitmap(loadedImage);
        } catch (IOException e) {
            //Toast.makeText(getApplicationContext(), "Error cargando la imagen: " + e.getMessage(), Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
        return loadedImage;
    }
}
