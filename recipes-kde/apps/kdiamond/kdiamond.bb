SUMMARY = "KDiamond is a single player puzzle game"
DESCRIPTION = "KDiamond is a single player puzzle game. The object of the game is to build lines of three similar diamonds."
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gettext

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdbusaddons \
    kdoctools-native \
    kwidgetsaddons \
    ki18n \
    kguiaddons \
    kconfigwidgets \
    kiconthemes \
    kxmlgui \
    knotifications \
    knotifyconfig \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "c5a253228727ec1a4cc646aae37b2602"
SRC_URI[sha256sum] = "a338314a65388985ba24b102c3cda75d26cb634610a119b240bd9e3974aff0b3"
SRC_URI+="file://0001-fix-build-with-QT_NO_SESSIONMANAGER-set.patch"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
"
