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
SRC_URI[sha256sum] = "ac47479b576b87e8a82d62f4b685941b6ab54a44a06391c4c0762db159930589"

FILES:${PN} += "${datadir}/dbus-1"
