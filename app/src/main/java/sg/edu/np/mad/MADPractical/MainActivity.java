package sg.edu.np.mad.MADPractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    User newUser = new User("YanYong", "Year 2 Student Studying in MAD", 1, true ); //bruh this is confusing ;-;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = findViewById(R.id.user);
        username.setText(newUser.Name);

        TextView description = findViewById(R.id.description);
        description.setText(newUser.Description);
    }

    public void followCheck(View view){
        Button follow = findViewById(R.id.followButton);
        if (newUser.Followed == true){
            follow.setText("Follow");
            newUser.Followed = false;
        }
        else{
            follow.setText("Unfollow");
            newUser.Followed = true;
        }
    }







}
