package com.mbj.restaurantapp.ui_component.components.dialog

import androidx.compose.runtime.Composable
import com.mbj.restaurantapp.ui_component.models.dialog.DialogButton
import com.mbj.restaurantapp.ui_component.models.dialog.DialogContent
import com.mbj.restaurantapp.ui_component.models.dialog.DialogText
import com.mbj.restaurantapp.ui_component.models.dialog.DialogTitle

@Composable
fun DialogPopup.Alert(
    title: String,
    bodyText: String,
    buttons: List<DialogButton>
) {
    BaseDialogPopup(
        dialogTitle = DialogTitle.Header(
            title
        ),
        dialogContent = DialogContent.Large(
            DialogText.Default(
                bodyText
            )
        ),
        buttons = buttons
    )
}
