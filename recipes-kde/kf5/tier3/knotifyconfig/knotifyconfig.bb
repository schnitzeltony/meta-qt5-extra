SUMMARY = "Configuration system for KNotify"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += " \
    phonon \
    kcompletion \
    kconfig \
    ki18n \
    kio \
    kservice \
    kconfigwidgets \
    knotifications \
    kwidgetsaddons \
    kxmlgui \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ef6469371ce05c59555c33b27aee2ed9"
SRC_URI[sha256sum] = "dae21941999cbcceeabfa2310cef4cca1c7362872070c9e2d004b473cd145b5f"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5NotifyConfig, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5NotifyConfig, -S${includedir}, -S${STAGING_INCDIR}"
