package andorid.sample.practice_2019mar.ParcelableDemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class PutParcelViewClass extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Student student = new Student("Girish", 32);
        Intent intent = new Intent(this, GetParcelView.class);
        intent.putExtra("student",student);
        startActivity(intent);
    }
}
