SUMMARY = "Provides integration of QML and KDE Frameworks"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qtdeclarative kconfig ki18n kiconthemes kio kwidgetsaddons kwindowsystem kglobalaccel kguiaddons kpackage libepoxy"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "09de5d66de47f645d50c57ac735eeb3c"
SRC_URI[sha256sum] = "cfa718c5b86684c106535dff659e3f4a9dc6227becdb90928ec2da38c8c3dacd"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Declarative, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Declarative, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${libdir}/${QT_DIR_NAME}/qml/org/kde"
FILES_${PN}-dbg += " \
    ${libdir}/${QT_DIR_NAME}/qml/org/kde/*/.debug \
    ${libdir}/${QT_DIR_NAME}/qml/org/kde/*/*/.debug \
"
