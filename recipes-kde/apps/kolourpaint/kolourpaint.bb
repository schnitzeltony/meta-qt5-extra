SUMMARY = "KolourPaint - Paint Program"
LICENSE = "GPLv2 & GFDL-1.2 & LGPLv2 & MIT"
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
SRC_URI[md5sum] = "f550ba9f73a8783b1fce1d5c2076c9b3"
SRC_URI[sha256sum] = "7c134da2feb75a87bfda6b4265ef705868a9be03d70a828111a2869ca0b517b1"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"
