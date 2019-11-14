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
SRC_URI[md5sum] = "fde85cab245f8337767663430c4c48b0"
SRC_URI[sha256sum] = "89dde39b69e857d102e60e7b33cc5dd3481539484678ff8cdb30393d5a4d28c6"

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

RDEPENDS_${PN} += "milou"
