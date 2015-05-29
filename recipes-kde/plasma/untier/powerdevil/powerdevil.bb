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
SRC_URI[md5sum] = "3f4924bd90fd05605645c49d5a4ed2e5"
SRC_URI[sha256sum] = "1459673e50c20d63562514e2732bd246a3c53791cd7dc66dbf8aae8f4fc36c1e"

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
