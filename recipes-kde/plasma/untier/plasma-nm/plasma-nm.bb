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
    kdelibs4support \
    kdelibs4support-native \
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
SRC_URI[md5sum] = "974ea41118f0bbe078a883a3af0ffa06"
SRC_URI[sha256sum] = "f2bbbb3c9d222332a5626f616dd46ff94580c0eedba0a0249a5c90d6612072d7"

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

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
	${OE_QMAKE_PATH_PLUGINS}/*/*/.debug \
    ${OE_QMAKE_PATH_QML}/*/*/*/*/.debug \
"
