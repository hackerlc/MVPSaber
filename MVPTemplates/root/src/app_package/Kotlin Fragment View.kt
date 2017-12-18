package ${packageName}

import android.view.View
import com.trello.rxlifecycle2.LifecycleTransformer
import com.zhujia.apartment.R
import com.zhujia.apartment.base.fragment.BasePFragment
import gear.yc.com.gearlibrary.utils.ProgressDialogUtil
import gear.yc.com.gearlibrary.utils.ToastUtil

/**
 * ${title}
 * @author joker
 * Email:lc@shandaichaoren.com or 812405389@qq.com
 * @version 
 */
class ${name}Fragment:
        BasePFragment<${name}Contract.Presenter<${type}>>(${layout}),
        LivenessContract.View {
    override fun initUI() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onClick(v: View) {
        when(v.id){

        }
    }

    override fun attachPresenter() {
        mPresenter = ${name}Presenter(this)
    }

    override fun updateUI() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showToast(str: String) {
        ToastUtil.getInstance().makeShortToast(context, str)
    }

    override fun onDialog(show: Boolean) {
        if (show) {
            ProgressDialogUtil.getInstance().build(context).show()
        } else {
            ProgressDialogUtil.getInstance().dismiss()
        }
    }

    override fun <R> getLifecycle2(): LifecycleTransformer<R> {
        return bindToLifecycle()
    }

    override fun <R> getLifecycleDestroy(): LifecycleTransformer<R> {
        return bindToLifecycleDestroy()
    }
}