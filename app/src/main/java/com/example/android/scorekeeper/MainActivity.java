    package com.example.android.scorekeeper;

    import android.app.Activity;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.TextView;

    import com.example.android.scorekeeper.R;

    public class MainActivity extends AppCompatActivity {

        int scoreTeamA = 0;
        int scoreTeamB = 0;
        int quantity_red = 0;
        int quantity_yellow = 0;
        int quantity_red_TeamB = 0;
        int quantity_yellow_TeamB = 0;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        /**
         * Displays the given score for Team A in a team_a_score text field.
         */
        public void goal_TeamA(View view) {
            scoreTeamA = scoreTeamA + 1;
            displayForTeamA(scoreTeamA);
        }

        public void displayForTeamA(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_score);
            scoreView.setText(String.valueOf(score));
        }

        /**
         * Displays the given score for Team B in a team_b_score text field.
         */

        public void goal_TeamB(View view) {
            scoreTeamB = scoreTeamB + 1;
            displayForTeamB(scoreTeamB);
        }

        public void displayForTeamB(int score) {
            TextView scoreView = findViewById(R.id.team_b_score);
            scoreView.setText(String.valueOf(score));
        }

        /**
         * Reset button
         */

        public void score_reset(View view) {
            displayForTeamA(scoreTeamA = 0);
            displayForTeamB(scoreTeamB = 0);
            display_red_card_TeamA(quantity_red = 0);
            display_yellow_card_TeamA(quantity_yellow = 0);
            display_yellow_card_TeamB(quantity_yellow_TeamB = 0);
            display_red_card_TeamB(quantity_red_TeamB = 0);


        }

        /**
         * This method displays the given quantity value on the screen for red and yellow cards Team A.
         */

        private void display_red_card_TeamA(int number) {
            TextView quantityTextView = (TextView) findViewById(R.id.increment_red_TeamA_text_view);
            quantityTextView.setText("" + number);
        }

        private void display_yellow_card_TeamA(int number) {
            TextView quantityTextView = (TextView) findViewById(R.id.increment_yellow_TeamA_text_view);
            quantityTextView.setText("" + number);
        }


        /**
         * This method displays the given quantity value on the screen for red and yellow cards Team B.
         */

        private void display_red_card_TeamB(int number) {
            TextView quantityTextView = (TextView) findViewById(R.id.increment_red_TeamB_textview);
            quantityTextView.setText("" + number);
        }

        private void display_yellow_card_TeamB(int number) {
            TextView quantityTextView = (TextView) findViewById(R.id.textview_yellow_TeamB);
            quantityTextView.setText("" + number);
        }


        /**
         * This method is called when Plus (+) is clicked for red and yellow cards Team A:
         */

        public void increment_red_TeamA(View view) {
            quantity_red = quantity_red + 1;
            display_red_card_TeamA(quantity_red);
        }

        public void increment_yellow_TeamA(View view) {
            quantity_yellow = quantity_yellow + 1;
            display_yellow_card_TeamA(quantity_yellow);
        }

        /**
         * This method is called when Plus (+) is clicked for red and yellow cards Team B:
         */

        public void increment_red_TeamB(View view) {
            quantity_red_TeamB = quantity_red_TeamB + 1;
            display_red_card_TeamB(quantity_red_TeamB);
        }

        public void increment_yellow_TeamB(View view) {
            quantity_yellow_TeamB = quantity_yellow_TeamB + 1;
            display_yellow_card_TeamB(quantity_yellow_TeamB);

        }


        // Add Team A name to the text view

        public void buttonTeamA (View view) {
        EditText teamATextView = findViewById(R.id.et_teama);
        String typeNameATextView = teamATextView.getText().toString();

        // Display the team A name on screen

        String TeamANameDisplay = teamASummary (typeNameATextView);
        displayMessageA(TeamANameDisplay);
    }

        // Defines string

        private String teamASummary (String NameTeamATextView){
        String TeamANameDisplay = NameTeamATextView;
        return TeamANameDisplay;
        }

        // Defines text view, where to display
        private void displayMessageA(String message) {
            TextView teamASummary = findViewById(R.id.tv_teama);
            teamASummary.setText(message);}



        // Add Team B name to the text view

        public void buttonTeamB (View view) {
            EditText teamBTextView = findViewById(R.id.et_teamb);
            String typeNameBTextView = teamBTextView.getText().toString();

            // Display the team B name on screen
            String TeamBNameDisplay = teamASummary (typeNameBTextView);
            displayMessageB(TeamBNameDisplay);
        }

        // Defines string
        private String teamBSummary (String NameTeamBTextView){
            String TeamBNameDisplay = NameTeamBTextView;
            return TeamBNameDisplay;
        }

        // Defines text view, where to display
        private void displayMessageB (String message) {
            TextView teamASummary = findViewById(R.id.tv_teamb);
            teamASummary.setText(message);}
        }