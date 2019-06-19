package ${packageName}.state

import androidx.core.util.Consumer
import com.qihuo.supplier.http.RxCallListener
import com.qihuo.supplier.mvi.IViewState

/**
 * @author: liuchao
 * @desc: ${desc}
 */
sealed class ${moduleName}State : IViewState{

    //请求${moduleName}
    data class Request${moduleName}State(var callBack: RxCallListener<OrderListVo>? = null)
        : ${moduleName}State()

    //请求${moduleName}完成
    data class Request${moduleName}CompleteState(var result: Any, var callBack: RxCallListener<Any>? = null)
        : ${moduleName}State()
}