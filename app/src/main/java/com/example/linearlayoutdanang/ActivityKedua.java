package com.example.linearlayoutdanang;
import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityKedua extends AppCompatActivity {
    TextView txEmail, txPassword;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        txEmail = findViewById(R.id.tvEmail);
        txPassword = findViewById(R.id.tvPassword);
        Bundle bundle = getIntent().getExtras();
        String key;
        String email = bundle.getString("a");
        String pass = bundle.getString( "b");

        txEmail.setText(email);
        txPassword.setText(pass);
    }
}
