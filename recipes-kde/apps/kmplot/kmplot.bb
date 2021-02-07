SUMMARY = "Mathematical Function Plotter"
LICENSE = "GPL-2.0 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7974e16b472f00bbbadf2d006aa00c50 \
    file://COPYING.DOC;md5=28d73eafa40ebd0ccdc6b37df8de10a3 \
"

inherit kde-apps gtk-icon-cache mime-xdg

DEPENDS += " \
    qtsvg \
    \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    kcrash \
    kguiaddons \
    ki18n \
    kparts \
    kwidgetsaddons \
    kdbusaddons \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "d83cc43a17b6c96338630ca4eadf63f738793588d2bec3e97bb9f5f43e32d250"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
    ${datadir}/dbus-1 \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
