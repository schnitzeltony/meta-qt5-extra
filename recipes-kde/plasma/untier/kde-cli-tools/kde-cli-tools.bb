SUMMARY = "Tools based on KDE Frameworks 5 to better interact with the system"
LICENSE = "GPL-2.0 & LGPL-2.1"
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
    kconfig-native \
    kdoctools-native \
    kcoreaddons-native \
    kpackage-native \
    kactivities \
    kiconthemes \
    ki18n \
    kcmutils \
    kdesu \
    kdelibs4support \
    kwindowsystem \
    plasma-workspace \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "07bc872cf78f8f3e45e22b8bd1413a5d37a8c9ab9b4d255c1a3ebb46618dfc10"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${libdir}/libkdeinit5_kcmshell5.so \
"
