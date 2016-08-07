SUMMARY = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop"
LICENSE = "GPLv2 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
"

inherit kde-plasma

DEPENDS += " \
    plasma-framework \
    ki18n \
    kcoreaddons \
    kguiaddons \
    kconfig \
    kwidgetsaddons \
    kwindowsystem \
    kconfigwidgets \
    kdecoration \
    frameworkintegration \
    kcmutils \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "kwayland", "", d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "",d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "1680f791ebe8c87b194cc029d33b56ff"
SRC_URI[sha256sum] = "5e7523b1b0f4aa6e69d6116308792f380c259ff2f6d7a2515f5a89268dbf1494"

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
