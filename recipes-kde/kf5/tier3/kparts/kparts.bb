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
SRC_URI[md5sum] = "0f930b69e7bf0f4477eb509a2bcb9246"
SRC_URI[sha256sum] = "4f27f0d239607a74fd4c7c42a04f427051f87d273a0da6c632a36980c3ac4873"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Parts, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Parts, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/k*5 ${libdir}/plugins"
FILES_${PN}-dbg += "${libdir}/plugins/.debug"
