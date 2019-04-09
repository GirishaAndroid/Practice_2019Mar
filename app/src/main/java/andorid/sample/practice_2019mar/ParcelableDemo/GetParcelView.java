package andorid.sample.practice_2019mar.ParcelableDemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.sql.Struct;

public class GetParcelView extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        Student student = intent.getParcelableExtra("student");
        Log.d("ParcelableDemo ","Name="+student.name+" age="+student.age);
    }
}
