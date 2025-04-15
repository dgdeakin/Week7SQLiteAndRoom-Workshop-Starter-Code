package com.example.week7sqliteandroom_workshop_starter_code;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
//import androidx.room.Room;

import java.util.List;

public class ShowUsersActivity extends AppCompatActivity {

    ListView userListView;

    // TODO 1: add AppDatabase and UserDao
//    AppDatabase db;
//    UserDao userDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_show_users);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // TODO 2: initialize AppDatabase and UserDao

//        db = Room.databaseBuilder(getApplicationContext(),
//                AppDatabase.class, "user-database").allowMainThreadQueries().build();
//        userDao = db.userDao();

        userListView = findViewById(R.id.usersListView);

        // TODO 3: add logic to show all users
//        List<User> users = userDao.getAllUsers();
//        String[] usernames = new String[users.size()];
//        for(int i=0; i <users.size(); i++){
//            usernames[i] = users.get(i).getUsername();
//        }

        // TODO 4: create adapter and set it to the ListView
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
//                android.R.layout.simple_list_item_1, usernames);
//        userListView.setAdapter(adapter);

    }
}