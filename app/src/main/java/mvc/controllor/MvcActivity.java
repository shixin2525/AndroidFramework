package mvc.controllor;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.example.shixin_pc.framework.R;
import com.lzy.okgo.callback.AbsCallback;
import com.lzy.okgo.model.Response;

import mvc.model.DataBean;
import mvc.model.MvcModel;

/**
 * Created by shixin-pc on 2018/6/10.
 */

public class MvcActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mvc_layout);
        final TextView contentTv = findViewById(R.id.mvc_tv_content);
        MvcModel.singleton().requestData(new AbsCallback<DataBean>() {
            @Override
            public void onSuccess(Response<DataBean> response) {
                contentTv.setText("请求失败");
            }

            @Override
            public DataBean convertResponse(okhttp3.Response response) throws Throwable {
                return null;
            }
        });
    }


}
