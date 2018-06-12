package mvp.controllor;

import com.lzy.okgo.callback.Callback;

import mvc.model.MyDataBean;

/**
 * Created by shixin-pc on 2018/6/11.
 */

public interface MvpControllor {
    interface viewControllor {
        void dataSuccess(MyDataBean myDataBean );

        void dataError(String msg);
    }

    interface modelControllor {
        void requestDataHttp(Callback<String> callback);
    }

    interface pressenterControllor {
        void requestData();
    }
}
