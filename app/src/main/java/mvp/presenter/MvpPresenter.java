package mvp.presenter;

import com.google.gson.Gson;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import mvc.model.MyDataBean;
import mvp.controllor.MvpControllor;
import mvp.model.MvpModel;

/**
 * Created by shixin-pc on 2018/6/10.
 */

public class MvpPresenter implements MvpControllor.pressenterControllor {
    private MvpControllor.modelControllor mModelControllor;
    private MvpControllor.viewControllor mViewControllor;

    public MvpPresenter(MvpControllor.viewControllor mViewControllor) {
        mModelControllor=new MvpModel();
        this.mViewControllor=mViewControllor;
    }

    @Override
    public void requestData() {
        mModelControllor.requestDataHttp(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                Gson gson = new Gson();
                MyDataBean myDataBean = gson.fromJson(response.body(), MyDataBean.class);
                mViewControllor.dataSuccess(myDataBean);
            }

            @Override
            public void onError(Response<String> response) {
                super.onError(response);
                mViewControllor.dataError("请求失败!");
            }
        });
    }
}
