package cgeo.geocaching.apps.cache.navi;

import cgeo.geocaching.R;

class RadarApp extends AbstractRadarApp {

    private static final String INTENT = "com.google.android.radar.SHOW_RADAR";
    private static final String PACKAGE_NAME = "com.eclipsim.gpsstatus2";

    RadarApp() {
        super(getString(R.string.cache_menu_radar), R.id.cache_app_radar, INTENT, PACKAGE_NAME);
    }

}