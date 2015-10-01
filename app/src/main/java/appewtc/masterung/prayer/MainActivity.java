package appewtc.masterung.prayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit
    private ImageView content1ImageView, content2ImageView,
            content3ImageView, content4ImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Image Controller
        imageController();

    }   // onCreate

    private void imageController() {

        content1ImageView.setOnClickListener(this);
        content2ImageView.setOnClickListener(this);
        content3ImageView.setOnClickListener(this);
        content4ImageView.setOnClickListener(this);

    }   // imageController

    private void bindWidget() {

        content1ImageView = (ImageView) findViewById(R.id.imageView);
        content2ImageView = (ImageView) findViewById(R.id.imageView2);
        content3ImageView = (ImageView) findViewById(R.id.imageView3);
        content4ImageView = (ImageView) findViewById(R.id.imageView4);

    }   // bindWidget

    @Override
    public void onClick(View view) {

        int intImage = 0;

        switch (view.getId()) {
            case R.id.imageView:
                intImage = 0;
                break;
            case R.id.imageView2:
                intImage = 1;
                break;
            case R.id.imageView3:
                intImage = 2;
                break;
            case R.id.imageView4:

                startActivity(new Intent(this, AboutMeActivity.class));

                break;
            default:
                intImage = 0;
                break;

        }   // switch

        //Intent to ListviewActivity
        intentToListView(intImage);

    }   // onClick

    private void intentToListView(int intImage) {

        Intent objIntent = new Intent(MainActivity.this, ListviewActivity.class);
        objIntent.putExtra("index", intImage);
        startActivity(objIntent);

    }   // intent to ListView

}   // Main Class
