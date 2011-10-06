package com.example;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.widget.TextView;

import com.xtremelabs.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MyActivityTest {

	private MyActivity activity;
	
	@Before
	public void setup() throws Exception {
        activity = new MyActivity();
        activity.onCreate(null);
	}
	
    @Test
    public void shouldHaveHappySmiles() throws Exception {
        String hello = activity.getResources().getString(R.string.hello);
        assertThat(hello, equalTo("Hello World, MyActivity!"));
    }

    @Test
    public void shouldHaveTextViewWithHello() throws Exception {
    	String hello1 =  ((TextView) activity.findViewById(android.R.id.text1)).getText().toString();
    	String hello2 = activity.getResources().getString(R.string.hello);
    	assertThat(hello1, equalTo(hello2));
    }
}
