SUMMARY = "KBlocks - Falling Blocks Game"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    kcrash \
    kdbusaddons  \
    kwidgetsaddons  \
    ki18n \
    kconfigwidgets \
    kxmlgui \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "7a78d09f7faa0cd6419fe7d865a624a9"
SRC_URI[sha256sum] = "5cd33012278ebadf0ae1bc71bb5fe0917b73f1ac7806a1d2c3038ef3824b6388"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/icons \
    ${datadir}/kxmlgui5 \
"
