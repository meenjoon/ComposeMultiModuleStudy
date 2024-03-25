package com.mbj.restaurantapp.features.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.mbj.restaurantapp.features.detail.presentation.RestaurantDetailScreen
import com.mbj.restaurantapp.features.detail.presentation.output.DetailUiEffect
import com.mbj.restaurantapp.features.detail.presentation.viewmodel.RestaurantDetailViewModel
import com.mbj.restaurantapp.ui_component.navigation.safeNavigate
import com.mbj.restaurantapp.ui_component.theme.RestaurantAppTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class DetailFragment: com.mbj.restaurantapp.core.BaseFragment() {

    private val viewModel: RestaurantDetailViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        observeUiEffects()
        init()
        return ComposeView(requireContext()).apply {
            setContent {
                RestaurantAppTheme(
                    themeState = themeViewModel.themeState.collectAsState()
                ) {
                    RestaurantDetailScreen(
                        restaurantDetailState = viewModel.outputs.detailState.collectAsState(),
                        input = viewModel.inputs
                    )
                }
            }
        }
    }

    private fun init() {
        val id = arguments?.getInt("id") ?: 0
        lifecycleScope.launch {
            viewModel.initDetail(id)
        }
    }

    private fun observeUiEffects() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.outputs.detailUiEffect.collectLatest {
                    when (it) {
                        is DetailUiEffect.Back -> {
//                            findNavController().navigateUp()
                            findNavController().safeNavigate(
                                url = "App://Feed"
                            )
                        }
                        is DetailUiEffect.OpenUrl -> {
                            findNavController().safeNavigate(
//                                DetailFragmentDirections.actionDetailToMapDialog(it.url)
                                url = "App://Map/{${it.url}}"
                            )
                        }
                        is DetailUiEffect.RateRestaurant -> {
                            findNavController().safeNavigate(
//                                DetailFragmentDirections.actionDetailToRating(
//                                    restaurantName = it.restaurantName,
//                                    rating = it.rating
//                                )
                                url = "App://Rating/{${it.restaurantName}}{${it.rating}}"
                            )
                        }
                    }
                }
            }
        }
    }
}
