SUMMARY = "Multi-language application scripting"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids cmake-lib

DEPENDS += " \
    kcompletion \
    kcoreaddons \
    kdoctools \
    ki18n \
    kiconthemes \
    kio \
    kparts \
    kservice \
    kwidgetsaddons \
    kxmlgui \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3bbbe20155703ae8b013c6bced6e7a11"
SRC_URI[sha256sum] = "3d2e4fead4c7d85f617482f1db8621f1804a6d2d6a7ede58239febefa25a2f30"

CMAKE_ALIGN_SYSROOT[1] = "KF5Kross, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Kross, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
"
