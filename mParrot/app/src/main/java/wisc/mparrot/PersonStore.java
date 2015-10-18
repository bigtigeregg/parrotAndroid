package wisc.mparrot;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by wuyue on 10/18/15.
 */
public class PersonStore {
    public static final String SharePreferenceName = "UserInfo";
    SharedPreferences mSP;
    public PersonStore(Context contest){
        mSP = contest.getSharedPreferences(SharePreferenceName, 0);
    }
    public void storePersonInfo(Person person){
        SharedPreferences.Editor myEditor = mSP.edit();
        myEditor.putString("userName", person.username);
        myEditor.putString("passWord", person.password);
        myEditor.putString("emailAddress",person.emailAddress);
        myEditor.commit();
    }
}
