package appewtc.masterung.prayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class ListviewActivity extends AppCompatActivity {

    //Explicit
    private int indexAnInt, iconAnInt;
    private String[] titleStrings;
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

        //Inherited MyAdapter
        MyAdapter objMyAdapter = new MyAdapter(ListviewActivity.this, iconAnInt, titleStrings);
        contentListView.setAdapter(objMyAdapter);

        contentListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //Intent to ResultActivity
                Intent objIntent = new Intent(ListviewActivity.this, ResultActivity.class);
                objIntent.putExtra("index", i);
                startActivity(objIntent);
            }
        });

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
                titleStrings = getResources().getStringArray(R.array.contentltitle);
                break;
            case 1:
                strTitle = getResources().getString(R.string.content2);
                iconAnInt = R.drawable.content2;
                titleStrings = getResources().getStringArray(R.array.title_content2);
                break;
            case 2:
                strTitle = getResources().getString(R.string.content3);
                iconAnInt = R.drawable.content3;
                titleStrings = getResources().getStringArray(R.array.title_content3);
                break;
            default:
                strTitle = "Nothing";
                iconAnInt = R.drawable.content1;
                titleStrings = getResources().getStringArray(R.array.contentltitle);
                break;
        }   // switch

        titleTextView.setText(strTitle);

    }   // receiveFromIntent

}   // Main Class
