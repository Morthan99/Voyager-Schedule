package com.example.krzych.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class grodek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grodek);
        PDFView pdf =(PDFView)findViewById(R.id.pdfView);
        pdf.fromAsset("grodek.pdf").load();
    }
}
