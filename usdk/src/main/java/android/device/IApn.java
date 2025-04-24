package android.device;

/**
 * @description:
 * @author: haiqing zhao
 * @date: 2024/9/12 9:28
 */
public class IApn {
    DeviceManager mDeviceManager;

    public IApn() {
        mDeviceManager = new DeviceManager();
    }
    public boolean setAPN(String name, String apn, String proxy, int port, String user, String server, String password, String mmsc, String mcc, String mnc, String mmsproxy, int mmsport, int authtype, String type, String protocol, int bearer, String roamingprotocol, boolean current) {
        return mDeviceManager.setAPN(name, apn, proxy, port, user, server, password, mmsc, mcc, mnc, mmsproxy, mmsport, authtype, type, protocol, bearer, roamingprotocol, current);
    }

    public String queryAPN(String selection, String[] selectionArgs) {
        return mDeviceManager.queryAPN(selection,selectionArgs);
    }

    public int deleteAPN(String where, String[] whereArgs) {
        return mDeviceManager.deleteAPN(where, whereArgs);
    }

}
