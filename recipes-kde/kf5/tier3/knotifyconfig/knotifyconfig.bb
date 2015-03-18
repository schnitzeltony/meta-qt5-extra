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
SRC_URI[md5sum] = "08bfc1548b69a6bdd491e9aac17ec7e6"
SRC_URI[sha256sum] = "759bca50921bf2a9467d55d65508c18ce9b2d348de416ab42fedc91a4466fdc4"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5NotifyConfig, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5NotifyConfig, -S${includedir}, -S${STAGING_INCDIR}"
