package appewtc.masterung.prayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by masterUNG on 10/2/15 AD.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context objContext;
    private int iconAnInt;
    private String[] titleStrings;

    public MyAdapter(Context objContext, int iconAnInt, String[] titleStrings) {
        this.objContext = objContext;
        this.iconAnInt = iconAnInt;
        this.titleStrings = titleStrings;
    }   // Constructor

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.content_listview, viewGroup, false);

        //Setup Icon
        //ImageView iconImageView = (ImageView) objView1.findViewById(R.id.imvListIcon);
        //iconImageView.setImageResource(iconAnInt);

        //Setup Title
        TextView titleTextView = (TextView) objView1.findViewById(R.id.txtListTitle);
        titleTextView.setText(Integer.toString(i+1)+ ". " + titleStrings[i]);

        return objView1;
    }   // getView

}   // Main Class
