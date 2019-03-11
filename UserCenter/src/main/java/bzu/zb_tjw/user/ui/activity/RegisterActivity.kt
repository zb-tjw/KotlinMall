package bzu.zb_tjw.user.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import bzu.zb_tjw.base.ui.activity.BaseMvpActivity
import bzu.zb_tjw.user.R
import bzu.zb_tjw.user.R.id.mRegisterBtn
import bzu.zb_tjw.user.presenter.RegisterPresenter
import bzu.zb_tjw.user.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {
    override fun onRegisterResult(result: Boolean) {
        toast("注册成功")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mPresenter = RegisterPresenter()//下边调用注册之前要先实例化
        mPresenter.mView = this //view的实例化

        mRegisterBtn.setOnClickListener {
            mPresenter.regitser("","")
        }
    }
}
