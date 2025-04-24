package android.device;

/**
 * @description:
 * @author: haiqing zhao
 * @date: 2024/9/12 9:23
 */
public class IDevice {

    DeviceManager mDeviceManager;
    public IDevice() {
        mDeviceManager = new DeviceManager();
    }

    public void shutdown(boolean reboot) {
        mDeviceManager.shutdown(reboot);
    }

    public void wipeData(int flags) {
        mDeviceManager.wipeData(flags);
    }
}

