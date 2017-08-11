package sg.edu.rp.webservices.p12_mydatabook;

import android.media.Image;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class AboutUs extends AppCompatActivity {

    ActionBar ab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        ImageView imageView = (ImageView)findViewById(R.id.imageView);

//        Picasso.Builder builder = new Picasso.Builder(this);
//        builder.listener(new Picasso.Listener()
//        {
//
//            @Override
//            public void onImageLoadFailed(Picasso picasso, Uri uri, Exception exception)
//            {
//                exception.printStackTrace();
//            }
//        });

//        builder.build().load("https://upload.wikimedia.org/wikipedia/commons/8/80/Republic_Polytechnic_Logo.jpg").into(imageView);

        Picasso.with(AboutUs.this)
                .load("https://upload.wikimedia.org/wikipedia/commons/8/80/Republic_Polytechnic_Logo.jpg")
                .error(R.drawable.error)
                .placeholder( R.drawable.progress_animation )
                .into( imageView );


        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

    }
}
