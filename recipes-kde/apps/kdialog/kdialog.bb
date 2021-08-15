SUMMARY = "Tool to show nice dialog boxes from shell scripts"
LICENSE = "GPL-2.0-or-later & GFDL-1.3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=10b9de612d532fdeeb7fe8fcd1435cc6 \
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
SRC_URI[sha256sum] = "c01f85e383c11d65e55e83a25be39ee314f3bd9c5e3f02ba385f1c2dfa712db6"

FILES:${PN} += "${datadir}/dbus-1"
