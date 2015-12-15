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
SRC_URI[md5sum] = "d39a576058ff1c8f54f6af1f2894317a"
SRC_URI[sha256sum] = "0ffac9d50564928136d68c74a2d27f6eab450f51474e5dcceee09cf377420160"

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
