package sciencehack.smartr;

import android.app.Application;

/**
 * Created by gigi on 2015/11/15.
 */
public class MyApplication extends Application {
    public MyFitnessPalService getMyFitnessPalService() {
        return mMyFitnessPalService;
    }

    public void setMyFitnessPalService(MyFitnessPalService myFitnessPalService) {
        mMyFitnessPalService = myFitnessPalService;
    }

    private MyFitnessPalService mMyFitnessPalService;
}
