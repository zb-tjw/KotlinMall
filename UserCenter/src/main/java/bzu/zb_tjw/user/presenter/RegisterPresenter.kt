package bzu.zb_tjw.user.presenter

import bzu.zb_tjw.base.presenter.BasePresenter
import bzu.zb_tjw.user.presenter.view.RegisterView

/**
 * Created by:zb_tjw on 2019/3/10 10:55 PM
 * Author:zb_tjw
 * Email:1549790231@qq.com
 * QQ:1549790231
 * be Used:
 */
class RegisterPresenter:BasePresenter<RegisterView>() {

    fun regitser(mobile:String, verifyCode:String){
        /**
         * 业务逻辑
         */

        mView.onRegisterResult(true)
    }
}