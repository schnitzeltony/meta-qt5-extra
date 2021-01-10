SUMMARY = "The image viewer and screenshot tool for LXQt"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt qt5-translation pkgconfig features_check gtk-icon-cache mime mime-xdg

DEPENDS += "qtx11extras qtsvg libfm-qt libexif libxfixes"

SRC_URI += " file://0001-HACK-fix-wrongly-included-native-QtCore-qconfig.h.patch"
SRCREV = "53099ed072a6194a2b673f69935a1da0d583532f"
PV = "0.16.0"

FILES_${PN} += "${datadir}/icons"
