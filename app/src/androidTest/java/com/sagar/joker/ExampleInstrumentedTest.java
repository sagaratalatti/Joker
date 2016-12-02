package com.sagar.joker;

import android.app.Application;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ApplicationTestCase;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest extends ApplicationTestCase<Application> {

    public ExampleInstrumentedTest() {
        super(Application.class);
    }

    @Test
    public void testJoke() throws ExecutionException, InterruptedException {
        JokesTask testJoke = new JokesTask(new JokesTask.Callback() {
            @Override
            public void onFinished(String result) {

            }
        });
        testJoke.execute();
        String joke = testJoke.get();
        assertNotNull(joke);
    }
}
