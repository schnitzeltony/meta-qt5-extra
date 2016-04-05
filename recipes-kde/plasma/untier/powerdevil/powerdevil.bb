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
SRC_URI[md5sum] = "13ea2c2b045bf9f094310a5a31c2509b"
SRC_URI[sha256sum] = "9d13f4eb9423c209935aa11524e399a64188d29a098f339624b25a1993b93a49"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${libdir}/kauth \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/.debug \
    ${libdir}/kauth/.debug \
"
