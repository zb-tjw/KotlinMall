package bzu.zb_tjw.base.ui.activity

import bzu.zb_tjw.base.presenter.BasePresenter
import bzu.zb_tjw.base.presenter.view.BaseView

/**
 * Created by:zb_tjw on 2019/3/10 10:47 PM
 * Author:zb_tjw
 * Email:1549790231@qq.com
 * QQ:1549790231
 * be Used: 因为有些Activity并不需要业务逻辑代码，所以我们不需要在BaseActivity中加入mvp，而是新建BaseMvpActivity。
 */
open class BaseMvpActivity<T:BasePresenter<*>>:BaseActivity(), BaseView {
    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun Error() {

    }

    lateinit var mPresenter: T//不确定传过来的子类是什么，所以指定为泛型
}