package mvvm;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.shixin_pc.framework.R;

/**
 * Created by shixin-pc on 2018/6/10.
 */

public class MvvmActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mvc_layout);
    }
}
