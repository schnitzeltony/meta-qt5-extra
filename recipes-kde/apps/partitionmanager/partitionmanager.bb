SUMMARY = "KDE Partition Manage"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING.md;md5=97a733ff40c50b4bfc74471e1f6ca88b"

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

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${PV}/src/${BP}.tar.xz"
SRC_URI[sha256sum] = "d61e20237c854cd3622b19cec5939c51bf4f350741106fdb44fc5a82155735b4"
PV = "4.1.0"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
    ${datadir}/appdata \
"
