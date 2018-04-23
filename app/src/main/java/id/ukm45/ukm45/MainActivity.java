package id.ukm45.ukm45;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

import id.ukm45.ukm45.adapter.CategoryListAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Daftar Kategori");
        toolbar.setSubtitle("Silahkan Pilih Kategori");
        setSupportActionBar(toolbar);
        ArrayList<String> list = new ArrayList<String>();
        list.add("Pertanian");
        list.add("Kesehatan");
        list.add("Pariwisata");
        list.add("Kosmetik");
        list.add("Elektronik");
        list.add("Pendidikan");
        list.add("Olahan Makanan");
        list.add("Kerajinan");
        list.add("Industri Rumahan");
        list.add("Serba Serbi");

        CategoryListAdapter adapter = new CategoryListAdapter(list,this);

        ListView lvCategory = (ListView) findViewById(R.id.lvCategory);
        lvCategory.setAdapter(adapter);
    }
}
