package com.mbj.restaurantapp.ui_component.components.dialog

import androidx.compose.runtime.Composable
import com.mbj.restaurantapp.ui_component.models.dialog.DialogButton
import com.mbj.restaurantapp.ui_component.models.dialog.DialogContent
import com.mbj.restaurantapp.ui_component.models.dialog.DialogText
import com.mbj.restaurantapp.ui_component.models.dialog.DialogTitle

object DialogPopup

@Composable
fun DialogPopup.Default(
    title: String,
    bodyText: String,
    buttons: List<DialogButton>
) {
    BaseDialogPopup(
        dialogTitle = DialogTitle.Default(title),
        dialogContent = DialogContent.Default(
            DialogText.Default(bodyText)
        ),
        buttons = buttons
    )
}
