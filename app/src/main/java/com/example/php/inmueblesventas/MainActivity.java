package com.example.php.inmueblesventas;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity  {

    /*ImageView IMG_CONTAINER;
    private int MEDIA_CODE =123;
    private int CAMERA_CODE = 123;*/
    private int BTN_REG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

     /*   FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });*/

        LoadComponents();
    }

    private void LoadComponents() {
        //Button media = (Button)this.findViewById((R.id.media));
        //Button foto = (Button)this.findViewById((R.id.media));

       /* Button btn_reg = (Button) findViewById(R.id.btn_reg);
        btn_reg.setOnClickListener(this);*/

        // IMG_CONTAINER= (ImageView)this.findViewById(R.id.photoView);


        //   media.setOnClickListener(this);
        //  media.setOnClickListener((this));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
/*
    @Override
    public void onClick(View v)

        if (v.getId()== R.id.btn_reg)
        {
            setContentView(R.layout.registrar_usuario);
        }
  /*      if( v.getId()== R.id.media){
            LoadMediaDarta();

        }
        if( v.getId()== R.id.media){
            LoadCamaraData();
        }*/

    //MEDIA DARTA Y CAMAR ENTRA A OVERRIDE QUE es activity result


   /* private void LoadMediaDarta() {

        Intent media = new Intent(Intent.ACTION_GET_CONTENT, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        media.setType("image/");
        startActivityForResult(media.createChooser(media,"escoja la aplicacion"), MEDIA_CODE);
    }
    private void LoadCamaraData(){

        Intent camara = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(camara,CAMERA_CODE);

    }
    //para cargar la imagen en bd mas o menos
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == MEDIA_CODE){
            IMG_CONTAINER.setImageURI(data.getData());
        }
        if(requestCode == CAMERA_CODE){
            //ALGO MAS
        }
    }*/



