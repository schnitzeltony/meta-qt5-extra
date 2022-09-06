SUMMARY = "KDE's terminal emulator"
LICENSE = "GPL-2.0-only & GFDL-1.2 & LGPL-2.0-only"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=d8855fca80aa0b428deafa405d0ea17a \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
"

inherit kde-apps gettext

DEPENDS += " \
    kauth-native \
    kbookmarks \
    kcompletion \
    kconfig \
    kconfig-native \
    kconfigwidgets \
    kcoreaddons \
    kcoreaddons-native \
    kdoctools \
    kdoctools-native \
    kguiaddons \
    ki18n \
    kiconthemes \
    kinit \
    kio \
    knotifications \
    knotifyconfig \
    kparts \
    kpty \
    kservice \
    ktextwidgets \
    kwidgetsaddons \
    kwindowsystem \
    kxmlgui \
    sonnet-native \
    knewstuff \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11", "", d)} \
"


PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "bbcc5ce567dbffaea6722fe43682b68f2b54bb6c6a2b6eeb2f4b86809d3551d6"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES:${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/khotkeys \
    ${datadir}/knsrcfiles \
    ${datadir}/kconf_update \
    ${datadir}/kio/servicemenus \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${libdir}/libkdeinit5_konsole.so \
    ${libdir}/kconf_update_bin \
"
