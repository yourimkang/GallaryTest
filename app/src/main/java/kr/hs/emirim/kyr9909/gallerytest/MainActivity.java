package kr.hs.emirim.kyr9909.gallerytest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Gallery gallery;
    ImageView imgMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gallery=(Gallery)findViewById(R.id.gallery);
        imgMain=(ImageView)findViewById(R.id.imgv_main);
        MyGalleryAdapter adapter = new MyGalleryAdapter(this);
        gallery.setAdapter(adapter);
    }

    public class MyGalleryAdapter extends BaseAdapter {
        Context context;
        int[] posterIDs={R.drawable.mark1,R.drawable.mark2,R.drawable.mark3,R.drawable.mark4,R.drawable.mark5,R.drawable.mark6,R.drawable.mark7,R.drawable.mark8,
                R.drawable.mark9,R.drawable.mark10};

        public MyGalleryAdapter(Context context) {
            this.context=context;
        }

        public int getCount()
        {
            return posterIDs.length;
        }

        public View getView(int position, View convertView, ViewGroup parent)
        {
            ImageView imgV=new ImageView(context);
            imgV.setLayoutParams(new Gallery.LayoutParams(200,300));
            imgV.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imgV.setPadding(5,5,5,5);
            imgV.setImageResource(posterIDs[position]);
            return imgV;
        }

        public long getItemId(int position) {
            return 0;
        }

        public Object getItem(int position) {
            return null;
        }
    }
}
