package ow.wilson.bluetoothaudiovideorecord;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Wilson Ow on 5/1/2017.
 */

public class CameraActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        if (null == savedInstanceState) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, Camera2BasicFragment.newInstance())
                    .commit();
        }
    }

}
