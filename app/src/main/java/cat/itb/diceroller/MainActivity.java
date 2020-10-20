package cat.itb.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button rollButton;
    ImageView result_imageView;
    ImageView result_imageView2;
    Button restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton = findViewById(R.id.roll_button);
        result_imageView = findViewById(R.id.result_imageView);
        result_imageView2= findViewById(R.id.result_imageView2);
        restartButton = findViewById(R.id.restart_button);


        rollButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"SetTextI18n", "UseCompatLoadingForDrawables"})
            @Override
            public void onClick(View v) {
                rollButton.setText("Dice Rolled");
                int numRandom = (int) Math.floor(Math.random() * 6 + 1);
                switch (numRandom) {
                    case 1:
                        result_imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_1));
                        break;
                    case 2:
                        result_imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_2));
                        break;
                    case 3:
                        result_imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_3));
                        break;
                    case 4:
                        result_imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_4));
                        break;
                    case 5:
                        result_imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_5));
                        break;
                    case 6:
                        result_imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_6));
                        break;
                }
                int numRandom2= (int) Math.floor(Math.random() * 6 + 1);
                switch (numRandom2) {
                    case 1:
                        result_imageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_1));
                        break;
                    case 2:
                        result_imageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_2));
                        break;
                    case 3:
                        result_imageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_3));
                        break;
                    case 4:
                        result_imageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_4));
                        break;
                    case 5:
                        result_imageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_5));
                        break;
                    case 6:
                        result_imageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_6));
                        break;
                }
                if (numRandom==6&&numRandom2==6){
                    Toast toast= Toast.makeText(MainActivity.this,
                            "JACKPOT!!!", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 0);
                    toast.show();
                }

            }
        });

        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restartIntent = getBaseContext().getPackageManager().getLaunchIntentForPackage(getBaseContext().getPackageName());
                assert restartIntent != null;
                restartIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(restartIntent);
            }
        });

        result_imageView.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {
                int numRandom = (int) Math.floor(Math.random() * 6 + 1);
                switch (numRandom) {
                    case 1:
                        result_imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_1));
                        break;
                    case 2:
                        result_imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_2));
                        break;
                    case 3:
                        result_imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_3));
                        break;
                    case 4:
                        result_imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_4));
                        break;
                    case 5:
                        result_imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_5));
                        break;
                    case 6:
                        result_imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_6));
                        break;
                }
            }
        });

        result_imageView2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {
                int numRandom= (int) Math.floor(Math.random() * 6 + 1);
                switch (numRandom) {
                    case 1:
                        result_imageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_1));
                        break;
                    case 2:
                        result_imageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_2));
                        break;
                    case 3:
                        result_imageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_3));
                        break;
                    case 4:
                        result_imageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_4));
                        break;
                    case 5:
                        result_imageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_5));
                        break;
                    case 6:
                        result_imageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_6));
                        break;
                }
            }
        });
    }

}