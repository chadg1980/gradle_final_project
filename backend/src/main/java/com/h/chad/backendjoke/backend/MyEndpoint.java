/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.h.chad.backendjoke.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.alljokes.ChadJokeClass;

import javax.inject.Named;

import sun.rmi.runtime.Log;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.backendjoke.chad.h.com",
                ownerName = "backend.backendjoke.chad.h.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /**
     * A simple endpoint method that takes a name and says Hi back
     */
    @ApiMethod(name = "jokeBackend")
    public MyBean sayHi() {
        MyBean response = new MyBean();
        ChadJokeClass jokeClass = new ChadJokeClass();
        String jokeToReturn = jokeClass.punchLine();
        response.setData(jokeToReturn );

        return response;
    }


}
