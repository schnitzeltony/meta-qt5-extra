SUMMARY = "KMines is the classic Minesweeper game"
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
    kconfigwidgets \
    kcrash \
    kdbusaddons  \
    ki18n \
    ktextwidgets \
    kwidgetsaddons  \
    kxmlgui \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "097f21f30eda92f5ec8898017ec96607"
SRC_URI[sha256sum] = "84ec9dd6920ac34206df283ce0c90db50775e2cff562a18f583c1447c76696ed"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/knotifications5 \
"
