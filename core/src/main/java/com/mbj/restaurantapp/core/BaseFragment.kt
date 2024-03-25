package com.mbj.restaurantapp.core

import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.mbj.restaurantapp.core.viewmodel.ThemeViewModel

open class BaseFragment: Fragment() {
    protected val themeViewModel: ThemeViewModel by activityViewModels()
}
