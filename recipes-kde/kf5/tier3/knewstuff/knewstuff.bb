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
SRC_URI[md5sum] = "30a5daedb40a6c826572d48a564b56fe"
SRC_URI[sha256sum] = "697718dc43b9c230e2d59d7d786246575692abebfd1000bf32c443a20292fd0f"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5NewStuff, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5NewStuff, -S${includedir}, -S${STAGING_INCDIR}"
