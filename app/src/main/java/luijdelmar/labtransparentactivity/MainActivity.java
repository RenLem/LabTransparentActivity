package luijdelmar.labtransparentactivity;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView toTransparent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        final FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setForegroundGravity(Gravity.CENTER_HORIZONTAL);
        frameLayout.setMeasureAllChildren(true);

        //Hide Action Bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        //Set up full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(frameLayout);

        final LayoutInflater layoutInflater = getLayoutInflater();
        layoutInflater.inflate(R.layout.activity_main, frameLayout);

        toTransparent = findViewById(R.id.tks_to_transparent);

        toTransparent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutInflater.inflate(R.layout.activity_transparent, frameLayout);

            }
        });
    }
}
