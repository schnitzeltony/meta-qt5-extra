SUMMARY = "Provides integration of QML and KDE Frameworks"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qtdeclarative kconfig ki18n kiconthemes kio kwidgetsaddons kwindowsystem kglobalaccel kguiaddons kpackage libepoxy"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ef1f08f519b4ad292e49138a5118a7b3"
SRC_URI[sha256sum] = "84b15fb7092d963841fd70d1f603ca4a704e0284154368fc2fef80c04b2ea1f4"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Declarative, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Declarative, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${libdir}/${QT_DIR_NAME}/qml/org/kde"
FILES_${PN}-dbg += " \
    ${libdir}/${QT_DIR_NAME}/qml/org/kde/*/.debug \
    ${libdir}/${QT_DIR_NAME}/qml/org/kde/*/*/.debug \
"
