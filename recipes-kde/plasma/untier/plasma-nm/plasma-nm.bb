SUMMARY = "KSE sysguard library"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma gettext

DEPENDS += " \
    kauth-native \
    ki18n \
    kwindowsystem \
    kconfig-native \
    kservice \
    kcompletion \
    kwidgetsaddons \
    kio \
    kcoreaddons \
    kcoreaddons-native \
    kpackage-native \
    kdesignerplugin-native \
    kwallet \
    kitemviews \
    kitemmodels \
    kxmlgui \
    kconfigwidgets \
    kiconthemes \
    solid \
    kdbusaddons \
    knotifications \
    plasma-framework \
    kdeclarative \
    kinit \
    modemmanager-qt \
    networkmanager-qt \
    sonnet-native \
    qca \
    \
    networkmanager \
"

# REVISIT optionals
# KF5ModemManagerQt
# ModemManager PROPERTIES
# MobileBroadbandProviderInfo

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "46492d319950a48f3a192f1d883a4020"
SRC_URI[sha256sum] = "7fe3d72bd81f57cf2df0fcb33e957355110efe31f4b1a71a4c0b6ca121813cd1"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

RDEPENDS_${PN} = "networkmanager"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${datadir}/kcm_networkmanagement/qml \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
    ${libdir}/*.so \
"
