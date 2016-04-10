SUMMARY = "Configuration system for KNotify"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

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
SRC_URI[md5sum] = "98fb2dad8172533ce8ecd392c0e370f3"
SRC_URI[sha256sum] = "3da689c448c5b40e7e3685c73fcfc25143c040754225752e25658fdc6ca10ad7"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5NotifyConfig, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5NotifyConfig, -S${includedir}, -S${STAGING_INCDIR}"
