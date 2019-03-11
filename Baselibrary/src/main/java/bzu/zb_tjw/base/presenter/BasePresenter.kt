package bzu.zb_tjw.base.presenter

import bzu.zb_tjw.base.presenter.view.BaseView

/**
 * Created by:zb_tjw on 2019/3/10 10:39 PM
 * Author:zb_tjw
 * Email:1549790231@qq.com
 * QQ:1549790231
 * be Used:
 */
open class BasePresenter<T: BaseView> {

    lateinit var mView: T//不确定传过来的子类是什么，所以指定为泛型
}