package android.device;

/**
 * Hotspot Config
 *
 * @author: haiqing zhao
 * @date: 2024/9/12 9:14
 */
public class IHotspot {
    NetworkManagerEx mNetworkManagerEx = new NetworkManagerEx();
    DeviceManagerEx mDeviceManagerEx = new DeviceManagerEx();


    public boolean controlHotspot(boolean enable){
        return mNetworkManagerEx.controlHotspot(enable);
    }

    public void setHotspotConfig(String name,String password,int securityType , int apBands,boolean autoOpen){
         mDeviceManagerEx.setSystemConfig("setHotspotConfig",name+"-"+securityType+"-"+password+"-"+apBands+"-"+autoOpen);
    }
}
