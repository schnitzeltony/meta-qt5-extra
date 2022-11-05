SUMMARY = "Remote Desktop Client"
LICENSE = "BSD-3-Clause & GFDL-1.2-or-later & GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/GFDL-1.2-or-later.txt;md5=9a4c4207e152ff95aa8539e9c1ed53e9 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
"

inherit kde-apps mime-xdg

DEPENDS += " \
    kconfig-native \
    kcmutils-native \
    kdoctools-native \
    kcoreaddons-native \
    kauth-native \
    libvncserver \
    openssh \
    freerdp \
    kcmutils \
    kdnssd \
    knotifyconfig \
    knotifications \
    kbookmarks \
    kiconthemes \
    kxmlgui \
    kcompletion \
    kwallet \
    kwidgetsaddons \
    kwindowsystem \
    knotifyconfig \
    ki18n \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "379f3fab596a9f34755e8675bd0a904cae9453101d126ea723e6069bd7e3e040"

FILES:${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${datadir}/config.kcfg \
    ${datadir}/kio \
"
