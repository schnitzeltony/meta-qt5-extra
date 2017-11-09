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
SRC_URI[md5sum] = "d74bb26154bf559a72d1bccf5daa1d18"
SRC_URI[sha256sum] = "7133220cf68aea67ddca787103d1bd469386ee86a8ca177da51df4edb5830f7a"

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
