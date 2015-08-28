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
    kcmutils \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "",d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "ddaa82ee94af4bdf4271132191635968"
SRC_URI[sha256sum] = "ad20ed013e789da2f434fa8c5d81e2d6775c9494b7a70b955deb5fff104aade2"

FILES_${PN} += " \
    ${datadir}/color-schemes \
    ${datadir}/icons \
    ${datadir}/kconf_update \
    ${datadir}/kservices5 \
    ${datadir}/kstyle \
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
