package joke;

/**
 * Created by chad on 8/23/2017.
 */

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.h.chad.chadjokeandroidlibrary.displayJokeActivity;
import com.h.chad.gradle.joke.MainActivity;
import com.h.chad.gradle.joke.R;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.Assert.assertNotNull;


@org.junit.runner.RunWith(AndroidJUnit4.class)
public class testing {

    MainActivity activity;
    displayJokeActivity displayJokeActivity;

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);

    private static final String TAG = testing.class.getName();
    @Test
    public void testAsycTask() {
        //When button is clicked, there should be a string that is greater than zero
        onView(withId(R.id.button_get_joke))
                .perform(click());
        assert(onView(withId(R.id.tv_theJoke)).toString().length() > 0 );







    }
}
