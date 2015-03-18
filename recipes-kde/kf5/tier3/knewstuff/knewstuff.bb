SUMMARY = "Support for downloading application assets from the network"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += " \
    karchive \
    kcompletion \
    kconfig \
    kcoreaddons \
    ki18n \
    kiconthemes \
    kio \
    kitemviews \
    ktextwidgets \
    kwidgetsaddons \
    kxmlgui \
    attica \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "74d99cdfe7c8c018966c3dec93c81cea"
SRC_URI[sha256sum] = "0846b5ef99ea50f431ae4439865a2eb66c04e0cb62d60f4fdfeb2ab58e8a5d5e"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5NewStuff, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5NewStuff, -S${includedir}, -S${STAGING_INCDIR}"
