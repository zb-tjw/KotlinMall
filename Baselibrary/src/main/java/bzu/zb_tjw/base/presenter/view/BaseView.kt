package bzu.zb_tjw.base.presenter.view

/**
 * Created by:zb_tjw on 2019/3/10 10:40 PM
 * Author:zb_tjw
 * Email:1549790231@qq.com
 * QQ:1549790231
 * be Used: 接口回调
 */
interface BaseView {
    fun showLoading()//加载对话框的显示
    fun hideLoading()//加载对话框的隐藏
    fun Error()//错误的时候调用
}