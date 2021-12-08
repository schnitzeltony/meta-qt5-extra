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
    kdoctools-native \
    sonnet-native \
    kpackage-native \
    kcoreaddons-native \
    kauth-native \
    kconfig-native \
    kactivities \
    kactivities-stats \
    kirigami2 \
    kitemviews \
    kcmutils \
    ki18n \
    kio \
    kservice \
    kiconthemes \
    kwindowsystem \
    kxmlgui \
    kdbusaddons \
    kconfig \
    khtml \
    kdoctools \
    plasma-workspace \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "bcad3f487498d30b442d16c2abae63e279aa74199186c779e9f610fdfa2f5c59"

FILES:${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kpackage \
    ${datadir}/kglobalaccel \
    ${OE_QMAKE_PATH_PLUGINS} \
"
