// MainActivity.java
package com.example.myapplication.;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configurar la Toolbar como action bar
        setSupportActionBar(findViewById(R.id.toolbar));

        // Configurar el GridView de la galería
        GridView galleryGrid = findViewById(R.id.gallery_grid);
        galleryGrid.setAdapter(new ImageAdapter(this)); // Configurar un adaptador de imágenes
    }

    // Método para inflar el menú de opciones
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    // Manejar las opciones del menú
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_contact:
                // Acción de contacto
                return true;
            case R.id.action_about:
                // Acción acerca de
                return true;
            case R.id.action_settings:
                // Acción para configurar cuenta
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
