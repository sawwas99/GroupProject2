package proj2.mobile.cs.fsu.edu.pingme;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LobbyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);
        //button that send user into a instant play vs computer
        Button instantPlay = (Button) findViewById(R.id.instant_play);
        instantPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(lobbyActivity.this, PlayActivity.class));
            }
        });
    }

    public void logOut(View view) {
        startActivity(new Intent(LobbyActivity.this, LoginActivity.class));

    }

    public void exitPlay(View view) {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}