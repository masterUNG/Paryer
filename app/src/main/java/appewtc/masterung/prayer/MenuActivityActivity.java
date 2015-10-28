package appewtc.masterung.prayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MenuActivityActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit
    private ImageView menu1ImageView, menu2ImageView, menu3ImageView,
            menu4ImageView, menu5ImageView, menu6ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Bind Widget
        bindWidget();

        //Image Controller
        imageController();

    }   // onCreate

    private void imageController() {
        menu1ImageView.setOnClickListener(this);
        menu2ImageView.setOnClickListener(this);
        menu3ImageView.setOnClickListener(this);
        menu4ImageView.setOnClickListener(this);
        menu5ImageView.setOnClickListener(this);
        menu6ImageView.setOnClickListener(this);
    }

    private void bindWidget() {
        menu1ImageView = (ImageView) findViewById(R.id.imageView5);
        menu2ImageView = (ImageView) findViewById(R.id.imageView6);
        menu3ImageView = (ImageView) findViewById(R.id.imageView7);
        menu4ImageView = (ImageView) findViewById(R.id.imageView8);
        menu5ImageView = (ImageView) findViewById(R.id.imageView9);
        menu6ImageView = (ImageView) findViewById(R.id.imageView10);
    }

    @Override
    public void onClick(View view) {

        int intIndex = 0;

        switch (view.getId()) {

            case R.id.imageView5:
                intIndex = 0;
                break;
            case R.id.imageView6:
                break;
            case R.id.imageView7:
                break;
            case R.id.imageView8:
                break;
            case R.id.imageView9:
                break;
            case R.id.imageView10:
                break;
            default:
                intIndex = 0;
                break;
        }   // switch

        Intent objIntent = new Intent(MenuActivityActivity.this, ListviewActivity.class);
        objIntent.putExtra("index", intIndex);
        startActivity(objIntent);

    }   // onClick

}   // Main Class
