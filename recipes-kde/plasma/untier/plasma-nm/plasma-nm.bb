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
    \
    networkmanager \
"

# REVISIT optionals
# KF5ModemManagerQt
# ModemManager PROPERTIES
# MobileBroadbandProviderInfo

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "35c599c728739cded5596d4821b5a53f"
SRC_URI[sha256sum] = "c868ae9e307895eedcefca399a0976afb9bdaa53c6b7b1de39b19edca53eded2"

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
    ${OE_QMAKE_PATH_QML}/*/*/*/*/.debug \
"
