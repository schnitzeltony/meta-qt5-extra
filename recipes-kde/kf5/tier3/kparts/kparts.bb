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
SRC_URI[md5sum] = "354a43983d5d66fe795808d48527daad"
SRC_URI[sha256sum] = "6291872e24f45b093eb1a08b771fde6206538905d7a363b2ce22c8d4d1cf3801"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Parts, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Parts, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/k*5 ${libdir}/plugins"
FILES_${PN}-dbg += "${libdir}/plugins/.debug"
