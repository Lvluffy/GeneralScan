package com.luffy.generalscan;

import android.widget.Toast;

import com.google.zxing.Result;
import com.luffy.scanlib.ui.BaseScanActivity;

public class ScanActivity extends BaseScanActivity {

    @Override
    protected void handleBusiness(Result result) {
        Toast.makeText(ScanActivity.this, result.getText(), Toast.LENGTH_SHORT).show();
    }
}
