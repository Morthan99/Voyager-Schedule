package com.example.krzych.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class bialowieza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bialowieza);
        PDFView pdf = (PDFView)findViewById(R.id.pdfView);
        pdf.fromAsset("bialowieza.pdf").load();
    }
}
