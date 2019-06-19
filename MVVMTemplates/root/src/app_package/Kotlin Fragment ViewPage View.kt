package ${packageName}

import android.os.Bundle
import androidx.core.view.get
import com.qihuo.supplier.R
import com.qihuo.supplier.databinding.OrderManagerFragmentBinding
import com.qihuo.supplier.mvi.DefaultShowState
import com.qihuo.supplier.mvi.IAction
import com.qihuo.supplier.mvi.IViewState
import com.qihuo.supplier.base.BaseFragment
import com.qihuo.supplier.base.viewpager.BaseViewPagerFragmentAdapterImpl
import timber.log.Timber

/**
 * @author: liuchao
 * @desc: ${desc}
 */
class ${moduleName}Fragment : BaseFragment<${viewDataBinding}>() {
    override val layoutId = R.layout.fragment_${layoutName}
    //有没有初始化
    var isInit = false

    private lateinit var mManager: ${moduleName}Manager

    override fun initView(savedInstanceState: Bundle?) {
        Timber.d("initView()....1111111....")
    }

    override fun doTransaction(savedInstanceState: Bundle?) {
        Timber.d("doTransaction()....2222222....")
        mManager = ${moduleName}Manager()
    }

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
    }

    fun render(state: IViewState) {
        when (state) {
            is DefaultShowState -> { //显示ViewPager 包裹的订单列表
                mManager.setAdapter(childFragmentManager, mBinding.viewPager, mBinding.tabLayout)
            }
        }
    }

    fun doAction(action: IAction) {

    }

    override fun onLazyInitView(savedInstanceState: Bundle?) {
        super.onLazyInitView(savedInstanceState)
        Timber.d("onLazyInitView()....333333....")
        isInit = true
        render(DefaultShowState())
    }

    override fun onFragmentSelected(isMustRefresh: Boolean) {
        Timber.d("onFragmentSelected()....4444444....")
        if (isInit) {//经过初始化后再执行
            //判断当前是第几个fragment
            val adapter = mBinding.viewPager.adapter as BaseViewPagerFragmentAdapterImpl
            val fragment = adapter.getItem(mBinding.viewPager.currentItem)
            //刷新fragment
        }
    }
}

