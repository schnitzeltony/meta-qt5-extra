SUMMARY = "KDE Partition Manage"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-base pkgconfig gtk-icon-cache

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcrash \
    kdoctools-native \
    kcoreaddons-native \
    ki18n \
    kiconthemes \
    kjobwidgets \
    kio \
    kservice \
    kxmlgui \
    kwidgetsaddons \
    kpmcore \
    \
    libatasmart \
    util-linux \
"

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${PV}/src/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "d50698661f443fa5ac99de6329f9d0cf"
SRC_URI[sha256sum] = "26f880c0955797778612223d3cd68345bc47ec4903b4c541dd04e7998d3083c6"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
    ${datadir}/appdata \
"
