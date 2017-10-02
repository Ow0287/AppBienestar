package com.misena.oscar.appbienestar;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.widget.MediaController;
import android.widget.VideoView;


public class Himno extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the layout from video_main.xml
        setContentView(R.layout.activity_himno);

        VideoView videoView = (VideoView) findViewById(R.id.VideoView);



        Uri path = Uri.parse("android.resource://com.misena.oscar.appbienestar/"
                + R.raw.himnosena);



//AMPLIACIÓN
        MediaController mc = new MediaController(this);
        videoView.setMediaController(mc);



        videoView.setVideoURI(path);
        videoView.start();
    }

}


