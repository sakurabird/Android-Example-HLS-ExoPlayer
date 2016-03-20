package com.sakurafish.exam.hls.exoplayer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void onSampleSelected(Samples.Sample sample) {
        Intent mpdIntent = new Intent(this, PlayerActivity.class)
                .setData(Uri.parse(sample.uri))
                .putExtra(PlayerActivity.CONTENT_ID_EXTRA, sample.contentId)
                .putExtra(PlayerActivity.CONTENT_TYPE_EXTRA, sample.type)
                .putExtra(PlayerActivity.PROVIDER_EXTRA, sample.provider);
        startActivity(mpdIntent);
    }

    public void onClick1(View view) {
        onSampleSelected(Samples.HLS[0]);
    }

    public void onClick2(View view) {
        onSampleSelected(Samples.HLS[1]);
    }

    public void onClick3(View view) {
        onSampleSelected(Samples.HLS[2]);
    }

    public void onClick4(View view) {
        onSampleSelected(Samples.HLS[3]);
    }

    public void onClick5(View view) {
        onSampleSelected(Samples.HLS[4]);
    }
}
