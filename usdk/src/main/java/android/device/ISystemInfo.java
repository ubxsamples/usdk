package android.device;

/**
 * @description:
 * @author: haiqing zhao
 * @date: 2024/9/12 9:17
 */
public class ISystemInfo {
    DeviceManager mDeviceManager;

    public ISystemInfo() {
        mDeviceManager = new DeviceManager();
    }

    public String getDeviceId() {
        return mDeviceManager.getDeviceId();
    }
}
