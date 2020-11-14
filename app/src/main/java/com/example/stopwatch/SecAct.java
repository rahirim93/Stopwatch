package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        TextView textView = findViewById(R.id.textView3);
        textView.setText("package com.example.stopwatch;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "import android.os.Bundle;\n" +
                "import android.widget.TextView;\n" +
                "\n" +
                "public class SecAct extends AppCompatActivity {\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_sec);\n" +
                "\n" +
                "        TextView textView = findViewById(R.id.textView);\n" +
                "        textView.setText(\"\");\n" +
                "    }\n" +
                "}");
    }
}