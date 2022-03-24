SUMMARY = "KolourPaint - Paint Program"
LICENSE = "GPL-2.0-only & GFDL-1.2 & LGPL-2.0-only & MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7549f6da638b0246572ed9cf4275b860 \
    file://COPYING.DOC;md5=28d73eafa40ebd0ccdc6b37df8de10a3 \
    file://COPYING.LIB;md5=3214f080875748938ba060314b4f727d \
"

inherit kde-apps gtk-icon-cache mime-xdg

DEPENDS += "\
    kauth-native \
    kconfig-native \
    sonnet-native \
    kdoctools-native \
    kdelibs4support-native \
    kdesignerplugin-native \
    kdelibs4support \
    kconfigwidgets \
    kcoreaddons-native \
    kdoctools \
    ki18n \
    kiconthemes \
    kio \
    kcmutils \
    knotifications \
    kwidgetsaddons \
    kxmlgui \
    libkexiv2 \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "d2199ded688d768d8066a262d7a6b706b72a880fab9a394ffe64ae31be447f4d"

FILES:${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"
