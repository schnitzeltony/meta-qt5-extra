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
SRC_URI[md5sum] = "6fb1281714f7da7d9b9dfcbdbf69147e"
SRC_URI[sha256sum] = "704e9bef93747eb3d8b2f159e874ef48f037edb3359b0cd669627d0d6d4003e9"

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
