package com.mbj.restaurantapp.core

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import com.mbj.restaurantapp.core.viewmodel.ThemeViewModel

open class BaseDialogFragment : DialogFragment() {
    protected val themeViewModel: ThemeViewModel by activityViewModels()
}
