package com.example.guillaume.essai3;


import android.app.Activity;

import android.telephony.SmsManager;
import java.lang.String;


public class MainActivity extends Activity {



        public void envoi(String numero, double latitude, double longitude) {
            SmsManager sms = SmsManager.getDefault();

            sms.sendTextMessage(numero, null, "hello https://www.google.com/maps/preview/@" + latitude +"," + longitude + "22z", null, null);

        }
    }

