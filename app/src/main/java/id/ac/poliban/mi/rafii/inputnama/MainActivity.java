package id.ac.poliban.mi.rafii.inputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    private void initComponents() {
        EditText etIsi = findViewById(R.id.etIsi);
        Button btTampil = findViewById(R.id.btTampil);

        btTampil.setOnClickListener(v -> {
            Toast.makeText(this, "Selamat Datang " + etIsi.getText().toString(),Toast.LENGTH_LONG);
        });
    }
}