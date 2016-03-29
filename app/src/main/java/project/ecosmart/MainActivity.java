
package project.ecosmart;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnLogClick(View v) {
        if (v.getId() == R.id.logbutton) {
            Intent i = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(i);
        }

    }
    public void OnCommentClick(View v) {

            Intent i = new Intent(MainActivity.this, ShowComments.class);
            startActivity(i);


    }
    public void OnCameraClick(View v) {

            Intent i = new Intent(MainActivity.this, CaptureImage.class);
            startActivity(i);


    }
}