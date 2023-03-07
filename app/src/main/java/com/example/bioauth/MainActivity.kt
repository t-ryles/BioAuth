package com.example.bioauth

import android.hardware.biometrics.BiometricManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bioauth.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Setting up view binding
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    //First have to check if the device has the hardware for biometric auth
    fun BioMetricCheck() {

        //Creating BioMetric Object
        val biometricManager = androidx.biometric.BiometricManager.from(this)

    }
}