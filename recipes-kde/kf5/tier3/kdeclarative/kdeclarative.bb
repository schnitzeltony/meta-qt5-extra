SUMMARY = "Provides integration of QML and KDE Frameworks"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qtdeclarative kconfig ki18n kiconthemes kio kwidgetsaddons kwindowsystem kglobalaccel kguiaddons libepoxy"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "414cb5a4c26c5c3150c2867e29ec0181"
SRC_URI[sha256sum] = "afe4295bcb8e85b0ffee754b0db29056a7c422bf62934233991a812292bba18e"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Declarative, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Declarative, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${libdir}/qml/org/kde"
FILES_${PN}-dbg += "${libdir}/qml/org/kde/*/.debug ${libdir}/qml/org/kde/*/*/.debug"
