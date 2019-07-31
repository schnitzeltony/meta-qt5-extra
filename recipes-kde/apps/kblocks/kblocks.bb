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
SRC_URI[md5sum] = "4f821cbb0b4239db9a54607f53bfef74"
SRC_URI[sha256sum] = "10b350f91978c221c224c42e2f50dc8c2e86e187de8e46258b10cf3799fb4b74"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/icons \
    ${datadir}/kxmlgui5 \
"
