package bzu.zb_tjw.user.presenter.view

import bzu.zb_tjw.base.presenter.view.BaseView

/**
 * Created by:zb_tjw on 2019/3/10 10:56 PM
 * Author:zb_tjw
 * Email:1549790231@qq.com
 * QQ:1549790231
 * be Used:
 */
interface RegisterView:BaseView {

    fun onRegisterResult(result:Boolean)//成功的注册失败
}