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
SRC_URI[md5sum] = "79dc6ada4070f80ca7c0faf54c658dbf"
SRC_URI[sha256sum] = "bee5a1c01533895ad98a2ceea9b6cf56b75fc6cb78ea87765a3995a802d614c8"

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
