package com.example.krzych.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class suprasl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suprasl);
        PDFView pdf = (PDFView)findViewById(R.id.pdfView);
        pdf.fromAsset("suprasl.pdf").load();
    }
}
