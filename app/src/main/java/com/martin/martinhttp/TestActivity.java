package com.martin.martinhttp;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.martin.httplib.RxMartinHttp;
import com.martin.httplib.observers.CommonObserver;
import com.martin.httplib.utils.Transformer;


public class TestActivity extends AppCompatActivity {


    private Dialog loading_dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        loading_dialog = new AlertDialog.Builder(this).setMessage("jiazaizhong").create();
        final TextView tvTest = findViewById(R.id.tvTest);
        loading_dialog = new AlertDialog.Builder(this).setMessage("loading...").create();
        RxMartinHttp.createApi(ApiServices.class).getPlayingMovies("0df993c66c0c636e29ecbb5344252a4a")
                .compose(Transformer.<Movies>switchObservableSchedulers(loading_dialog))
                .subscribe(new CommonObserver<Movies>() {
                    @Override
                    protected void onError(String errorMsg) {

                    }

                    @Override
                    protected void onSuccess(Movies movies) {
                        if (movies.getEntries() != null && movies.getEntries().size() > 0) {

                            for (Movies.EntriesBean beanean : movies.getEntries()) {
                                tvTest.append(beanean.getTitle()+"   "+beanean.getStars()+"\n");
                            }

                        }
                    }
                });

    }
}
