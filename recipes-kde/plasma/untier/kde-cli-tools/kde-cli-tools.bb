SUMMARY = "Tools based on KDE Frameworks 5 to better interact with the system"
LICENSE = "Artistic-2.0 & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & LGPL-2.0-only & LGPL-2.0-or-later & LGPL-2.1-only & LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/Artistic-2.0.txt;md5=7f086b1df814d268c59965d8db41f13c \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/LGPL-2.0-only.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.1-only.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-3.0-only.txt;md5=8d51f5b5fd447f7a1040c3dc9f0a8de6 \
"

inherit kde-plasma gettext mime-xdg

DEPENDS += " \
    qtsvg \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "",d)} \
    \
    kauth-native \
    kconfig-native \
    kdoctools-native \
    kcoreaddons-native \
    kpackage-native \
    kcmutils-native \
    kactivities \
    kiconthemes \
    ki18n \
    kcmutils \
    kdesu \
    kwindowsystem \
    plasma-workspace \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "e9807343f97aeabeedc557277d195e7fe8ea06f2299b66ca5cb5610c5bee8c6f"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES:${PN} += " \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${libdir}/libkdeinit5_kcmshell5.so \
"
