SUMMARY = "The image viewer and screenshot tool for LXQt"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt pkgconfig distro_features_check gtk-icon-cache mime

DEPENDS += "qtx11extras qtsvg libfm-qt libexif libxfixes"

SRCREV = "a577151ae6935dfa890b961f2dff833d21e3a4a9"
PV = "0.7.0"

FILES_${PN} += "${datadir}/icons"
