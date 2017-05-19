SUMMARY = "KolourPaint - Paint Program"
LICENSE = "GPLv2 & GFDL-1.2 & LGPLv2 & MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7549f6da638b0246572ed9cf4275b860 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
    file://COPYING.LIB;md5=3214f080875748938ba060314b4f727d \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kdesignerplugin-native \
    sonnet-native \
    kdelibs4support \
    kdelibs4support-native \
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
SRC_URI[md5sum] = "56cf4b1c2d591595089431656a2bca2f"
SRC_URI[sha256sum] = "6ec834dae99bac4fbd7a9ab504006f766c4b97f11c134f56fb857842cb06f7d7"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"
