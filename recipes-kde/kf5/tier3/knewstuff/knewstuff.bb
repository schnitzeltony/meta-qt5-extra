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
SRC_URI[md5sum] = "567dc7bb3520b9e8cf2f92b7afd854f3"
SRC_URI[sha256sum] = "f439a71807d49d24d9edbaf9bdb1ea37551b17181caa8a854552603fc573e371"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5NewStuff, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5NewStuff, -S${includedir}, -S${STAGING_INCDIR}"
