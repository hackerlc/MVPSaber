<?xml version="1.0" encoding="utf-8"?>
<layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools">

    <data>
        <variable
            name="model"
            type="${packageName}.model.${moduleName}Model" />
    </data>

    <androidx.constraintlayout.widget.ConstraintLayout
        android:id="@+id/rootLayout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">

    </androidx.constraintlayout.widget.ConstraintLayout>
</layout>
