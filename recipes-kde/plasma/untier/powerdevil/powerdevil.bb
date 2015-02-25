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
SRC_URI[md5sum] = "5a82a1c9115ab58bcb19ede954083e1f"
SRC_URI[sha256sum] = "d53ddb4702b3807f4b3c31827315652a70f572850e6c7eaef67d035ef9bff090"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${libdir}/plugins \
    ${libdir}/kauth \
"

FILES_${PN}-dbg += " \
    ${libdir}/plugins/.debug \
    ${libdir}/kauth/.debug \
"
