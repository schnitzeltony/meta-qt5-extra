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
SRC_URI[md5sum] = "0583e3bc9a545988fea9e808c7f6cb21"
SRC_URI[sha256sum] = "72b7670dacdb727e9f10b066ae03a670d774471565336d90f4197b892ff33f2f"

CMAKE_ALIGN_SYSROOT[1] = "KF5Kross, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Kross, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${libdir}/${QT_DIR_NAME}/plugins \
"

FILES_${PN}-dbg += " \
    ${libdir}/${QT_DIR_NAME}/plugins/.debug \
    ${libdir}/${QT_DIR_NAME}/plugins/*/.debug \
"
