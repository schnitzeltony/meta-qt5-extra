SUMMARY = "Manages the power consumption settings of a Plasma Shell"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

DEPENDS += " \
    kactivities \
    kauth \
    kidletime \
    kconfig \
    solid \
    ki18n \
    kglobalaccel \
    kio \
    knotifyconfig \
    kscreen \
    kdelibs4support \
    plasma-workspace \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "ba3f8e0ca8e15c0a361d9100c52a992c"
SRC_URI[sha256sum] = "15b2f95f50288a3be3786d652ddca9ecccb734f7099e0bf78127a85cbf1f25df"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${libdir}/${QT_DIR_NAME}/plugins \
    ${libdir}/kauth \
"

FILES_${PN}-dbg += " \
    ${libdir}/${QT_DIR_NAME}/plugins/.debug \
    ${libdir}/kauth/.debug \
"
