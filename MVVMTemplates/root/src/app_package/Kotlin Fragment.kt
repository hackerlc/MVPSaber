package ${packageName}

import android.os.Bundle
import com.qihuo.supplier.R
import timber.log.Timber

/**
 * @author: liuchao
 * @desc: ${desc}
 */
class ${moduleName}Fragment : BaseFragment<${viewDataBinding}>(), I${moduleName}Click {
    @LayoutRes
    override val layoutId = R.layout.fragment_${layoutName}

    override fun doTransaction(savedInstanceState: Bundle?) {
        
    }

    fun render(state: ${moduleName}State) {
        when (state) {
            is ${moduleName}State.Request${moduleName}State -> {
                
            }
            is ${moduleName}State.Request${moduleName}CompleteState -> {

            }
        }
    }

    fun doAction(action: ${moduleName}Action) {
        when(action){
            is ${moduleName}Action.Click${moduleName}Action -> {//默认
                
            }
        }
    }

    override fun on${moduleName}Click() {
        doAction(${moduleName}Action.Click${moduleName}Action())
    }

    /**
     * 界面刷新
     */
    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        
    }

    companion object {
        fun newInstance(): ${moduleName}Fragment {
            val frag = ${moduleName}Fragment()
            val bundle = Bundle()
            frag.arguments = bundle
            return frag
        }
    }
}

