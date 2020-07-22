SUMMARY = "KDE Wallet Manager is a tool to manage the passwords on your KDE system"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-apps gtk-icon-cache mime-xdg

DEPENDS += " \
    kcoreaddons-native \
    kdoctools-native \
    kauth-native \
    kconfig-native \
    sonnet-native \
    kwallet \
    kservice \
    kcmutils \
    ki18n \
    kxmlgui \
    kconfig-native \
    kconfigwidgets \
    kdbusaddons \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "c3e625626a2f6ae6b3ac17805ee1685e"
SRC_URI[sha256sum] = "3821d17f5238bd51b9d19ef5974e063aa6426f35afcd0cffa89af109c770151e"
SRC_URI += "file://0001-fix-build-with-QT_NO_SESSIONMANAGER-set.patch"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${datadir}/icons \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
