SUMMARY = "KSE sysguard library"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma

DEPENDS += " \
    ki18n \
    kwindowsystem \
    kservice \
    kcompletion \
    kwidgetsaddons \
    kio \
    kcoreaddons \
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
    modemmanager-qt \
    networkmanager-qt \
    qca \
    \
    networkmanager \
"

# REVISIT optionals
# KF5ModemManagerQt
# ModemManager PROPERTIES
# MobileBroadbandProviderInfo

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "cfdced43f3d02144ff1f77990816a4e7"
SRC_URI[sha256sum] = "e6b6d0a1dde044aca48c53fc134f1ed0fbcd0cef49f91147b4f11300d8b6646c"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/plasma \
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
