package com.martin.martinhttp;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.martin.httplib.RxMartinHttp;
import com.martin.httplib.download.DownloadObserver;

import java.io.File;

import io.reactivex.disposables.Disposable;


public class TestActivity extends AppCompatActivity {


    private Dialog loading_dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        String path = "http://dspbj.swochina.com/resource/ad/551517996780.mp4";
        final String fileName = path.substring(path.lastIndexOf("/") + 1, path.length());
        RxMartinHttp.downloadFile(path)
                .subscribe(new DownloadObserver(fileName) {
                    @Override
                    protected void getDisposable(Disposable d) {

                    }

                    @Override
                    protected void onError(String errorMsg) {
                        Log.e("aaaa", errorMsg);
                    }

                    @Override
                    protected void onSuccess(long bytesRead, long contentLength, float progress, boolean done, String filePath) {
                        Log.e("aaaa", "contentLength:" + contentLength + "\n bytesRead:" + bytesRead);
                        if (done) {
                            Log.e("aaaa", filePath);
                            File file = new File(filePath);
                            if (file.exists()) {
                                Log.e("aaaa", "exist");
                            }
                        }
                    }
                });
    }
}
