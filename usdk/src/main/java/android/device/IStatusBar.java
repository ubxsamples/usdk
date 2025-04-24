package android.device;

/**
 * @description:
 * @author: haiqing zhao
 * @date: 2024/9/12 9:18
 */
public class IStatusBar {
    DeviceManager mDeviceManager;

    public IStatusBar() {
        mDeviceManager  =new DeviceManager();
    }

    public void enableStatusBar (boolean enable){
        mDeviceManager.enableStatusBar(enable);
    }
}
