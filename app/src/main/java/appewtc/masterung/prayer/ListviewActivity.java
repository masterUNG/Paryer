package appewtc.masterung.prayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

public class ListviewActivity extends AppCompatActivity {

    //Explicit
    private int indexAnInt, iconAnInt;
    private String[] title1Strings, title2Strings, title3Strings,
            content1Strings, content2Strings, content3Strings;
    private TextView titleTextView;
    private ListView contentListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        //Bind Widget
        bindWidget();

        //Receive From Intent
        receiveFromIntent();

        //CreateListView
        createListView();

    }   // onCreate

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.txtShowTitle);
        contentListView = (ListView) findViewById(R.id.listView);
    }

    private void createListView() {

        //Get Title from xml
        title1Strings = getResources().getStringArray(R.array.contentltitle);
        Log.d("Prayer", "Title ==> " + Integer.toString(title1Strings.length));

        //Inherited MyAdapter
        MyAdapter objMyAdapter = new MyAdapter(ListviewActivity.this, iconAnInt, title1Strings);
        contentListView.setAdapter(objMyAdapter);

    }   // createListView

    private void receiveFromIntent() {

        indexAnInt = getIntent().getIntExtra("index", 0);
        Log.d("Prayer", "index ==> " + Integer.toString(indexAnInt));

        //Show Title
        String strTitle = null;
        switch (indexAnInt) {
            case 0:
                strTitle = getResources().getString(R.string.content1);
                iconAnInt = R.drawable.content1;
                break;
            case 1:
                strTitle = getResources().getString(R.string.content2);
                iconAnInt = R.drawable.content2;
                break;
            case 2:
                strTitle = getResources().getString(R.string.content3);
                iconAnInt = R.drawable.content3;
                break;
            default:
                strTitle = "Nothing";
                iconAnInt = R.drawable.content1;
                break;
        }   // switch

        titleTextView.setText(strTitle);

    }   // receiveFromIntent

}   // Main Class
