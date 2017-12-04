SUMMARY = "Tools based on KDE Frameworks 5 to better interact with the system"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma gettext

DEPENDS += " \
    qtsvg \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "",d)} \
    \
    kauth-native \
    kconfig \
    kconfig-native \
    kdoctools-native \
    kcoreaddons-native \
    kactivities \
    kiconthemes \
    ki18n \
    kcmutils \
    kdesu \
    kdelibs4support \
    kwindowsystem \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "d88f68c4dc164ffd01c8b97747a98d5b"
SRC_URI[sha256sum] = "afed425db88af5f8f8d4ddb8de8c62b5d0e42893279b4d67ca961691b52e811c"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${libdir}/libkdeinit5_kcmshell5.so \
"

FILES_${PN}-dbg += " \
    ${libdir}/*/.debug \
    ${libdir}/${BPN}/*/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
