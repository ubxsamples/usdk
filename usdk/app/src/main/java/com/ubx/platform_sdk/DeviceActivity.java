package com.ubx.platform_sdk;

import android.content.pm.IPackageDeleteObserver;
import android.content.pm.IPackageInstallObserver;
import android.device.IApn;
import android.device.IAppInstall;
import android.device.IBattery;
import android.device.IDateAndTime;
import android.device.IDevice;
import android.device.IHotspot;
import android.device.INavigation;
import android.device.IStatusBar;
import android.device.ISystemInfo;
import android.device.IWifi;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ubx.platform_sdk.databinding.ActivityDeviceBinding;

public class DeviceActivity extends AppCompatActivity {

    ActivityDeviceBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDeviceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ISystemInfo systemInfo = new ISystemInfo();
        INavigation navigation = new INavigation();
        IDateAndTime dateAndTime = new IDateAndTime();
        IStatusBar statusBar = new IStatusBar();


        binding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DeviceActivity.this, systemInfo.getDeviceId(), Toast.LENGTH_SHORT).show();
            }
        });
        binding.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DeviceActivity.this, "123", Toast.LENGTH_SHORT).show();
                navigation.enableHomeKey(true);
            }
        });
        binding.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigation.enableHomeKey(false);
            }
        });
        binding.btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DeviceActivity.this, navigation.getHomeKeyEnabled() + "", Toast.LENGTH_SHORT).show();
            }
        });
        binding.btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigation.setLeftKeyEnabled(true);
            }
        });
        binding.btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigation.setLeftKeyEnabled(false);
            }
        });
        binding.btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DeviceActivity.this, navigation.getLeftKeyEnabled() + "", Toast.LENGTH_SHORT).show();
            }
        });
        binding.btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigation.setRightKeyEnabled(false);
            }
        });
        binding.btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigation.setRightKeyEnabled(true);
            }
        });
        binding.btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DeviceActivity.this, navigation.getRightKeyEnabled() + "", Toast.LENGTH_SHORT).show();
            }
        });
        binding.btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dateAndTime.setCurrentTime(System.currentTimeMillis() + 60000);
            }
        });
        binding.btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                statusBar.enableStatusBar(true);
            }
        });
        binding.btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                statusBar.enableStatusBar(false);
            }
        });
        IApn apn = new IApn();
        binding.btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                apn.setAPN("test-apn", "3gnet", null, 0, "none", null, "none", null, "460", "01", null, 0, 0, "default,supl,dun", null, 0, null, true);
            }
        });
        binding.btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DeviceActivity.this, apn.queryAPN("name=?", new String[]{"test-apn"}), Toast.LENGTH_SHORT).show();
            }
        });
        binding.btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DeviceActivity.this, "" + apn.deleteAPN("name=?", new String[]{"test-apn"}), Toast.LENGTH_SHORT).show();
            }
        });
        IDevice device = new IDevice();
        binding.btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                device.shutdown(true);
            }
        });
        binding.btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                device.shutdown(false);
            }
        });
        binding.btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                device.wipeData(0);
            }
        });
        binding.btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                device.wipeData(1);
            }
        });
        binding.btn201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                device.enableMobileData(false);
            }
        });
        binding.btn202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                device.enableMobileData(true);
            }
        });
        binding.btn203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                device.enableBluetooth(false);
            }
        });
        binding.btn204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                device.enableBluetooth(true);
            }
        });
        binding.btn205.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                device.enableAirplaneMode(false);
            }
        });
        binding.btn206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                device.enableAirplaneMode(true);
            }
        });
        binding.btn207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                device.enableNFC(false);
            }
        });
        binding.btn208.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                device.enableNFC(true);
            }
        });

        binding.btn209.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new IWifi().enableWifi(false);
            }
        });
        binding.btn210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new IWifi().enableWifi(true);
            }
        });
        binding.btn211.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                device.startLocalOsUpdate(DeviceActivity.this, "/sdcard/ota.zip");
            }
        });
        binding.btn212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new IWifi().disconnectCurrentWifi();
            }
        });
        binding.btn213.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new IWifi().connectToWifiNetwork("UROVOAP", "urovo@36ap", 2);
            }
        });
        binding.btn214.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new IWifi().removeSavedWifiNetwork("UROVOAP");
            }
        });
        IAppInstall appInstall = new IAppInstall();
        binding.btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appInstall.installApplication("/sdcard/test.apk");
            }
        });
        binding.btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appInstall.installApplication("/sdcard/test.apk", false, new IPackageInstallObserver.Stub() {
                    @Override
                    public void packageInstalled(String pkgName, int returnCode) throws RemoteException {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(DeviceActivity.this, pkgName + " " + returnCode, Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                });
            }
        });
        binding.btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appInstall.uninstallApplication("com.ubx.manager");
            }
        });
        binding.btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appInstall.uninstallApplication("com.ubx.manager", false, new IPackageDeleteObserver.Stub() {
                    @Override
                    public void packageDeleted(String pkgName, int returnCode) throws RemoteException {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(DeviceActivity.this, pkgName + " " + returnCode, Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                });
            }
        });
        IHotspot hotspot = new IHotspot();
        binding.btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hotspot.controlHotspot(true);
            }
        });
        binding.btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hotspot.controlHotspot(false);
            }
        });
        binding.btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hotspot.setHotspotConfig("test", "99999999", 1, 1, true);
            }
        });
        IBattery iBattery = new IBattery(this);

        binding.btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DeviceActivity.this, "Battery SN --> " + iBattery.getSerialNumber(), Toast.LENGTH_SHORT).show();
            }
        });
        binding.btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DeviceActivity.this, "The date the battery was manufactured --> " + iBattery.getBatteryManufactureDate(), Toast.LENGTH_SHORT).show();
            }
        });
        binding.btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DeviceActivity.this, "Battery rated capacity --> " + iBattery.getRatedCapacity(), Toast.LENGTH_SHORT).show();
            }
        });
        binding.btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DeviceActivity.this, "Current battery capacity --> " + iBattery.getCurrentCapacity(), Toast.LENGTH_SHORT).show();
            }
        });
        binding.btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DeviceActivity.this, "The battery has free power left --> " + iBattery.getCurrentCharge(), Toast.LENGTH_SHORT).show();
            }
        });
        binding.btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DeviceActivity.this, "Battery health --> " + iBattery.getBatteryHealth(), Toast.LENGTH_SHORT).show();
            }
        });
        binding.btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DeviceActivity.this, "Number of battery charges --> " + iBattery.getCycleCount(), Toast.LENGTH_SHORT).show();
            }
        });
        binding.btn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DeviceActivity.this, "Battery temperature --> " + iBattery.getTemp(), Toast.LENGTH_SHORT).show();
            }
        });
        binding.btn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DeviceActivity.this, "Whether it is a smart battery --> " + iBattery.isSmartBattery(), Toast.LENGTH_SHORT).show();
            }
        });
        binding.btn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DeviceActivity.this, "Battery PN --> " + iBattery.getPN(), Toast.LENGTH_SHORT).show();
            }
        });
        binding.btn38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DeviceActivity.this, "Battery first use time --> " + iBattery.getBatteryFirstUseDate(), Toast.LENGTH_SHORT).show();
            }
        });
        binding.btn39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                device.setDefaultSimData(0);
            }
        });
        binding.btn40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                device.setDefaultSimData(1);
            }
        });
        binding.btn41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                device.controlSimData(0,true);
            }
        });
        binding.btn42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                device.controlSimData(0,false);
            }
        });
        binding.btn43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                device.controlSimData(1,true);
            }
        });
        binding.btn44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                device.controlSimData(1,false);
            }
        });

    }
}