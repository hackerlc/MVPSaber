package ${packageName}

import com.zhujia.apartment.base.contract.BaseContract

/**
 * 类说明
 * @author joker
 * Email:lc@shandaichaoren.com or 812405389@qq.com
 * @version 
 */
interface ${name}Contract {
    interface View: BaseContract.BaseView

    interface Presenter<T>: BaseContract.BasePresenter<T>
}