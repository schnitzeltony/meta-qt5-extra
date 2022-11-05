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
SRC_URI[sha256sum] = "9d1226e6e646a564ada1b218f70c98278c4ef4f118f55ca1e3e143698d016a8b"

FILES:${PN} += "${datadir}/dbus-1"
