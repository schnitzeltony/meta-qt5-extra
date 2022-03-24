SUMMARY = "Tool to show nice dialog boxes from shell scripts"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
"

inherit kde-apps gettext

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    ktextwidgets \
    knotifications \
    kguiaddons \
    kiconthemes \
    kwindowsystem \
    kio \
    kdbusaddons \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "a370f03edd88913d7cecf2bc9b61e2bd1466418fa1534a8f415a0057186ea111"

FILES:${PN} += "${datadir}/dbus-1"
