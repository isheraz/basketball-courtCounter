package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  int scoreTeamA = 0, scoreTeamB = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    displayForTeamA(scoreTeamA);
  }

  /**
   * Displays the given scoreTeamA for Team A.
   */
  public void displayForTeamA(int score) {
    TextView scoreView = (TextView) findViewById(R.id.team_a_score);
    scoreView.setText(String.valueOf(score));
  }

  /**
   * Displays the given scoreTeamA for Team B.
   */
  public void displayForTeamB(int score) {
    TextView scoreView = (TextView) findViewById(R.id.team_b_score);
    scoreView.setText(String.valueOf(score));
  }

  public void add3Points(View view) {
    String addPointsTo = (view.getParent().toString());
    TextView scoreView = (TextView) findViewById(R.id.team_b_score);
    if (addPointsTo.contains("team_b")) {
      scoreTeamB += 3;
      displayForTeamB(scoreTeamB);
    } else if (addPointsTo.contains("team_a")) {
      scoreTeamA += 3;
      displayForTeamA(scoreTeamA);
    }
  }

  public void add2Points(View view) {
    String addPointsTo = (view.getParent().toString());
    TextView scoreView = (TextView) findViewById(R.id.team_b_score);
    if (addPointsTo.contains("team_b")) {
      scoreTeamB += 2;
      displayForTeamB(scoreTeamB);
    } else if (addPointsTo.contains("team_a")) {
      scoreTeamA += 2;
      displayForTeamA(scoreTeamA);
    }
  }

  public void addFreeThrow(View view) {
    String addPointsTo = (view.getParent().toString());
    TextView scoreView = (TextView) findViewById(R.id.team_b_score);
    if (addPointsTo.contains("team_b")) {
      scoreTeamB += 1;
      displayForTeamB(scoreTeamB);
    } else if (addPointsTo.contains("team_a")) {
      scoreTeamA += 1;
      displayForTeamA(scoreTeamA);
    }
  }

  public void reset(View view) {
    scoreTeamA = 0;
    scoreTeamB = 0;
    displayForTeamA(scoreTeamA);
    displayForTeamB(scoreTeamB);
  }
}
