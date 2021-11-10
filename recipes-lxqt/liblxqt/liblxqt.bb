SUMMARY = "Core utility library for all LXQt components"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qttools libqtxdg kwindowsystem libxscrnsaver polkit-qt-1"

SRCREV = "08fff58a6d4aa9740d533d16f06b382fb1aa5858"
PV = "1.0.0"

EXTRA_OECMAKE += " \
    -DCMAKE_INSTALL_DATAROOTDIR=share \
    -DLXQT_ETC_XDG_DIR=${sysconfdir}/xdg \
"

# This is not the full truth but at least opkg terminates do_rootfs if there
# are multiple RCONFLICTS. To workaround we add the triple below to lxqt base
# library.
RPROVIDES:${PN} += "lxqt-common"
RREPLACES:${PN} += "lxqt-common"
RCONFLICTS:${PN} += "lxqt-common"

FILES:${PN} += " \
    ${datadir}/polkit-1/ \
    ${datadir}/lxqt/power.conf \
"
