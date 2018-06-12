package mvp.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.TextView;

import com.example.shixin_pc.framework.R;

import mvc.model.MyDataBean;
import mvp.controllor.MvpControllor;
import mvp.presenter.MvpPresenter;

/**
 * Created by shixin-pc on 2018/6/10.
 */

public class MvpActivity extends Activity implements MvpControllor.viewControllor{
   TextView mBtnMvpContent;
   MvpControllor.pressenterControllor mPresserterController;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_mvp);
        mBtnMvpContent =findViewById(R.id.tv_mvp_content);
        mPresserterController=new MvpPresenter(this);
        mPresserterController.requestData();
    }

    @Override
    public void dataSuccess(MyDataBean myDataBean ) {
        mBtnMvpContent.setText(myDataBean.getData().toString());
    }

    @Override
    public void dataError(String msg) {
        mBtnMvpContent.setText(msg);
    }
}
