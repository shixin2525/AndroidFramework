package mvc.model;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.Callback;

/**
 * Created by shixin-pc on 2018/6/10.
 */

public class MvcModel {
    private static MvcModel mMvcModel = new MvcModel();
    private String mUrl = "https://interface.meiriyiwen.com/article/today?dev=1";

    public static MvcModel singleton() {
        return mMvcModel;
    }

    public void  requestData (Callback<String> callback) {
        OkGo.<String>get(mUrl).tag(this).execute(callback);
    }

}
