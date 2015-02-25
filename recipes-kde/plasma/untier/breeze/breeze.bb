SUMMARY = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop"
LICENSE = "GPLv2 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING-ICONS;md5=dee28112c507e01c10d735a5c028aaaa \
"

inherit kde-plasma

DEPENDS += " \
    ki18n \
    kcoreaddons \
    kguiaddons \
    kconfig \
    kwidgetsaddons \
    kwindowsystem \
    kconfigwidgets \
    kdecoration \
    frameworkintegration \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "",d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "0a0cd80e1c6aa6f428c4d7a7d4b06bfd"
SRC_URI[sha256sum] = "c5471268ca0fb4e9f0f2f27c3d4192c306f4bc259135c9aed027a15c4bd0b761"

FILES_${PN} += " \
    ${datadir}/color-schemes \
    ${datadir}/icons \
    ${datadir}/kconf_update \
    ${datadir}/kstyle \
    ${datadir}/QtCurve \
    ${datadir}/wallpapers \
    \
    ${libdir}/plugins \
    ${libdir}/qml \
    ${libdir}/kconf_update_bin \
"

FILES_${PN}-dbg += " \
    ${libdir}/*/.debug \
    ${libdir}/*/*/.debug \
"
