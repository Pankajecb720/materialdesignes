package com.pankajbagariya.wheather.navigation;

import android.graphics.Color;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // use the toolbar v7
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Basic Component");

        coordinatorLayout = (CoordinatorLayout)findViewById(R.id.coordinatorlayout);

        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Fab Clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void showSimpleSnackBar(View view) {
      Snackbar.make(coordinatorLayout,"Simple snackbar",Snackbar.LENGTH_LONG).show();

    }

    public void showSnackBarWithActionCallBack(View view) {
        Snackbar snackbar = Snackbar.make(coordinatorLayout,"Error Loading file",Snackbar.LENGTH_LONG);
        snackbar.setAction("RETRY", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(coordinatorLayout,"File Loaded Successfully",Snackbar.LENGTH_LONG).show();
            }
        });

        snackbar.show();
    }

    public void showSnackBarWithColoredText(View view) {
        Snackbar snackbar = Snackbar.make(coordinatorLayout,"Download Failed",Snackbar.LENGTH_LONG);
        snackbar.setAction("RETRY", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             // Do something
            }
        });

        View snackbarLayout = snackbar.getView();
        snackbarLayout.setBackgroundColor(Color.BLUE);

        // Snackbar message text color

         TextView textView = (TextView) snackbarLayout.findViewById(android.support.design.R.id.snackbar_text);
         textView.setTextColor(Color.YELLOW);

         //Changing action Button text Color method 1
        snackbar.setActionTextColor(Color.RED);

        // OR Change Action Button Text Color - METHOD 2
//		Button btn = (Button) snackbarLayout.findViewById(android.support.design.R.id.snackbar_action);
//		btn.setTextColor(Color.RED);

         snackbar.show();
    }
}
