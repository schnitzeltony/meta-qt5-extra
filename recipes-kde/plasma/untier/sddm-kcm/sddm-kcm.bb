SUMMARY = "Manages the power consumption settings of a Plasma Shell"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma distro_features_check

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
SRC_URI[md5sum] = "c28111930218ccdaac103d216c361558"
SRC_URI[sha256sum] = "89c3d198cd07d7b9c63b2ed6ea888b8e9099b356e71d8e5d79e768b4cee7719b"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${libdir}/${QT_DIR_NAME}/plugins \
    ${libdir}/kauth \
"

FILES_${PN}-dbg += " \
    ${libdir}/${QT_DIR_NAME}/plugins/.debug \
    ${libdir}/kauth/.debug \
"
