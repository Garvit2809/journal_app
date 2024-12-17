package androidsamples.java.journalapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.JMock1Matchers.equalTo;
import static org.junit.Assert.*;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.runner.AndroidJUnit4;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
//@RunWith(AndroidJUnit4.class)
public class ExampleUnitTest {
  @Test
  public void addition_isCorrect() {
    assertEquals(4, 2 + 2);
  }
//private JournalEntryDao userDao;
//  private JournalRoomDatabase db;
//
//  @Before
//  public void createDb() {
//    Context context = ApplicationProvider.getApplicationContext();
//    db = Room.inMemoryDatabaseBuilder(context, JournalRoomDatabase.class).build();
//    userDao = db.journalEntryDao();
//  }
//
//  @After
//  public void closeDb() throws IOException {
//    db.close();
//  }

//  @Test
//  public void writeUserAndReadInList() throws Exception {
//    JournalEntry user = new JournalEntry("", "","","");
//    user.setTitle("george");
//    userDao.insert(user);
//    UUID check = user.getUid();
//    LiveData<JournalEntry> x = userDao.getEntry(check);
//    assertThat(x.getValue(), equalTo("george"));
//  }
}