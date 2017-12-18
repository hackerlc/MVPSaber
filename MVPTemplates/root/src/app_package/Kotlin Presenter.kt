package ${packageName}

import com.zhujia.apartment.base.contract.presenter.PresenterDataWrapper

/**
 * ${title}
 * @author joker
 * Email:lc@shandaichaoren.com or 812405389@qq.com
 * @version 2017/12/15
 */
class ${name}Presenter(v: ${name}Contract.View):
        PresenterDataWrapper<${type},${name}Contract.View>(v),
        ${name}Contract.Presenter<${type}> {
    override fun fetch() {
    }

    override fun refreshData() {
    }

    override fun getData(): ${type} {
        return mData
    }

    override fun close() {
    }
}