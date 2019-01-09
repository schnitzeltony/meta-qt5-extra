SUMMARY = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma gettext

DEPENDS += "\
    kauth-native \
    plasma-framework \
    ki18n \
    kcoreaddons \
    kcoreaddons-native \
    kguiaddons \
    kconfig \
    kconfig-native \
    kwidgetsaddons \
    kwindowsystem \
    kconfigwidgets \
    kdecoration \
    frameworkintegration \
    kcmutils \
    kpackage-native \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "",d)} \
    fftw \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "c166ab0d7aaf99b14c00ebe08a85e41b"
SRC_URI[sha256sum] = "e78e6eec31cf8fb7c6d1d823e07bebcabf978ba94772081490a38a5ac5871796"

FILES_${PN} += " \
    ${datadir}/color-schemes \
    ${datadir}/icons \
    ${datadir}/kconf_update \
    ${datadir}/kservices5 \
    ${datadir}/kstyle \
    ${datadir}/plasma \
    ${datadir}/QtCurve \
    ${datadir}/wallpapers \
    \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
    ${libdir}/kconf_update_bin \
"

FILES_${PN}-dbg += " \
    ${libdir}/*/.debug \
    ${libdir}/*/*/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
"

RDEPENDS_${PN} += "milou"
