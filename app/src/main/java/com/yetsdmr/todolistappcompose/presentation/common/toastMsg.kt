package com.yetsdmr.todolistappcompose.presentation.common

import android.content.Context
import android.widget.Toast

fun toastMsg(
    context: Context,
    msg: String
) {
    Toast.makeText(
        context,
        msg,
        Toast.LENGTH_LONG
    ).show()
}