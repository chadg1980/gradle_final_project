package joke;

/**
 * Created by chad on 8/23/2017.
 */

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.h.chad.gradle.joke.MainActivity;

import org.junit.Rule;
import org.junit.Test;
@org.junit.runner.RunWith(AndroidJUnit4.class)
public class testing {
    private static final String TAG = testing.class.getName();
    @Test
    public void veryTestIsWorking(){
        Log.d(TAG, "Hello World from the testing block");
        assert MainActivity.helloWorld().equals("Hello World");

    }

}
