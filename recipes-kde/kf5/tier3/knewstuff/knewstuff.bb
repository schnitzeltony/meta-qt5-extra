SUMMARY = "Support for downloading application assets from the network"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

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
SRC_URI[md5sum] = "95cf2acca601bf7d80657d6bb327095b"
SRC_URI[sha256sum] = "e48578ee71e7604a1ad42dd03fb3d405aa34219cb0fc842e4fd51a7f810daa55"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5NewStuff, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5NewStuff, -S${includedir}, -S${STAGING_INCDIR}"
