SUMMARY = "KDE's audio mixer"
LICENSE = "GPLv2 & GFDL-1.2 & LGPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=24ea4c7092233849b4394699333b5c56 \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
"

inherit kde-apps gettext

DEPENDS += " \
    alsa-lib \
    libcanberra \
    \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kconfigwidgets \
    kpackage-native \
    kdesignerplugin-native \
    sonnet-native \
    kdbusaddons \
    kglobalaccel \
    ki18n \
    kiconthemes \
    kxmlgui \
    plasma-framework \
    kinit \
"

PACKAGECONFIG = "pulseaudio"    
PACKAGECONFIG[pulseaudio] = ",,pulseaudio"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "7e84451af562bf4b599c083919e973e1"
SRC_URI[sha256sum] = "49311a4043acaba2ee58ce3b715334aef11a19338b1c84b2f15484c48569a126"

SRC_URI += "file://0001-Fix-build-with-QT_NO_SESSIONMANAGER-set.patch"

EXTRA_OECMAKE += "-DKMIX_KF5_BUILD=1"

FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${datadir}/icons \
    ${datadir}/dbus-1 \
    \
    ${libdir}/libkdeinit5*.so \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/plasma/*/.debug \
"
