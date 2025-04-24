package android.device;

/**
 * @description:
 * @author: haiqing zhao
 * @date: 2024/9/12 9:23
 */
public class IDateAndTime {

    DeviceManager mDeviceManager;

    public IDateAndTime() {
        mDeviceManager = new DeviceManager();
    }

    public boolean setCurrentTime(long when) {
        return mDeviceManager.setCurrentTime(when);
    }
}
