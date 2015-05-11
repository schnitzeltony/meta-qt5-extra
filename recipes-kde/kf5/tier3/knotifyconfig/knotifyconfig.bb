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
SRC_URI[md5sum] = "7b86b47aaddff3b95d62738fd752b5a5"
SRC_URI[sha256sum] = "953a98b53f7851a870de47ccb29d976ba25911466dd546f5118b4c6dfd6a0dfe"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5NotifyConfig, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5NotifyConfig, -S${includedir}, -S${STAGING_INCDIR}"
