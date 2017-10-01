package luthra.harshit.tutorialactivity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class Tutorial extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addFragment( new Step.Builder().setTitle("Money Title")
        .setContent("Money Content")
        .setSummary("Summary")
                .setDrawable(R.drawable.ic_attach_money_black_24dp)
                .setBackgroundColor(R.color.colorPrimary)
                .build()
        );
        addFragment( new Step.Builder().setTitle("Music Title")
                .setContent("Music Content")
                .setSummary("Summary")
                .setDrawable(R.drawable.ic_audiotrack_black_24dp)
                .setBackgroundColor(R.color.colorPrimary)
                .build()
        );  addFragment( new Step.Builder().setTitle("Secure Title")
                .setContent("Secure Content")
                .setSummary("Summary")
                .setDrawable(R.drawable.ic_security_black_24dp)
                .setBackgroundColor(R.color.colorPrimary)
                .build()
        );
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.prev:
                Toast.makeText(getApplicationContext(),"Previous",Toast.LENGTH_SHORT).show();
                break;
            case R.id.next:
                Toast.makeText(getApplicationContext(),"NEXT",Toast.LENGTH_SHORT).show();
                break;



        }
    }
}
