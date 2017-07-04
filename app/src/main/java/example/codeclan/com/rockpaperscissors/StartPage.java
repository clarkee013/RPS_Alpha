package example.codeclan.com.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class StartPage extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        rockButton = (Button)findViewById(R.id.rockButton);
        paperButton = (Button)findViewById(R.id.paperButton);
        scissorsButton = (Button)findViewById(R.id.scissorsButton);


    }


    public void onAButtonClicked(View button){
        game = new Game();
        if (button.getId() == rockButton.getId()) {
            // rock pressed
        } else if (button.getId() == paperButton.getId()) {
            // paper pressed
        } else if (button.getId() == scissorsButton.getId()) {
            // scissors pressed
        }

        Log.d("button press", game.compareMoves());
    }
}
