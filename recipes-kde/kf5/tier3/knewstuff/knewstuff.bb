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
SRC_URI[md5sum] = "bcdb6bee371fe46abaff58993f39544d"
SRC_URI[sha256sum] = "cc1e747068f080c2fe57a59e794b0cebc7db8c79814b2e6053ab88472e210604"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5NewStuff, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5NewStuff, -S${includedir}, -S${STAGING_INCDIR}"
