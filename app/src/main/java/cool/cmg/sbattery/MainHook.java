package cool.cmg.sbattery;

import de.robv.android.xposed.IXposedHookInitPackageResources;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_InitPackageResources;

public class MainHook implements IXposedHookInitPackageResources {
    @Override
    public void handleInitPackageResources(XC_InitPackageResources.InitPackageResourcesParam resparam) throws Throwable {
        String SYSTEM_UI = "com.android.systemui";
        if (!SYSTEM_UI.equals(resparam.packageName)) {
            return;
        }
        try {
            resparam.res.setReplacement(
                    SYSTEM_UI,
                    "string",
                    "status_bar_settings_uniform_battery_meter_format",
                    "%d"
            );
        } catch (Exception e) {
            XposedBridge.log(e);
        }
    }
}
