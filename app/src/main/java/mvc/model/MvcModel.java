package mvc.model;

import android.util.Log;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.AbsCallback;
import com.lzy.okgo.callback.Callback;
import com.lzy.okgo.model.Response;

/**
 * Created by shixin-pc on 2018/6/10.
 */

public class MvcModel {
    private static MvcModel mMvcModel = new MvcModel();
    private String mUrl = "http://apis.juhe.cn/lottery/types";

    public static MvcModel singleton() {
        return mMvcModel;
    }

    public void  requestData (Callback<DataBean> callback) {
        OkGo.<DataBean>get(mUrl).tag(this).execute(callback);
    }

}
