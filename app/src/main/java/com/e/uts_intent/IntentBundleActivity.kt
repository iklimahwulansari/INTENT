package com.e.uts_intent

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_intent_bundle.*

class IntentBundleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_bundle)


        val namapanggilan = intent.getStringExtra("Nama Panggilan")
        val ttl = intent.getStringExtra("TTL")
        val alamatrumah = intent.getStringExtra("Alamat Rumah")
        val hobby = intent.getStringExtra("Hobby")
        val agama = intent.getStringExtra("Agama")
        val email = intent.getStringExtra("Email")
        val foto = intent.getStringExtra("FOTO")


        Glide.with(this).load(foto).override(512, 512).error(android.R.drawable.btn_minus).into(ivProfil)
        tvnamapanggilan.text = namapanggilan
        tvttl.text = ttl
        tvalamatrumah.text = alamatrumah
        tvagama.text = agama


    }

}
