package andorid.sample.practice_2019mar.DataBindingSample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import andorid.sample.practice_2019mar.DataBindingSample.model.Product;
import andorid.sample.practice_2019mar.DataBindingSample.model.Products;
import andorid.sample.practice_2019mar.R;
import andorid.sample.practice_2019mar.databinding.StudentUiBinding;

public class ProductUI extends AppCompatActivity {

    //data-binding
    StudentUiBinding mBinding;

    Products products;
    Product product;

    String xyz = "girish";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.student_ui);

        products = new Products();
        mBinding.setGirish(products.PRODUCTS[0]);

    }
}
