package ${packageName}.manager

import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.blankj.utilcode.util.StringUtils
import com.google.android.material.tabs.TabLayout
import com.qihuo.supplier.R
import com.qihuo.supplier.base.BaseFragment
import com.qihuo.supplier.base.viewpager.BaseViewPagerFragmentAdapterImpl
import com.qihuo.supplier.mvi.IManager

/**
 * @author: liuchao
 * @desc: ${desc}
 */
class ${moduleName}Manager : IManager {

     fun setAdapter(fm: FragmentManager, viewPager: ViewPager, tabLayout: TabLayout) {
        val titleArray = StringUtils.getStringArray(R.array.order_manager_tab)
        val mMainViewPagerAdapter = object : BaseViewPagerFragmentAdapterImpl(fm) {
            override fun getChildItem(position: Int): BaseFragment<*> {
                return when (position) {
                    0 -> {
                        //TODO:页面 
                    }
                    1 -> {
                        //TODO:页面 
                    }
                    else -> {
                    }
                }
            }

            override fun getCount(): Int {
                return titleArray.size
            }

            override fun getPageTitle(position: Int): CharSequence? {
              return titleArray[position]
            }
        }
        viewPager.adapter = mMainViewPagerAdapter
        tabLayout.setupWithViewPager(viewPager)
    }
}