SUMMARY = "Periodic Table of Elements"
LICENSE = "BSD-2-Clause & BSD-3-Clause & CC0-1.0 & GFDL-1.2 & GPL-2.0-or-later & LGPL-2.0-or-later & LGPL-2.1-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=534956ece1a160a65f088a8f82672ef9 \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GFDL-1.2-or-later.txt;md5=9f58808219e9a42ff1228309d6f83dc6 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=147a320ed8b16b036829a0c71d424153 \
"

# avogadrolibs -> glew
REQUIRED_DISTRO_FEATURES = "opengl"

inherit kde-apps gettext pkgconfig gtk-icon-cache mime-xdg features_check

DEPENDS += " \
    qtsvg \
    libeigen \
    openbabel \
    avogadrolibs \
    \
    kcoreaddons-native \
    kconfig-native \
    kdoctools-native \
    kauth-native \
    karchive \
    kconfig \
    kcoreaddons \
    kdoctools \
    ki18n \
    kdelibs4support \
    khtml \
    knewstuff \
    kparts \
    kplotting \
    solid \
    kunitconversion \
    kwidgetsaddons \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "bbc13198d41f29c2ea399a8b4ab8f0f4c02f822250bb29079e4873ca68b3f41d"

FILES:${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
    ${datadir}/knsrcfiles \
    ${datadir}/libkdeedu \
"
