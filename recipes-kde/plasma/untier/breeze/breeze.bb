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
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "",d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "a57b24aed93ac3d2f50995a0a7fcfb07"
SRC_URI[sha256sum] = "7cc284bcad00fc7505c76e6d6baff5f953a4aa03fd1ebfcd6729a383a293900d"

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
