package mvc.controllor;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.example.shixin_pc.framework.R;
import com.google.gson.Gson;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import mvc.model.MyDataBean;
import mvc.model.MvcModel;

/**
 * Created by shixin-pc on 2018/6/10.
 */

public class MvcActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_mvc);
        final TextView contentTv = findViewById(R.id.tv_mvc_content);
        MvcModel.singleton().requestData(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                Gson gson = new Gson();
                MyDataBean myDataBean = gson.fromJson(response.body(), MyDataBean.class);
                contentTv.setText("请求成功：" + myDataBean.getData().toString());
            }

            @Override
            public void onError(Response<String> response) {
                super.onError(response);
                contentTv.setText("请求失败!");
            }
        });
    }


}
