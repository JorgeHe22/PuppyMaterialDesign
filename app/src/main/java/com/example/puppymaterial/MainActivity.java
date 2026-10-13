package com.example.puppymaterial;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.btnExplore).setOnClickListener(view ->
                Snackbar.make(findViewById(R.id.root),
                        R.string.action_message, Snackbar.LENGTH_SHORT).show());

        findViewById(R.id.btnPalette).setOnClickListener(view ->
                new MaterialAlertDialogBuilder(this)
                        .setTitle(R.string.palette_dialog_title)
                        .setMessage(R.string.palette_dialog_message)
                        .setPositiveButton(R.string.close, (dialog, which) -> dialog.dismiss())
                        .show());

        SwitchMaterial updates = findViewById(R.id.switchUpdates);
        updates.setOnCheckedChangeListener((button, checked) ->
                Snackbar.make(findViewById(R.id.root),
                        checked ? R.string.updates_enabled : R.string.updates_disabled,
                        Snackbar.LENGTH_SHORT).show());
    }
}
