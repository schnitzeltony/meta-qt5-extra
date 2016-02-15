SUMMARY = "Provides integration of QML and KDE Frameworks"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qtdeclarative kconfig ki18n kiconthemes kio kwidgetsaddons kwindowsystem kglobalaccel kguiaddons kpackage libepoxy"

SRC_URI += "file://0001-kpackagelauncherqml-Add-include-of-QDebug.patch"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "045ed4200129ee96b8ca521a005ac33c"
SRC_URI[sha256sum] = "4f146f455fac81a5d968e189419c4ed2cb7315fa62f4fef1bef54b7efc17e00d"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Declarative, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Declarative, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/org/kde"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_QML}/org/kde/*/.debug \
    ${OE_QMAKE_PATH_QML}/org/kde/*/*/.debug \
"
