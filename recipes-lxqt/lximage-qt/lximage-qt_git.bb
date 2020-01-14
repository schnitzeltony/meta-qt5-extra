SUMMARY = "The image viewer and screenshot tool for LXQt"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt pkgconfig features_check gtk-icon-cache mime mime-xdg

DEPENDS += "qtx11extras qtsvg libfm-qt libexif libxfixes"

SRC_URI += " file://0001-HACK-fix-wrongly-included-native-QtCore-qconfig.h.patch"
SRCREV = "6c2efe769d0514846c78e4a9147f3425440643ec"
PV = "0.14.1"

FILES_${PN} += "${datadir}/icons"
