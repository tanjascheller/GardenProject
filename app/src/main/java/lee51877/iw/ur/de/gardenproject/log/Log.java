package lee51877.iw.ur.de.gardenproject.log;

/**
 * Created by Ema on 10.08.2015.
 */
public class Log {
    public static final boolean DEBUG = true;
    public static final String TAG = "GardenProject";

    public static void d(String tag, String msg) {
        if (DEBUG) {
            android.util.Log.d(tag, msg);
        }
    }

    public static void d(String msg) {
        if (DEBUG) {
            android.util.Log.d(TAG, msg);
        }
    }
}
