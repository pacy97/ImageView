
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by sunith on 16-10-2017.
 */

public class ImageView extends AppCompatActivity  {
    ImageView imv;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageview);
        imv = (ImageView) findViewById(R.id.imagev);
        imv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  Toast.makeText(ImageView.this, "You have Clicked the ImageView", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
