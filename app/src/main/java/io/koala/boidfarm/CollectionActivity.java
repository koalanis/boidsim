package io.koala.boidfarm;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;


public class CollectionActivity extends AppCompatActivity {

    private ListView lv;
    public List<ObjModel> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);

        models = new ArrayList<>();
        models.add(new ObjModel("Bunny", true));
//        models.add(new ObjModel("Dragon", true));
        models.add(new ObjModel("Triangle", true));
//        models.add(new ObjModel("Sphere", true));

//        ObjListAdapter adapter = new ObjListAdapter(this, models);

//        lv = (ListView) findViewById(R.id.list_view);
//        lv.setAdapter(adapter);

        showSnackbar(lv, "Select a 3D model");
    }

    @Override
    protected void onResume(){
        super.onResume();
        showSnackbar(lv, "Select a 3D model");
    }

    public static void showSnackbar(View v, String text){
        Snackbar.make(v, text, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}
