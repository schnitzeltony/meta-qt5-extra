SUMMARY = "KDE system settings"
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & LGPL-2.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/LGPL-2.0-only.txt;md5=da48810c4ddf8e49efa031294a26b98c \
"

inherit kde-plasma gettext

DEPENDS += " \
    sonnet-native \
    kpackage-native \
    kcoreaddons-native \
    kauth-native \
    kcmutils-native kcmutils \
    kconfig-native kconfig \
    kdoctools-native kdoctools \
    kactivities \
    kactivities-stats \
    kirigami2 \
    kitemviews \
    ki18n \
    kio \
    kservice \
    kiconthemes \
    kwindowsystem \
    kxmlgui \
    kdbusaddons \
    khtml \
    plasma-workspace \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "9b3db6b965c0780c5edd5a346d9e3951ec76b26d071237ece432d0ee561a078c"

FILES:${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kpackage \
    ${datadir}/kglobalaccel \
    ${OE_QMAKE_PATH_PLUGINS} \
"
