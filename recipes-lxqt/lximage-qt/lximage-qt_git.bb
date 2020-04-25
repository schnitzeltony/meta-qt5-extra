SUMMARY = "The image viewer and screenshot tool for LXQt"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt pkgconfig features_check gtk-icon-cache mime mime-xdg

DEPENDS += "qtx11extras qtsvg libfm-qt libexif libxfixes"

SRC_URI += " file://0001-HACK-fix-wrongly-included-native-QtCore-qconfig.h.patch"
SRCREV = "de334fb9e0aa851bd1533a449c7bbee7a49511fe"
PV = "0.15.0"

FILES_${PN} += "${datadir}/icons"
