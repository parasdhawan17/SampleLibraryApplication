package com.example.customdialog

import android.app.AlertDialog
import android.content.Context
import dmax.dialog.SpotsDialog

class CustomDialog {
    fun show(context: Context){
        val dialog: AlertDialog = SpotsDialog.Builder().setContext(context).build()
        dialog.show()
    }

}