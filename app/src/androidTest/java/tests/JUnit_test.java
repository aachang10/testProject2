package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.allen.testproject.MainActivity;
import com.example.allen.testproject.R;

/**
 * Created by allen on 2016/4/18.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{

    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World", tester);
    }
}
