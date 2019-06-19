<?xml version="1.0" encoding="utf-8"?>
<layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools">

    <data>

    </data>

    <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <androidx.viewpager.widget.ViewPager
            android:id="@+id/viewPager"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent">

            <com.google.android.material.tabs.TabLayout
                android:id="@+id/tabLayout"
                style="@style/tabLayout_main_style"
                android:layout_width="match_parent"
                android:layout_gravity="top"
                app:layer_divider_background_color="@{@color/color_f4e8cd}"
                app:layer_divider_color="@{@color/color_ad7f4e}"
                app:layer_divider_have_bottom="@{true}"
                app:layer_divider_height="@{@dimen/s05}"
                app:tabIndicatorHeight="2dp"
                app:tabTextAppearance="@style/TabLayout_Text_sp20_Style"
                tools:background="#F4E8CD" />
        </androidx.viewpager.widget.ViewPager>


    </androidx.constraintlayout.widget.ConstraintLayout>
</layout>