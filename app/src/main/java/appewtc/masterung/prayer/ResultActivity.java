package appewtc.masterung.prayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView, detailTextView;
    private ImageView iconImageView;
    private int modeAnInt, positionAnInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //Bind Widget
        bindWidget();

        //Show View
        showView();

    }   // onCreate

    public void clickListView(View view) {
        finish();
    }

    public void clickHome(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }




    private void showView() {

        //Receive from Intent
        modeAnInt = getIntent().getIntExtra("Mode", 0);
        positionAnInt = getIntent().getIntExtra("Position", 0);

        //Show Title
        String strTitle;
        String[] strDetail = null;

        switch (modeAnInt) {
            case 0:
                strTitle = getResources().getString(R.string.content1);
                strDetail = getResources().getStringArray(R.array.contentldescription);
                break;
            case 1:
                strTitle = getResources().getString(R.string.content2);
                strDetail = getResources().getStringArray(R.array.content_content2);
                break;
            case 2:
                strTitle = getResources().getString(R.string.content3);
                strDetail = getResources().getStringArray(R.array.content_content3);
                break;
            default:
                strTitle = "Nothing";
                strDetail = null;
                break;
        }   // switch

        titleTextView.setText(strTitle);


        //Show Detail
        detailTextView.setText(strDetail[positionAnInt]);





    }   // showView

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.txtResultTitle);
        detailTextView = (TextView) findViewById(R.id.txtResultDetail);
        iconImageView = (ImageView) findViewById(R.id.imvResultIcon);
    }

}   // Main Class
