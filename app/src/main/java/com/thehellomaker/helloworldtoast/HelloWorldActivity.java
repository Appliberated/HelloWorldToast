/*
 * Hello World Toast
 * Copyright (c) 2015-2025 Appliberated. All rights reserved.
 * https://www.appliberated.com/
 *
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 */

package com.thehellomaker.helloworldtoast;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class HelloWorldActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Show the Hello World! toast
        Toast toast = Toast.makeText(getApplicationContext(), R.string.hello_world_message, Toast.LENGTH_LONG);
        toast.show();

        // Terminate the activity
        finish();
    }
}
