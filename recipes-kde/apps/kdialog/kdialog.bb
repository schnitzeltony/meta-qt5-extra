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
SRC_URI[sha256sum] = "9aeb4da004608e7c8d9ae001b5921d6526c2ccba8c8782982a6c6247187c2a9c"

FILES:${PN} += "${datadir}/dbus-1"
