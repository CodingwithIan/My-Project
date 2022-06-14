package com.ian.myvan.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ian.myvan.R
import com.ian.myvan.uitel.loadImage
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.activity_details.descriptionDetailTextView
import kotlinx.android.synthetic.main.activity_details.studentName
import kotlinx.android.synthetic.main.activity_details.studentSchool
import kotlinx.android.synthetic.main.activity_details.studentClass
import kotlinx.android.synthetic.main.activity_details.studentImage
import kotlinx.android.synthetic.main.activity_details.studentStation
import kotlinx.android.synthetic.main.activity_upload.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val intss = intent
        var nameT = intss.getStringExtra("NAMET")
        var desT = intss.getStringExtra("DESCRIT")
        var imgT = intss.getStringExtra("IMGURI")



        studentName.text = nameT
        descriptionDetailTextView.text = desT

        studentImage.loadImage(imgT)
    }
}