package livingspring.turningpoint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class SettingsActivity extends AppCompatActivity {

  /*  private Toolbar mToolbar;
    private EditText userName, userProfName, userStatus, userCountry, userGender, userRelation, userDob, userChurch;
    private Button UpdateAcountSettingsButton;
    private CircleImageView userProfImage;
    private DatabaseReference SettingsUserRef;
    private FirebaseAuth mAuth;
    String currentUserID;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


      /*  mAuth = FirebaseAuth.getInstance();
        SettingsUserRef = FirebaseDatabase.getInstance().getReference().child("Users").child(currentUserID);

        currentUserID = mAuth.getCurrentUser().getUid();
        mToolbar =(Toolbar)findViewById(R.id.settings_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Account Settings");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        userName = (EditText)findViewById(R.id.settings_username);
        userProfName = (EditText)findViewById(R.id.settings_profile_full_name);
        userStatus = (EditText)findViewById(R.id.settings_status);
        userCountry = (EditText)findViewById(R.id.settings_country);
        userGender = (EditText)findViewById(R.id.settings_gender);
        userRelation = (EditText)findViewById(R.id.settings_relationship_status);
        userDob = (EditText)findViewById(R.id.settings_dob);
        userChurch = (EditText)findViewById(R.id.settings_church_assembly);
        UpdateAcountSettingsButton = (Button)findViewById(R.id.update_account_settings_button);
        userProfImage = (CircleImageView) findViewById(R.id.settings_profile_image);*/

       /* SettingsUserRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot)
            {
                if(dataSnapshot.exists())
                {
                    String myProfileImage = dataSnapshot.child("profileimage").getValue().toString();
                    String myUserName = dataSnapshot.child("username").getValue().toString();
                    String myProfileName = dataSnapshot.child("fullname").getValue().toString();
                    String myProfileStatus = dataSnapshot.child("status").getValue().toString();
                    String myDOB = dataSnapshot.child("dob").getValue().toString();
                    String myCountry = dataSnapshot.child("country").getValue().toString();
                    String myGender = dataSnapshot.child("gender").getValue().toString();
                    String myRelationshipStatus = dataSnapshot.child("relationshipstatus").getValue().toString();
                    String myChurchAssembly = dataSnapshot.child("Church_Assembly").getValue().toString();

                    Picasso.with(SettingsActivity.this).load(myProfileImage).placeholder(R.drawable.profile).into(userProfImage);

                    userName.setText(myUserName);
                    userProfName.setText(myProfileName);
                    userStatus.setText(myProfileStatus);
                    userDob.setText(myDOB);
                    userCountry.setText(myCountry);
                    userGender.setText(myGender);
                    userRelation.setText(myRelationshipStatus);
                    userChurch.setText(myChurchAssembly);
            }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });*/
    }
}
