package com.mbj.restaurantapp.ui_component.components.dialog

import androidx.compose.runtime.Composable
import com.mbj.restaurantapp.ui_component.models.dialog.DialogButton
import com.mbj.restaurantapp.ui_component.models.dialog.DialogContent
import com.mbj.restaurantapp.ui_component.models.dialog.DialogText
import com.mbj.restaurantapp.ui_component.models.dialog.DialogTitle

@Composable
fun DialogPopup.Rating(
    restaurantName: String,
    rating: Float,
    buttons: List<DialogButton>
) {
    BaseDialogPopup(
        dialogTitle = DialogTitle.Large("Rate your Score!"),
        dialogContent = DialogContent.Rating(
            DialogText.Rating(
                text = restaurantName,
                rating = rating
            )
        ),
        buttons = buttons
    )
}
