SUMMARY = "Document centric plugin system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += " \
    kconfig \
    kcoreaddons \
    ki18n \
    kiconthemes \
    kio \
    kjobwidgets \
    knotifications \
    kservice \
    ktextwidgets \
    kwidgetsaddons \
    kxmlgui \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "497e746e8c9c05b50d21e6a6e3541470"
SRC_URI[sha256sum] = "0787e228f110ef8a3c7d0408b031f366131315e7a0121ea7d89163bc684eff41"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Parts, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Parts, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${libdir}/${QT_DIR_NAME}/plugins \
"
FILES_${PN}-dbg += "${libdir}/${QT_DIR_NAME}/plugins/.debug"
