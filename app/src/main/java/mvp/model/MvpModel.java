package mvp.model;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.Callback;

import mvp.controllor.MvpControllor;

/**
 * Created by shixin-pc on 2018/6/10.
 */

public class MvpModel implements MvpControllor.modelControllor{
    private String mUrl = "https://interface.meiriyiwen.com/article/today?dev=1";

    @Override
    public void requestDataHttp(Callback<String> callback) {
        OkGo.<String>get(mUrl).tag(this).execute(callback);
    }

}
