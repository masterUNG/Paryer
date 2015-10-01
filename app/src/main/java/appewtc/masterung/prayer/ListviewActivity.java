package appewtc.masterung.prayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ListviewActivity extends AppCompatActivity {

    //Explicit
    private int indexAnInt;
    private String[] title1Strings, title2Strings, title3Strings,
            content1Strings, content2Strings, content3Strings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        //Receive From Intent
        receiveFromIntent();

    }   // onCreate

    private void receiveFromIntent() {

        indexAnInt = getIntent().getIntExtra("index", 0);
        Log.d("Prayer", "index ==> " + Integer.toString(indexAnInt));

    }   // receiveFromIntent

}   // Main Class
