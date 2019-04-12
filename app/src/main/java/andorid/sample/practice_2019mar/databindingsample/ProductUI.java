package andorid.sample.practice_2019mar.databindingsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import andorid.sample.practice_2019mar.R;
import andorid.sample.practice_2019mar.databindingsample.model.Product;
import andorid.sample.practice_2019mar.databindingsample.model.Products;
import andorid.sample.practice_2019mar.databinding.StudentUiBinding;

//https://www.youtube.com/watch?v=v4XO_y3RErI&t=326s

public class ProductUI extends AppCompatActivity implements IProductUI {

    //data-binding
    StudentUiBinding mBinding;

    Products products;
    Product product;

    private final String TAG = "ProductUI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        mBinding = DataBindingUtil.setContentView(this, R.layout.student_ui);

        products = new Products();
        //Class reference pass to XML
        mBinding.setGirish(products.PRODUCTS[0]);

        //Interface reference pass to XML
        mBinding.setProductqt((IProductUI) this);

        //int pass to XML
        //mBinding.setInt(1); add variable it xml with type int

        mBinding.setImageStr("https://i.redd.it/qd9auffis0q21.jpg");

    }

    @Override
    public void showDiaglogFrag() {
        Toast.makeText(getApplicationContext(), "Listner for button", Toast.LENGTH_LONG).show();
    }
}
