package ${packageName}

import com.zhujia.apartment.base.contract.presenter.PresenterDataWrapper

/**
 * 类说明
 * @author joker
 * Email:lc@shandaichaoren.com or 812405389@qq.com
 * @version 2017/12/15
 */
class ${name}Presenter(v: ${name}Contract.View):
        PresenterDataWrapper<String,${name}Contract.View>(v),
        ${name}Contract.Presenter<String> {
    override fun fetch() {
    }

    override fun refreshData() {
    }

    override fun getData(): String {
        return mData
    }

    override fun close() {
    }
}