package com.example.videoplayer;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayerActivity extends AppCompatActivity {
    private VideoView mVideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        mVideoView = findViewById(R.id.videoView);

        View decorView = getWindow().getDecorView();
        int uiOption = View.SYSTEM_UI_FLAG_FULLSCREEN;

        decorView.setSystemUiVisibility(uiOption);

        getSupportActionBar().hide();

        mVideoView.setMediaController(new MediaController(this));
        mVideoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video);
        mVideoView.start();
    }
}