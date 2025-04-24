package android.device;

import android.content.pm.IPackageDeleteObserver;
import android.content.pm.IPackageInstallObserver;

/**
 * @description:
 * @author: haiqing zhao
 * @date: 2024/9/12 9:25
 */
public class IAppInstall {

    DeviceManager mDeviceManager;

    public IAppInstall() {
        mDeviceManager = new DeviceManager();
    }

    public boolean installApplication(String apkFilePath) {
        return mDeviceManager.installApplication(apkFilePath);
    }

    public boolean installApplication(String apkFilePath, boolean installOnSDCard, IPackageInstallObserver observer) {
        return mDeviceManager.installApplication(apkFilePath,installOnSDCard,observer);
    }

    public boolean uninstallApplication(String packageName) {
        return mDeviceManager.uninstallApplication(packageName);
    }

    public boolean uninstallApplication(String packageName, boolean keepDataAndCache, IPackageDeleteObserver observer) {
        return mDeviceManager.uninstallApplication(packageName,keepDataAndCache,observer);
    }

}
