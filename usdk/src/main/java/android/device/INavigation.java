package android.device;

/**
 * @description:
 * @author: haiqing zhao
 * @date: 2024/9/12 9:20
 */
public class INavigation {

    DeviceManager mDeviceManager;

    public INavigation() {
        mDeviceManager = new DeviceManager();
    }

    public void enableHomeKey(boolean enable) {
        mDeviceManager.enableHomeKey(enable);
    }

    public void setLeftKeyEnabled(boolean enabled) {
        mDeviceManager.setLeftKeyEnabled(enabled);
    }

    public boolean getLeftKeyEnabled() {
        return mDeviceManager.getLeftKeyEnabled();
    }

    public boolean getHomeKeyEnabled() {
        return mDeviceManager.getHomeKeyEnabled();
    }

    public void setRightKeyEnabled(boolean enabled) {
        mDeviceManager.setRightKeyEnabled(enabled);
    }

    public boolean getRightKeyEnabled() {
        return mDeviceManager.getRightKeyEnabled();
    }
}
