package com.e.uts_intent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPindahActivityImplisit.setOnClickListener {
            startActivity(Intent(this, ExplisitActivity::class.java))
        }
        btnPindahActivityImplisit.setOnClickListener {
            startActivity(Intent(this, ImplisitIntentActivity::class.java))
        }
        btnPindahActivityIntentBundle.setOnClickListener {
            val intent: Intent = Intent(this, IntentBundleActivity::class.java)
            intent.putExtra("NAMA", "Iklimah Wulan Sari")
            intent.putExtra("ALAMAT", "Semarang")
            intent.putExtra("NPM", "16670001")
            intent.putExtra("JENIS_KELAMIN", "PEREMPUAN")
            intent.putExtra("FOTO", R.drawable.me)
            startActivity(intent)
        }
    }}