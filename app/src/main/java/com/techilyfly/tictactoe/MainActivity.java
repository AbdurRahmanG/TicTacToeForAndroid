package com.techilyfly.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewButton1, imageViewButton2, imageViewButton3, imageViewButton4, imageViewButton5, imageViewButton6, imageViewButton7, imageViewButton8, imageViewButton9;
    private String startGame = "X";
    int button1 = 8, button2 = 8, button3 = 8, button4 = 8, button5 = 8, button6 = 8, button7 = 8, button8 = 8, button9 = 8, xCount = 0, oCount = 0, i = 0;
    private TextView scoreX, scoreO;
    private Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewButton1 = findViewById(R.id.imageViewButton1);
        imageViewButton2 = findViewById(R.id.imageViewButton2);
        imageViewButton3 = findViewById(R.id.imageViewButton3);
        imageViewButton4 = findViewById(R.id.imageViewButton4);
        imageViewButton5 = findViewById(R.id.imageViewButton5);
        imageViewButton6 = findViewById(R.id.imageViewButton6);
        imageViewButton7 = findViewById(R.id.imageViewButton7);
        imageViewButton8 = findViewById(R.id.imageViewButton8);
        imageViewButton9 = findViewById(R.id.imageViewButton9);

        scoreX = findViewById(R.id.textViewScoreX);
        scoreO = findViewById(R.id.textViewScoreO);

        reset = findViewById(R.id.buttonReset);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewButton1.setImageDrawable(null);
                imageViewButton2.setImageDrawable(null);
                imageViewButton3.setImageDrawable(null);
                imageViewButton4.setImageDrawable(null);
                imageViewButton5.setImageDrawable(null);
                imageViewButton6.setImageDrawable(null);
                imageViewButton7.setImageDrawable(null);
                imageViewButton8.setImageDrawable(null);
                imageViewButton9.setImageDrawable(null);

                resetValue();

                xCount = 0;
                oCount = 0;

                scoreX.setText("Score X :- " + String.valueOf(xCount));
                scoreO.setText("Score O :- " + String.valueOf(oCount));
            }
        });

        imageViewButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startGame.equals("X")){
                    imageViewButton1.setImageResource(R.drawable.cross);
                    button1 = 1;
                    i++;
                } else {
                    imageViewButton1.setImageResource(R.drawable.circle);
                    button1 = 0;
                    i++;
                }

                choosePlayer();
                winningGame();

            }
        });

        imageViewButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startGame.equals("X")){
                    imageViewButton2.setImageResource(R.drawable.cross);
                    button2 = 1;
                    i++;
                } else {
                    imageViewButton2.setImageResource(R.drawable.circle);
                    button2 = 0;
                    i++;
                }

                choosePlayer();
                winningGame();

            }
        });

        imageViewButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startGame.equals("X")){
                    imageViewButton3.setImageResource(R.drawable.cross);
                    button3 = 1;
                    i++;
                } else {
                    imageViewButton3.setImageResource(R.drawable.circle);
                    button3 = 0;
                    i++;
                }

                choosePlayer();
                winningGame();

            }
        });

        imageViewButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startGame.equals("X")){
                    imageViewButton4.setImageResource(R.drawable.cross);
                    button4 = 1;
                    i++;
                } else {
                    imageViewButton4.setImageResource(R.drawable.circle);
                    button4 = 0;
                    i++;
                }

                choosePlayer();
                winningGame();

            }
        });

        imageViewButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startGame.equals("X")){
                    imageViewButton5.setImageResource(R.drawable.cross);
                    button5 = 1;
                    i++;
                } else {
                    imageViewButton5.setImageResource(R.drawable.circle);
                    button5 = 0;
                    i++;
                }

                choosePlayer();
                winningGame();

            }
        });

        imageViewButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startGame.equals("X")){
                    imageViewButton6.setImageResource(R.drawable.cross);
                    button6 = 1;
                    i++;
                } else {
                    imageViewButton6.setImageResource(R.drawable.circle);
                    button6 = 0;
                    i++;
                }

                choosePlayer();
                winningGame();

            }
        });

        imageViewButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startGame.equals("X")){
                    imageViewButton7.setImageResource(R.drawable.cross);
                    button7 = 1;
                    i++;
                } else {
                    imageViewButton7.setImageResource(R.drawable.circle);
                    button7 = 0;
                    i++;
                }

                choosePlayer();
                winningGame();

            }
        });

        imageViewButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startGame.equals("X")){
                    imageViewButton8.setImageResource(R.drawable.cross);
                    button8 = 1;
                    i++;
                } else {
                    imageViewButton8.setImageResource(R.drawable.circle);
                    button8 = 0;
                    i++;
                }

                choosePlayer();
                winningGame();

            }
        });

        imageViewButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startGame.equals("X")){
                    imageViewButton9.setImageResource(R.drawable.cross);
                    button9 = 1;
                    i++;
                } else {
                    imageViewButton9.setImageResource(R.drawable.circle);
                    button9 = 0;
                    i++;
                }

                choosePlayer();
                winningGame();

            }
        });



    }


    private void choosePlayer() {

        if (startGame.equals("X")){
            startGame = "O";
        } else {
            startGame = "X";
        }

    }

    private void winningGame() {

        if (button1 == 1 && button2 == 1 && button3 == 1){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Won!").setCancelable(false).setPositiveButton("Nice", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imageViewButton1.setImageDrawable(null);
                    imageViewButton2.setImageDrawable(null);
                    imageViewButton3.setImageDrawable(null);
                    imageViewButton4.setImageDrawable(null);
                    imageViewButton5.setImageDrawable(null);
                    imageViewButton6.setImageDrawable(null);
                    imageViewButton7.setImageDrawable(null);
                    imageViewButton8.setImageDrawable(null);
                    imageViewButton9.setImageDrawable(null);

                    resetValue();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X :- " + String.valueOf(xCount));

        }

        else if (button4 == 1 && button5 == 1 && button6 == 1){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Won!").setCancelable(false).setPositiveButton("Nice", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imageViewButton1.setImageDrawable(null);
                    imageViewButton2.setImageDrawable(null);
                    imageViewButton3.setImageDrawable(null);
                    imageViewButton4.setImageDrawable(null);
                    imageViewButton5.setImageDrawable(null);
                    imageViewButton6.setImageDrawable(null);
                    imageViewButton7.setImageDrawable(null);
                    imageViewButton8.setImageDrawable(null);
                    imageViewButton9.setImageDrawable(null);

                    resetValue();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X :- " + String.valueOf(xCount));

        }

        else if (button7 == 1 && button8 == 1 && button9 == 1){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Won!").setCancelable(false).setPositiveButton("Nice", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imageViewButton1.setImageDrawable(null);
                    imageViewButton2.setImageDrawable(null);
                    imageViewButton3.setImageDrawable(null);
                    imageViewButton4.setImageDrawable(null);
                    imageViewButton5.setImageDrawable(null);
                    imageViewButton6.setImageDrawable(null);
                    imageViewButton7.setImageDrawable(null);
                    imageViewButton8.setImageDrawable(null);
                    imageViewButton9.setImageDrawable(null);

                    resetValue();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X :- " + String.valueOf(xCount));

        }

        else if (button1 == 1 && button4 == 1 && button7 == 1){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Won!").setCancelable(false).setPositiveButton("Nice", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imageViewButton1.setImageDrawable(null);
                    imageViewButton2.setImageDrawable(null);
                    imageViewButton3.setImageDrawable(null);
                    imageViewButton4.setImageDrawable(null);
                    imageViewButton5.setImageDrawable(null);
                    imageViewButton6.setImageDrawable(null);
                    imageViewButton7.setImageDrawable(null);
                    imageViewButton8.setImageDrawable(null);
                    imageViewButton9.setImageDrawable(null);

                    resetValue();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X :- " + String.valueOf(xCount));

        }

        else if (button2 == 1 && button5 == 1 && button8 == 1){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Won!").setCancelable(false).setPositiveButton("Nice", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imageViewButton1.setImageDrawable(null);
                    imageViewButton2.setImageDrawable(null);
                    imageViewButton3.setImageDrawable(null);
                    imageViewButton4.setImageDrawable(null);
                    imageViewButton5.setImageDrawable(null);
                    imageViewButton6.setImageDrawable(null);
                    imageViewButton7.setImageDrawable(null);
                    imageViewButton8.setImageDrawable(null);
                    imageViewButton9.setImageDrawable(null);

                    resetValue();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X :- " + String.valueOf(xCount));

        }

        else if (button3 == 1 && button6 == 1 && button9 == 1){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Won!").setCancelable(false).setPositiveButton("Nice", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imageViewButton1.setImageDrawable(null);
                    imageViewButton2.setImageDrawable(null);
                    imageViewButton3.setImageDrawable(null);
                    imageViewButton4.setImageDrawable(null);
                    imageViewButton5.setImageDrawable(null);
                    imageViewButton6.setImageDrawable(null);
                    imageViewButton7.setImageDrawable(null);
                    imageViewButton8.setImageDrawable(null);
                    imageViewButton9.setImageDrawable(null);

                    resetValue();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X :- " + String.valueOf(xCount));

        }

        else if (button1 == 1 && button5 == 1 && button9 == 1){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Won!").setCancelable(false).setPositiveButton("Nice", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imageViewButton1.setImageDrawable(null);
                    imageViewButton2.setImageDrawable(null);
                    imageViewButton3.setImageDrawable(null);
                    imageViewButton4.setImageDrawable(null);
                    imageViewButton5.setImageDrawable(null);
                    imageViewButton6.setImageDrawable(null);
                    imageViewButton7.setImageDrawable(null);
                    imageViewButton8.setImageDrawable(null);
                    imageViewButton9.setImageDrawable(null);

                    resetValue();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X :- " + String.valueOf(xCount));

        }

        else if (button3 == 1 && button5 == 1 && button7 == 1){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Won!").setCancelable(false).setPositiveButton("Nice", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imageViewButton1.setImageDrawable(null);
                    imageViewButton2.setImageDrawable(null);
                    imageViewButton3.setImageDrawable(null);
                    imageViewButton4.setImageDrawable(null);
                    imageViewButton5.setImageDrawable(null);
                    imageViewButton6.setImageDrawable(null);
                    imageViewButton7.setImageDrawable(null);
                    imageViewButton8.setImageDrawable(null);
                    imageViewButton9.setImageDrawable(null);

                    resetValue();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X :- " + String.valueOf(xCount));

        }

        else if (button1 == 0 && button2 == 0 && button3 == 0){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Won!").setCancelable(false).setPositiveButton("Nice", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imageViewButton1.setImageDrawable(null);
                    imageViewButton2.setImageDrawable(null);
                    imageViewButton3.setImageDrawable(null);
                    imageViewButton4.setImageDrawable(null);
                    imageViewButton5.setImageDrawable(null);
                    imageViewButton6.setImageDrawable(null);
                    imageViewButton7.setImageDrawable(null);
                    imageViewButton8.setImageDrawable(null);
                    imageViewButton9.setImageDrawable(null);

                    resetValue();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            scoreO.setText("Score O :- " + String.valueOf(oCount));

        }

        else if (button4 == 0 && button5 == 0 && button6 == 0){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Won!").setCancelable(false).setPositiveButton("Nice", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imageViewButton1.setImageDrawable(null);
                    imageViewButton2.setImageDrawable(null);
                    imageViewButton3.setImageDrawable(null);
                    imageViewButton4.setImageDrawable(null);
                    imageViewButton5.setImageDrawable(null);
                    imageViewButton6.setImageDrawable(null);
                    imageViewButton7.setImageDrawable(null);
                    imageViewButton8.setImageDrawable(null);
                    imageViewButton9.setImageDrawable(null);

                    resetValue();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            scoreO.setText("Score O :- " + String.valueOf(oCount));

        }

        else if (button7 == 0 && button8 == 0 && button9 == 0){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Won!").setCancelable(false).setPositiveButton("Nice", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imageViewButton1.setImageDrawable(null);
                    imageViewButton2.setImageDrawable(null);
                    imageViewButton3.setImageDrawable(null);
                    imageViewButton4.setImageDrawable(null);
                    imageViewButton5.setImageDrawable(null);
                    imageViewButton6.setImageDrawable(null);
                    imageViewButton7.setImageDrawable(null);
                    imageViewButton8.setImageDrawable(null);
                    imageViewButton9.setImageDrawable(null);

                    resetValue();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            scoreO.setText("Score O :- " + String.valueOf(oCount));

        }

        else if (button1 == 0 && button4 == 0 && button7 == 0){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Won!").setCancelable(false).setPositiveButton("Nice", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imageViewButton1.setImageDrawable(null);
                    imageViewButton2.setImageDrawable(null);
                    imageViewButton3.setImageDrawable(null);
                    imageViewButton4.setImageDrawable(null);
                    imageViewButton5.setImageDrawable(null);
                    imageViewButton6.setImageDrawable(null);
                    imageViewButton7.setImageDrawable(null);
                    imageViewButton8.setImageDrawable(null);
                    imageViewButton9.setImageDrawable(null);

                    resetValue();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            scoreO.setText("Score O :- " + String.valueOf(oCount));

        }

        else if (button2 == 0 && button5 == 0 && button8 == 0){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Won!").setCancelable(false).setPositiveButton("Nice", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imageViewButton1.setImageDrawable(null);
                    imageViewButton2.setImageDrawable(null);
                    imageViewButton3.setImageDrawable(null);
                    imageViewButton4.setImageDrawable(null);
                    imageViewButton5.setImageDrawable(null);
                    imageViewButton6.setImageDrawable(null);
                    imageViewButton7.setImageDrawable(null);
                    imageViewButton8.setImageDrawable(null);
                    imageViewButton9.setImageDrawable(null);

                    resetValue();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            scoreO.setText("Score O :- " + String.valueOf(oCount));

        }

        else if (button3 == 0 && button6 == 0 && button9 == 0){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Won!").setCancelable(false).setPositiveButton("Nice", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imageViewButton1.setImageDrawable(null);
                    imageViewButton2.setImageDrawable(null);
                    imageViewButton3.setImageDrawable(null);
                    imageViewButton4.setImageDrawable(null);
                    imageViewButton5.setImageDrawable(null);
                    imageViewButton6.setImageDrawable(null);
                    imageViewButton7.setImageDrawable(null);
                    imageViewButton8.setImageDrawable(null);
                    imageViewButton9.setImageDrawable(null);

                    resetValue();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            scoreO.setText("Score O :- " + String.valueOf(oCount));

        }

        else if (button1 == 0 && button5 == 0 && button9 == 0){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Won!").setCancelable(false).setPositiveButton("Nice", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imageViewButton1.setImageDrawable(null);
                    imageViewButton2.setImageDrawable(null);
                    imageViewButton3.setImageDrawable(null);
                    imageViewButton4.setImageDrawable(null);
                    imageViewButton5.setImageDrawable(null);
                    imageViewButton6.setImageDrawable(null);
                    imageViewButton7.setImageDrawable(null);
                    imageViewButton8.setImageDrawable(null);
                    imageViewButton9.setImageDrawable(null);

                    resetValue();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            scoreO.setText("Score O :- " + String.valueOf(oCount));

        }

        else if (button3 == 0 && button5 == 0 && button7 == 0){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Won!").setCancelable(false).setPositiveButton("Nice", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imageViewButton1.setImageDrawable(null);
                    imageViewButton2.setImageDrawable(null);
                    imageViewButton3.setImageDrawable(null);
                    imageViewButton4.setImageDrawable(null);
                    imageViewButton5.setImageDrawable(null);
                    imageViewButton6.setImageDrawable(null);
                    imageViewButton7.setImageDrawable(null);
                    imageViewButton8.setImageDrawable(null);
                    imageViewButton9.setImageDrawable(null);

                    resetValue();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            scoreO.setText("Score O :- " + String.valueOf(oCount));

        }

        else {
            if (i == 9){
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("No One Won!").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        imageViewButton1.setImageDrawable(null);
                        imageViewButton2.setImageDrawable(null);
                        imageViewButton3.setImageDrawable(null);
                        imageViewButton4.setImageDrawable(null);
                        imageViewButton5.setImageDrawable(null);
                        imageViewButton6.setImageDrawable(null);
                        imageViewButton7.setImageDrawable(null);
                        imageViewButton8.setImageDrawable(null);
                        imageViewButton9.setImageDrawable(null);

                        resetValue();

                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        }

    }

    private void resetValue() {

        button1 = 8;
        button2 = 8;
        button3 = 8;
        button4 = 8;
        button5 = 8;
        button6 = 8;
        button7 = 8;
        button8 = 8;
        button9 = 8;

        i = 0;

    }
}