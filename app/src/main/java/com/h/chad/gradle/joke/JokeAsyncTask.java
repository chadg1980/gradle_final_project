package com.h.chad.gradle.joke;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Pair;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.h.chad.backendjoke.backend.myApi.MyApi;
import com.h.chad.chadjokeandroidlibrary.displayJokeActivity;

import java.io.IOException;

/**
 * Created by chad on 8/22/2017.
 */

public class JokeAsyncTask extends AsyncTask<Pair<Context, String>, Void, String> {

    private Context context;
    private static MyApi myApiService = null;

    @Override
    protected String doInBackground(Pair<Context, String>... pairs) {
        if(myApiService == null){ //Only do this once
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    //option for running against local devappserver
            // -10.0.2.2 is localhost's ip address in Android Emulator
            // - turn off compression when running again local devappserver
            .setRootUrl("http://10.0.2.2:8080/_ah/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> request)
                                throws IOException {
                            request.setDisableGZipContent(true);

                        }
                    });
            // end option for devop server
            myApiService = builder.build();
        }
        context = pairs[0].first;
        String name = pairs[0].second;
        try {
            return myApiService.sayHi(name).execute().getData();
        }catch (IOException e){
            return e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String thisJoke) {
        displayJokeActivity.jokeIntent(thisJoke, context);
    }
}
