SUMMARY = "Manages the power consumption settings of a Plasma Shell"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma

DEPENDS += " \
    kcoreaddons \
    ki18n \
    kxmlgui \
    kauth \
    kconfigwidgets \
    kio \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb virtual/xserver", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "137ebd715c01672718b5854c0549f369"
SRC_URI[sha256sum] = "230b3b85d016cb5ff8ff6c6c38c18c3a89a77f24497b62b44633072950d1514a"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${libdir}/plugins \
    ${libdir}/kauth \
"

FILES_${PN}-dbg += " \
    ${libdir}/plugins/.debug \
    ${libdir}/kauth/.debug \
"
