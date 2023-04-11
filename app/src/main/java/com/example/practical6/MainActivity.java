package com.example.practical6;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    Button button1, button2, start, stop, pause;
    MediaPlayer mpCricket, mpRain;
    String soundName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.btnCrickets);
        button1.setOnClickListener(bCrickets);
        button2 = (Button) findViewById(R.id.btnRain);
        button2.setOnClickListener(bRain); //Sets butttons to linked methods
        start = (Button) findViewById(R.id.btnPlay);
        start.setOnClickListener(bStart);
        stop = (Button) findViewById(R.id.btnStop);
        stop.setOnClickListener(bStop);
        pause = (Button) findViewById(R.id.btnPause);
        pause.setOnClickListener(bPause);

        mpCricket = new MediaPlayer();
        mpCricket = MediaPlayer.create(this, R.raw.audio_hero_amazonjungleambient312);
        mpRain = new MediaPlayer(); //Creates media
        mpRain = MediaPlayer.create(this, R.raw.pm_6_rain_aftermath_drippy_ortf_pcmd100);
    }

    Button.OnClickListener bCrickets = new Button.OnClickListener()
    {
        @Override
        public void onClick (View v) //The sound starts when user presses
        {
            soundName = "Crickets";
            mpCricket.start();
        }
    };

    Button.OnClickListener bRain = new Button.OnClickListener()
    {
        @Override
        public void onClick (View v) //The sound starts when user presses
        {
            soundName = "Rain";
            mpRain.start();
        }
    };

    Button.OnClickListener bStop = new Button.OnClickListener()
    {
        @Override
        public void onClick (View v) //The sound stops when user presses
        {
            if(soundName == "Crickets")
            {
                mpCricket.stop();
            }
            else if(soundName == "Rain")
            {
                mpRain.stop();
            }
        }
    };

    Button.OnClickListener bPause = new Button.OnClickListener()
    {
        @Override
        public void onClick (View v) //The sound pauses when user presses
        {
            if(soundName == "Crickets")
            {
                mpCricket.pause();
            }
            else if(soundName == "Rain")
            {
                mpRain.pause();
            }
        }
    };

    Button.OnClickListener bStart = new Button.OnClickListener()
    {
        @Override
        public void onClick (View v) //The sound starts when user presses
        {
            if(soundName == "Crickets")
            {
                mpCricket.start();
            }
            else if(soundName == "Rain")
            {
                mpRain.start();
            }
        }
    };

}